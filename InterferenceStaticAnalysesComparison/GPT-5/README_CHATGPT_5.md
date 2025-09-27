# Experimental Setup: Semantic Conflict Detection with ChatGPT-5

## Overview

This document describes the experimental methodology used to evaluate ChatGPT-5's performance on semantic conflict detection across 99 merge scenarios. We tested two conditions to assess the impact of providing human-crafted summaries on the model's ability to identify semantic conflicts.

## Experimental Conditions

### Condition 1: With Summary
- Included human-crafted summaries describing changes made by each developer
- CSV fields used: `Summary of changes made by left` and `Summary of changes made by right`

### Condition 2: Without Summary  
- Removed summary fields from the prompt
- Only provided raw modification information and line numbers

## Implementation Details

### Input Data
The experiment uses a CSV file (`cenarios.csv`) containing:
- `project`: GitHub project name
- `merge commit`: Commit hash
- `className`: Java class name
- `method`: Method name
- `left modifications`: Lines modified by left developer
- `right modifications`: Lines modified by right developer
- `Summary of changes made by left`: Human-crafted summary (used only in Condition 1)
- `Summary of changes made by right`: Human-crafted summary (used only in Condition 1)
- `LOI`: Location of Interest

### Code Workflow

1. **Data Loading**: Reads scenarios from the input CSV file
2. **Code Fetching**: Retrieves the complete `merge.java` file from GitHub repository using the merge dataset
3. **Prompt Construction**: Builds a detailed prompt including:
   - Semantic conflict definition
   - Developer changes information
   - Complete code context
   - Analysis instructions
4. **GPT API Call**: Sends prompt to ChatGPT API with retry logic
5. **Response Processing**: Parses JSON response to extract conflict decision and explanation
6. **Result Storage**: Saves results to output CSV files

### Prompt Structure

The prompt includes:

```
You are a software engineering expert. Your task is to determine if there is a semantic merge conflict
in a scenario where two developers have independently modified a base program.

Step 1: Analyze the changes.
- Carefully read and understand the changes made by the LEFT developer.
- Carefully read and understand the changes made by the RIGHT developer.
- Summarize in your own words what each change does and its potential effect on the program behavior.

Step 2: Evaluate semantic conflict.
- Definition: Separate changes Left and Right to a base program B interfere when integrated changes do not preserve the altered behavior of the left or right, or the unchanged behavior of the base.
- Separate changes L and R to a base program B interfere if there is a state element x such that B, L and R compute different values for x.
- Separate changes L and R to a base program B interfere if there is a state element x such that L (or R) computes a differente value for x than B and Merge
-Separate changes L and R to a base program B interfere if there is a state element x such that B, L and R compute the same value for x but Merge computes a differente value.
- Consider the context of the entire method and class, not just the modified lines.
- Consider the overall program behavior, not just syntactic changes.
- Consider refactorings as non-conflicting.

Scenario information:
- Project: {project}
- Merge commit: {commit}
- Class: {class_name}
- Method: {method_name}
- LEFT developer changes:
- Modified lines: {row['left modifications']}
- Summary: {row['Summary of changes made by left']}
- RIGHT developer changes:
- Modified lines: {row['right modifications']}
- Summary: {row['Summary of changes made by right']}
- Location of interest (LOI): {row['LOI']}

Original code context:
java
{code}

Question:
Is there a semantic conflict between these changes?
Answer in JSON format:
{
"conflict": true|false,
"explanation": "brief explanation"
}
```

### Key Features

- **Robust Code Fetching**: Handles various repository structures with custom path mappings
- **Error Handling**: Implements retry logic with exponential backoff for API failures
- **Comprehensive Logging**: Saves both prompts and responses for reproducibility
- **Rate Limiting**: Includes delays to respect API limits

## Output Files

1. **results.csv**: Main results with conflict decisions and explanations
2. **prompts_responses.csv**: Complete prompts and raw API responses for audit trail

## Running the Experiment

### For Condition 1 (With Summary):
Run the script with the original CSV containing summary fields.

### For Condition 2 (Without Summary):
Modify the prompt construction to exclude the summary lines:
```python
# Remove or comment out these lines from the prompt:
# - Summary: {row['Summary of changes made by left']}
# - Summary: {row['Summary of changes made by right']}
```
