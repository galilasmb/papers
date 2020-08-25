/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 18:30:01 GMT 2020
 */

package com.netflix.simianarmy.basic.janitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.amazonaws.regions.RegionMetadata;
import com.amazonaws.regions.RegionUtils;
import com.netflix.simianarmy.MonkeyCalendar;
import com.netflix.simianarmy.MonkeyConfiguration;
import com.netflix.simianarmy.MonkeyRecorder;
import com.netflix.simianarmy.aws.janitor.ASGJanitor;
import com.netflix.simianarmy.aws.janitor.EBSSnapshotJanitor;
import com.netflix.simianarmy.aws.janitor.EBSVolumeJanitor;
import com.netflix.simianarmy.aws.janitor.ImageJanitor;
import com.netflix.simianarmy.aws.janitor.InstanceJanitor;
import com.netflix.simianarmy.aws.janitor.LaunchConfigJanitor;
import com.netflix.simianarmy.aws.janitor.SimpleDBJanitorResourceTracker;
import com.netflix.simianarmy.basic.BasicSimianArmyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorEmailBuilder;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext;
import com.netflix.simianarmy.client.edda.EddaClient;
import com.netflix.simianarmy.janitor.AbstractJanitor;
import com.netflix.simianarmy.janitor.JanitorCrawler;
import com.netflix.simianarmy.janitor.JanitorEmailBuilder;
import com.netflix.simianarmy.janitor.JanitorEmailNotifier;
import com.netflix.simianarmy.janitor.JanitorResourceTracker;
import com.netflix.simianarmy.janitor.JanitorRuleEngine;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicJanitorMonkeyContext_ESTest extends BasicJanitorMonkeyContext_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getImageJanitor();
      } catch(RuntimeException e) {
         //
         // Image Janitor only works when Edda is enabled.
         //
         verifyException("com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = basicJanitorMonkeyContext0.GLOBAL_OWNER_TAGKEY;
      String string0 = basicJanitorMonkeyContext0.getEventReport();
      BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = basicJanitorMonkeyContext0.sourceEmail;
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
      basicJanitorMonkeyContext0.resetEventReport();
      EddaClient eddaClient1 = basicJanitorMonkeyContext0.createEddaClient();
      EBSSnapshotJanitor eBSSnapshotJanitor0 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
      JanitorEmailNotifier janitorEmailNotifier0 = basicJanitorMonkeyContext0.emailNotifier();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/server/.aws/config");
      boolean boolean0 = false;
      boolean boolean1 = false;
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
      LaunchConfigJanitor launchConfigJanitor0 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
      BasicJanitorEmailBuilder basicJanitorEmailBuilder0 = new BasicJanitorEmailBuilder();
      basicJanitorMonkeyContext0.janitorEmailBuilder = (JanitorEmailBuilder) basicJanitorEmailBuilder0;
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      ASGJanitor aSGJanitor0 = basicJanitorMonkeyContext0.getASGJanitor();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getImageJanitor();
      } catch(RuntimeException e) {
         //
         // Image Janitor only works when Edda is enabled.
         //
         verifyException("com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      ASGJanitor aSGJanitor0 = basicJanitorMonkeyContext0.getASGJanitor();
      EBSVolumeJanitor eBSVolumeJanitor0 = basicJanitorMonkeyContext0.getEBSVolumeJanitor();
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      String string0 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      BasicJanitorEmailBuilder basicJanitorEmailBuilder0 = (BasicJanitorEmailBuilder)basicJanitorMonkeyContext0.janitorEmailBuilder;
      basicJanitorMonkeyContext0.janitorEmailBuilder = (JanitorEmailBuilder) basicJanitorEmailBuilder0;
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      List<AbstractJanitor> list1 = basicJanitorMonkeyContext0.janitors();
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
      InstanceJanitor instanceJanitor0 = basicJanitorMonkeyContext0.getInstanceJanitor();
      EBSSnapshotJanitor eBSSnapshotJanitor0 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
      Set<String> set0 = basicJanitorMonkeyContext0.getEnabledResourceSet();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getImageJanitor();
      } catch(RuntimeException e) {
         //
         // Image Janitor only works when Edda is enabled.
         //
         verifyException("com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier janitorEmailNotifier0 = basicJanitorMonkeyContext0.emailNotifier();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      LaunchConfigJanitor launchConfigJanitor0 = basicJanitorMonkeyContext0.getLaunchConfigJanitor();
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorCrawler janitorCrawler0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
      String string0 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext1 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorCrawler janitorCrawler0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorCrawler janitorCrawler0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
      String string0 = "b145";
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext1 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorMonkeyContext_BasicJanitorContext0.ruleEngine, basicJanitorMonkeyContext_BasicJanitorContext0.crawler, basicJanitorMonkeyContext_BasicJanitorContext0.resourceTracker, basicJanitorMonkeyContext_BasicJanitorContext0.calendar, basicJanitorMonkeyContext_BasicJanitorContext0.config, monkeyRecorder0);
      MonkeyRecorder monkeyRecorder1 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext0.resourceTracker();
      EBSVolumeJanitor eBSVolumeJanitor0 = basicJanitorMonkeyContext0.getEBSVolumeJanitor();
      JanitorCrawler janitorCrawler1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      JanitorRuleEngine janitorRuleEngine0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorRuleEngine();
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      RegionMetadata regionMetadata0 = mock(RegionMetadata.class, new ViolatedAssumptionAnswer());
      RegionUtils.initializeWithMetadata(regionMetadata0);
      EBSSnapshotJanitor eBSSnapshotJanitor0 = basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
      basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker0;
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getASGJanitor();
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      LinkedList<AbstractJanitor> linkedList0 = new LinkedList<AbstractJanitor>();
      basicJanitorMonkeyContext0.janitors = (List<AbstractJanitor>) linkedList0;
      InstanceJanitor instanceJanitor0 = basicJanitorMonkeyContext0.getInstanceJanitor();
      String string0 = "N";
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = (SimpleDBJanitorResourceTracker)basicJanitorMonkeyContext0.janitorResourceTracker;
      basicJanitorMonkeyContext0.janitorResourceTracker = (JanitorResourceTracker) simpleDBJanitorResourceTracker0;
      BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = string0;
      RegionMetadata regionMetadata0 = mock(RegionMetadata.class, new ViolatedAssumptionAnswer());
      RegionUtils.initializeWithMetadata(regionMetadata0);
      basicJanitorMonkeyContext0.resetEventReport();
      RegionMetadata regionMetadata1 = mock(RegionMetadata.class, new ViolatedAssumptionAnswer());
      RegionUtils.initializeWithMetadata(regionMetadata1);
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      Set<String> set0 = basicJanitorMonkeyContext0.getEnabledResourceSet();
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      String string1 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      basicJanitorMonkeyContext0.monkeyCalendar = basicJanitorMonkeyContext_BasicJanitorContext0.calendar;
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
      JanitorRuleEngine janitorRuleEngine0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorRuleEngine();
      MonkeyConfiguration monkeyConfiguration1 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      EddaClient eddaClient1 = basicJanitorMonkeyContext0.createEddaClient();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getLaunchConfigJanitor();
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      Set<String> set0 = basicJanitorMonkeyContext0.getEnabledResourceSet();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      RegionMetadata regionMetadata0 = mock(RegionMetadata.class, new ViolatedAssumptionAnswer());
      RegionUtils.initializeWithMetadata(regionMetadata0);
      String string0 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      EddaClient eddaClient0 = basicJanitorMonkeyContext0.createEddaClient();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      basicJanitorMonkeyContext0.monkeyRegion = basicJanitorMonkeyContext_BasicJanitorContext0.region;
      MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      Set<String> set1 = basicJanitorMonkeyContext0.getEnabledResourceSet();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getInstanceJanitor();
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      RegionMetadata regionMetadata0 = mock(RegionMetadata.class, new ViolatedAssumptionAnswer());
      BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = basicJanitorMonkeyContext0.defaultEmail;
      RegionUtils.initializeWithMetadata(regionMetadata0);
      Set<String> set0 = basicJanitorMonkeyContext0.getEnabledResourceSet();
      JanitorResourceTracker janitorResourceTracker0 = null;
      basicJanitorMonkeyContext0.janitorResourceTracker = janitorResourceTracker0;
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getEBSVolumeJanitor();
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      String string0 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      basicJanitorMonkeyContext0.janitorResourceTracker = basicJanitorMonkeyContext_BasicJanitorContext0.resourceTracker;
      basicJanitorMonkeyContext0.monkeyCalendar = basicJanitorMonkeyContext_BasicJanitorContext0.calendar;
      ArrayList<AbstractJanitor> arrayList0 = new ArrayList<AbstractJanitor>();
      // Undeclared exception!
      try { 
        basicJanitorMonkeyContext0.getEBSSnapshotJanitor();
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }
}