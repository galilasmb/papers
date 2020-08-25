/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 22:36:04 GMT 2020
 */

package quickdt.experiments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import quickdt.data.AbstractInstance;
import quickdt.data.HashMapAttributes;
import quickdt.data.Instance;
import quickdt.experiments.OutOfTimeCrossValidatorRunner;
import quickdt.predictiveModels.PredictiveModelBuilder;
import quickdt.predictiveModels.decisionTree.scorers.MSEScorer;
import quickdt.predictiveModels.randomForest.RandomForest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutOfTimeCrossValidatorRunner_ESTest extends OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      Stack<AbstractInstance> stack0 = new Stack<AbstractInstance>();
      int int0 = (-19);
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(stack0, int0, int0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      String string0 = "";
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      int int0 = 2305;
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Stack<AbstractInstance> stack0 = new Stack<AbstractInstance>();
      int int0 = 0;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(stack0, int0, int0);
      } catch(IllegalArgumentException e) {
         //
         // We must have at least one tree
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      int int0 = 0;
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      Stack<AbstractInstance> stack0 = new Stack<AbstractInstance>();
      int int0 = 0;
      int int1 = (-777);
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(stack0, int0, int1);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      int int0 = (-1204);
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      int int1 = 0;
      PredictiveModelBuilder predictiveModelBuilder1 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int1, int1);
      String[] stringArray0 = new String[5];
      String string0 = "_jJ{4";
      stringArray0[0] = string0;
      String string1 = "";
      stringArray0[1] = string1;
      String string2 = "";
      stringArray0[2] = string2;
      String string3 = "com.google.common.io.PatternFilenameFilter";
      stringArray0[3] = string3;
      String string4 = "";
      stringArray0[4] = string4;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      int int0 = (-2909);
      int int1 = (-1196);
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int1);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      int int0 = (-1082);
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      ArrayList<AbstractInstance> arrayList0 = new ArrayList<AbstractInstance>();
      HashSet<Instance> hashSet0 = new HashSet<Instance>();
      HashMapAttributes hashMapAttributes0 = new HashMapAttributes();
      MSEScorer.CrossValidationCorrection mSEScorer_CrossValidationCorrection0 = MSEScorer.CrossValidationCorrection.FALSE;
      MSEScorer.CrossValidationCorrection mSEScorer_CrossValidationCorrection1 = MSEScorer.CrossValidationCorrection.TRUE;
      EnumSet<MSEScorer.CrossValidationCorrection> enumSet0 = EnumSet.of(mSEScorer_CrossValidationCorrection0, mSEScorer_CrossValidationCorrection1);
      Instance instance0 = hashMapAttributes0.classification(enumSet0);
      boolean boolean0 = hashSet0.add(instance0);
      Object object0 = arrayList0.clone();
      boolean boolean1 = arrayList0.addAll((Collection<? extends AbstractInstance>) hashSet0);
      int int1 = 0;
      int int2 = 1040;
      RandomForest randomForest0 = OutOfTimeCrossValidatorRunner.getRandomForest(arrayList0, int1, int2);
      int int3 = 0;
      PredictiveModelBuilder predictiveModelBuilder1 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int3, int2);
      String[] stringArray0 = new String[8];
      String string0 = "";
      stringArray0[0] = string0;
      String string1 = "=Su4A8lB>n<";
      stringArray0[1] = string1;
      String string2 = "B,#G\"_M>|:6W'|o\";";
      stringArray0[2] = string2;
      String string3 = "BtO";
      stringArray0[3] = string3;
      String string4 = "M`G8858i$Ovdi$.";
      stringArray0[4] = string4;
      String string5 = ",<i^2^Y.^oc";
      stringArray0[5] = string5;
      String string6 = "-}P!9";
      stringArray0[6] = string6;
      String string7 = "LFxC\\'Nz. f";
      stringArray0[7] = string7;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      List<AbstractInstance> list0 = null;
      int int1 = 2346;
      int int2 = 1399;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(list0, int1, int2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Iterables", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      Vector<AbstractInstance> vector0 = new Vector<AbstractInstance>();
      int int0 = 40100;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.getRandomForest(vector0, int0, int0);
  }
}