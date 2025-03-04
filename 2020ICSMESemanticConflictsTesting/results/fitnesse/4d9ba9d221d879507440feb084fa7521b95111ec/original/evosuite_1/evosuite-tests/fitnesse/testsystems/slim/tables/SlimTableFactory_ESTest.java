/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 28 22:57:20 GMT 2020
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.ExecutionResult;
import fitnesse.testsystems.TestResult;
import fitnesse.testsystems.TestSummary;
import fitnesse.testsystems.slim.HtmlTable;
import fitnesse.testsystems.slim.SlimTestContext;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.results.SlimTestResult;
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.DynamicDecisionTable;
import fitnesse.testsystems.slim.tables.ImportTable;
import fitnesse.testsystems.slim.tables.LibraryTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.QueryTable;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.SlimErrorTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.htmlparser.Node;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Hashtable<String, Class<DynamicDecisionTable>> hashtable0 = new Hashtable<String, Class<DynamicDecisionTable>>();
      String string0 = "";
      Class<DynamicDecisionTable> class0 = DynamicDecisionTable.class;
      Class<DynamicDecisionTable> class1 = hashtable0.put(string0, class0);
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      Map<String, String> map0 = slimTableFactory1.tableTypeArrays;
      slimTableFactory2.tableTypeArrays = map0;
      Class<DecisionTable> class2 = DecisionTable.class;
      Table table0 = null;
      String string1 = "";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string2 = "";
      String string3 = slimTableFactory1.getFullTableName(string2);
      SlimTable slimTable0 = slimTableFactory2.newTableForType(class2, table0, string1, slimTestContextImpl0);
      String string4 = "w#";
      String string5 = slimTableFactory1.getFullTableName(string4);
      String string6 = "N";
      Class<? extends SlimTable> class3 = slimTableFactory0.getTableType(string6);
      Class<DecisionTable> class4 = DecisionTable.class;
      String string7 = "@ELhI6I |c";
      String string8 = "";
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string8, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Table table0 = null;
      int int0 = (-1647);
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeRow(table0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      HashMap<String, Class<SubsetQueryTable>> hashMap0 = new HashMap<String, Class<SubsetQueryTable>>();
      Set<Map.Entry<String, Class<SubsetQueryTable>>> set0 = hashMap0.entrySet();
      String string0 = "pseudoclasses not implemented yet";
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      Class<SubsetQueryTable> class1 = hashMap0.put(string0, class0);
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = ":";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      String string1 = "dt:";
      String string2 = slimTableFactory1.makeTableType(string1);
      TableTag tableTag0 = new TableTag();
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "as8|PGk~m8wr.L7;7/";
      String string1 = slimTableFactory1.makeTableType(string0);
      String string2 = slimTableFactory1.getFullTableName(string0);
      Table.CellContentSubstitution table_CellContentSubstitution0 = mock(Table.CellContentSubstitution.class, new ViolatedAssumptionAnswer());
      slimTableFactory1.tableTypeArrays = slimTableFactory0.tableTypeArrays;
      String string3 = null;
      Class<QueryTable> class0 = QueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory1.addTableType(string3, class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "CF:.FdU^uNJl";
      String string1 = slimTableFactory0.getFullTableName(string0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap0;
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "subset query:";
      Class<ImportTable> class0 = ImportTable.class;
      String string1 = "a^";
      String string2 = "java.nio.charset.Charset";
      String string3 = "";
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'subset query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "J";
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap0;
      String string1 = hashMap0.put(string0, string0);
      String string2 = slimTableFactory0.getFullTableName(string0);
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string3 = slimTableFactory0.getFullTableName(string0);
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      slimTableFactory0.addTableType(string2, class0);
      SlimTableFactory slimTableFactory2 = slimTableFactory0.copy();
      TableTag tableTag0 = new TableTag();
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "~\\UQ$qz2z+}t";
      String string1 = slimTableFactory0.getFullTableName(string0);
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "org.eclipse.jgit.revwalk.AbstractRevQueue";
      String string1 = slimTableFactory0.getFullTableName(string0);
      String string2 = "comment";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string2);
      String string3 = "Yf^5:Pp-{&VP_`#y?";
      boolean boolean0 = slimTableFactory0.hasColon(string3);
      String string4 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.getTableType(string4);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "ap-L<F@T";
      String string1 = slimTableFactory0.getFullTableName(string0);
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string0);
      String string2 = slimTableFactory0.makeTableType(string0);
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string3 = null;
      // Undeclared exception!
      try { 
        slimTableFactory1.hasColon(string3);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "mlZwW@";
      Table table0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      Class<SlimErrorTable> class0 = SlimErrorTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      Table table0 = null;
      int int0 = 3532;
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeRow(table0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.getFullTableName(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<QueryTable> class0 = QueryTable.class;
      Table table0 = null;
      String string0 = "b30^SMGi+h";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      ScenarioTable scenarioTable0 = null;
      slimTestContextImpl0.addScenario(string0, scenarioTable0);
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string0, slimTestContextImpl0);
      Class<? extends SlimTable> class1 = slimTableFactory0.getTableType(string0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string1 = slimTableFactory0.makeTableType(string0);
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap0;
      String string2 = "org.eclipse.jgit.api.CheckoutCommand$Stage";
      String string3 = slimTableFactory0.getFullTableName(string2);
      String string4 = slimTableFactory0.getFullTableName(string0);
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      // Undeclared exception!
      try { 
        slimTableFactory1.parseDefineTableTypeTable(table0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = null;
      // Undeclared exception!
      try { 
        slimTableFactory0.makeTableType(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      TableTag tableTag0 = new TableTag();
      String string0 = "ddt:";
      NodeList nodeList0 = tableTag0.searchFor(string0);
      boolean boolean0 = nodeList0.remove((Node) tableTag0);
      tableTag0.setChildren(nodeList0);
      Map<String, Class<ScenarioTable>> map0 = null;
      slimTableFactory0.tableTypes = map0;
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      int int0 = (-416);
      // Undeclared exception!
      try { 
        slimTableFactory0.parseDefineTableTypeRow(htmlTable0, int0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "T";
      String string1 = "";
      Class<? extends SlimTable> class0 = slimTableFactory0.getTableType(string1);
      Table table0 = null;
      String string2 = "table:";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      SlimTable slimTable0 = slimTableFactory0.newTableForType(class0, table0, string2, slimTestContextImpl0);
      Class<QueryTable> class1 = QueryTable.class;
      Hashtable<String, Class<DecisionTable>> hashtable0 = new Hashtable<String, Class<DecisionTable>>();
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
      slimTableFactory0.addTableType(string0, class1);
      slimTestContextImpl0.clearTestSummary();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      TableTag tableTag0 = new TableTag();
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      String string0 = "subset query:";
      Class<ImportTable> class0 = ImportTable.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string1 = "a^";
      String string2 = hashMap0.put(string0, string1);
      slimTableFactory0.tableTypeArrays = (Map<String, String>) hashMap0;
      String string3 = "java.nio.charset.Charset";
      String string4 = "";
      String string5 = hashMap0.put(string4, string2);
      String string6 = hashMap0.replace(string1, string3);
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType(string0, class0);
      } catch(IllegalStateException e) {
         //
         // A table type named 'subset query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Hashtable<String, Class<DynamicDecisionTable>> hashtable0 = new Hashtable<String, Class<DynamicDecisionTable>>();
      String string0 = "";
      Class<DynamicDecisionTable> class0 = DynamicDecisionTable.class;
      Class<DynamicDecisionTable> class1 = hashtable0.put(string0, class0);
      slimTableFactory0.tableTypes = (Map<String, Class<? extends SlimTable>>) hashtable0;
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      SlimTableFactory slimTableFactory2 = slimTableFactory1.copy();
      Map<String, String> map0 = slimTableFactory1.tableTypeArrays;
      slimTableFactory2.tableTypeArrays = map0;
      Class<DecisionTable> class2 = DecisionTable.class;
      Table table0 = null;
      String string1 = "";
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      String string2 = "";
      String string3 = slimTableFactory1.getFullTableName(string2);
      SlimTable slimTable0 = slimTableFactory2.newTableForType(class2, table0, string1, slimTestContextImpl0);
      String string4 = "w#";
      String string5 = slimTableFactory1.getFullTableName(string4);
      String string6 = "";
      Class<? extends SlimTable> class3 = slimTableFactory0.getTableType(string6);
      Class<DecisionTable> class4 = DecisionTable.class;
      String string7 = "@ELhI6I |c";
      SlimTable slimTable1 = slimTableFactory0.newTableForType(class4, table0, string7, slimTestContextImpl0);
      String string8 = "";
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(table0, string8, slimTestContextImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      String string0 = "as8|PGk~m8wr.L7;7/";
      TableTag tableTag0 = new TableTag();
      String string1 = slimTableFactory1.makeTableType(string0);
      String string2 = slimTableFactory1.getFullTableName(string0);
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }
}
