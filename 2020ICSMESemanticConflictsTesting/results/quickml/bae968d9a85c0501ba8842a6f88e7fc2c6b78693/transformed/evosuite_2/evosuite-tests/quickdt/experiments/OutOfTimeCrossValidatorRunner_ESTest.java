/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 22:39:07 GMT 2020
 */

package quickdt.experiments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import quickdt.data.AbstractInstance;
import quickdt.data.HashMapAttributes;
import quickdt.data.Instance;
import quickdt.experiments.OutOfTimeCrossValidatorRunner;
import quickdt.predictiveModels.PredictiveModelBuilder;
import quickdt.predictiveModels.randomForest.RandomForest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutOfTimeCrossValidatorRunner_ESTest extends OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Vector<AbstractInstance> vector0 = new Vector<AbstractInstance>();
      int int0 = (-2118);
      int int1 = 0;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(vector0, int0, int1);
      } catch(IllegalArgumentException e) {
         //
         // We must have at least one tree
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
      int int0 = 0;
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      int int1 = 30;
      System.setCurrentTimeMillis(int0);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = null;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
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
      int int0 = (-549);
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = "FALSE";
      stringArray0[0] = string0;
      String string1 = "users_favorite_beer_id";
      stringArray0[1] = string1;
      String string2 = "c6z?$-XxNB[5Dgi`w";
      stringArray0[2] = string2;
      String string3 = "\\9'BzDqF-";
      stringArray0[3] = string3;
      String string4 = "x=T";
      stringArray0[4] = string4;
      String string5 = "minScore";
      stringArray0[5] = string5;
      String string6 = "J";
      stringArray0[6] = string6;
      String string7 = "CrVG";
      stringArray0[7] = string7;
      String string8 = "uqJ@]|:_]qo";
      stringArray0[8] = string8;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      int int0 = 3;
      PredictiveModelBuilder predictiveModelBuilder0 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int0, int0);
      int int1 = 0;
      PredictiveModelBuilder predictiveModelBuilder1 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int1, int0);
      int int2 = 0;
      PredictiveModelBuilder predictiveModelBuilder2 = OutOfTimeCrossValidatorRunner.getRandomForestBuilder(int1, int2);
      List<AbstractInstance> list0 = null;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(list0, int2, int1);
      } catch(IllegalArgumentException e) {
         //
         // We must have at least one tree
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      List<AbstractInstance> list0 = null;
      int int0 = 1;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(list0, int0, int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Iterables", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      ArrayList<AbstractInstance> arrayList0 = new ArrayList<AbstractInstance>();
      int int0 = 2;
      int int1 = 0;
      // Undeclared exception!
      try { 
        OutOfTimeCrossValidatorRunner.getRandomForest(arrayList0, int0, int1);
      } catch(IllegalArgumentException e) {
         //
         // We must have at least one tree
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      LinkedList<AbstractInstance> linkedList0 = new LinkedList<AbstractInstance>();
      int int0 = 2;
      int int1 = 1;
      Serializable[] serializableArray0 = new Serializable[0];
      Instance instance0 = Instance.create((Serializable) linkedList0, serializableArray0);
      boolean boolean0 = linkedList0.add((AbstractInstance) instance0);
      RandomForest randomForest0 = OutOfTimeCrossValidatorRunner.getRandomForest(linkedList0, int0, int1);
      RandomForest randomForest1 = OutOfTimeCrossValidatorRunner.getRandomForest(linkedList0, int0, int1);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Vector<AbstractInstance> vector0 = new Vector<AbstractInstance>();
      int int0 = 60000;
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.getRandomForest(vector0, int0, int0);
  }
}
