/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 21:15:59 GMT 2020
 */

package com.netflix.simianarmy.basic.janitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.auth.WebIdentityFederationSessionCredentialsProvider;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.KMSEncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.netflix.simianarmy.MonkeyCalendar;
import com.netflix.simianarmy.MonkeyConfiguration;
import com.netflix.simianarmy.MonkeyRecorder;
import com.netflix.simianarmy.Resource;
import com.netflix.simianarmy.ResourceType;
import com.netflix.simianarmy.aws.AWSResource;
import com.netflix.simianarmy.aws.AWSResourceType;
import com.netflix.simianarmy.aws.SimpleDBRecorder;
import com.netflix.simianarmy.aws.janitor.SimpleDBJanitorResourceTracker;
import com.netflix.simianarmy.aws.janitor.crawler.ASGJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.EBSSnapshotJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.InstanceJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.LaunchConfigJanitorCrawler;
import com.netflix.simianarmy.basic.BasicCalendar;
import com.netflix.simianarmy.basic.BasicChaosMonkeyContext;
import com.netflix.simianarmy.basic.BasicConfiguration;
import com.netflix.simianarmy.basic.BasicSimianArmyContext;
import com.netflix.simianarmy.basic.LocalDbRecorder;
import com.netflix.simianarmy.basic.conformity.BasicConformityMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkey;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorRuleEngine;
import com.netflix.simianarmy.basic.janitor.BasicVolumeTaggingMonkeyContext;
import com.netflix.simianarmy.client.aws.AWSClient;
import com.netflix.simianarmy.janitor.AbstractJanitor;
import com.netflix.simianarmy.janitor.JanitorCrawler;
import com.netflix.simianarmy.janitor.JanitorEmailNotifier;
import com.netflix.simianarmy.janitor.JanitorResourceTracker;
import com.netflix.simianarmy.janitor.JanitorRuleEngine;
import com.netflix.simianarmy.janitor.Rule;
import java.io.File;
import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicJanitorMonkeyContext_ESTest extends BasicJanitorMonkeyContext_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      AWSClient aWSClient0 = null;
      EBSSnapshotJanitorCrawler eBSSnapshotJanitorCrawler0 = null;
      try {
        eBSSnapshotJanitorCrawler0 = new EBSSnapshotJanitorCrawler(aWSClient0);
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      String string0 = "]T.)Tx+iv1z 9!5=4+";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      Rule rule0 = null;
      BasicJanitorRuleEngine basicJanitorRuleEngine1 = basicJanitorRuleEngine0.addRule(rule0);
      EnvironmentVariableCredentialsProvider environmentVariableCredentialsProvider0 = new EnvironmentVariableCredentialsProvider();
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      ClientConfiguration clientConfiguration1 = new ClientConfiguration(clientConfiguration0);
      long long0 = 0L;
      ClientConfiguration clientConfiguration2 = clientConfiguration0.withConnectionTTL(long0);
      AWSClient aWSClient0 = new AWSClient(string0, environmentVariableCredentialsProvider0, clientConfiguration1);
      InstanceJanitorCrawler instanceJanitorCrawler0 = new InstanceJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      MonkeyConfiguration monkeyConfiguration0 = null;
      AWSResourceType aWSResourceType0 = AWSResourceType.EBS_SNAPSHOT;
      List<Resource> list0 = instanceJanitorCrawler0.resources((ResourceType) aWSResourceType0);
      clientConfiguration1.setResponseMetadataCacheSize(clientConfiguration0.DEFAULT_MAX_CONNECTIONS);
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(monkeyConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine1, instanceJanitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, localDbRecorder0);
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
      MonkeyConfiguration monkeyConfiguration1 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      String string1 = basicJanitorMonkeyContext0.getEventReport();
      List<AbstractJanitor> list1 = basicJanitorMonkeyContext0.janitors();
      String string2 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      BasicJanitorRuleEngine basicJanitorRuleEngine2 = basicJanitorRuleEngine0.addRule(rule0);
      String string3 = basicJanitorMonkeyContext0.getEventReport();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
      JanitorCrawler janitorCrawler0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
      MonkeyCalendar monkeyCalendar1 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      MonkeyCalendar monkeyCalendar2 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
      List<AbstractJanitor> list2 = basicJanitorMonkeyContext0.janitors();
      String string4 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
      MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
      JanitorRuleEngine janitorRuleEngine0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorRuleEngine();
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      String string0 = "simianarmy.janitor.rule.suspendedASGRule.enabled";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      AWSCredentialsProvider[] aWSCredentialsProviderArray0 = null;
      AWSCredentialsProviderChain aWSCredentialsProviderChain0 = null;
      try {
        aWSCredentialsProviderChain0 = new AWSCredentialsProviderChain(aWSCredentialsProviderArray0);
      } catch(IllegalArgumentException e) {
         //
         // No credential providers specified
         //
         verifyException("com.amazonaws.auth.AWSCredentialsProviderChain", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      String string0 = "V";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = "CUkrNm";
      String string2 = "simianarmy.janitor.rule.noGeneratedAMIRule.enabled";
      String string3 = "";
      WebIdentityFederationSessionCredentialsProvider webIdentityFederationSessionCredentialsProvider0 = new WebIdentityFederationSessionCredentialsProvider(string2, string2, string3);
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string1, webIdentityFederationSessionCredentialsProvider0, clientConfiguration0);
      LaunchConfigJanitorCrawler launchConfigJanitorCrawler0 = new LaunchConfigJanitorCrawler(aWSClient0);
      String string4 = "simianarmy.janitor.rule.noGeneratedAMIRule.retentionDays";
      AWSClient aWSClient1 = new AWSClient(string4, clientConfiguration0);
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = new SimpleDBJanitorResourceTracker(aWSClient1, string2);
      BasicVolumeTaggingMonkeyContext basicVolumeTaggingMonkeyContext0 = new BasicVolumeTaggingMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicVolumeTaggingMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(monkeyConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, launchConfigJanitorCrawler0, simpleDBJanitorResourceTracker0, basicCalendar0, monkeyConfiguration0, localDbRecorder0);
      MonkeyConfiguration monkeyConfiguration1 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      String string0 = "";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      AWSClient aWSClient0 = null;
      InstanceJanitorCrawler instanceJanitorCrawler0 = null;
      try {
        instanceJanitorCrawler0 = new InstanceJanitorCrawler(aWSClient0);
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      String string0 = null;
      JanitorRuleEngine janitorRuleEngine0 = null;
      ClasspathPropertiesFileCredentialsProvider classpathPropertiesFileCredentialsProvider0 = null;
      try {
        classpathPropertiesFileCredentialsProvider0 = new ClasspathPropertiesFileCredentialsProvider(string0);
      } catch(IllegalArgumentException e) {
         //
         // Credentials file path cannot be null
         //
         verifyException("com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider", e);
      }
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context1 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      AWSClient aWSClient0 = null;
      ASGJanitorCrawler aSGJanitorCrawler0 = null;
      try {
        aSGJanitorCrawler0 = new ASGJanitorCrawler(aWSClient0);
      } catch(IllegalArgumentException e) {
         //
         // The validated object is null
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      String string0 = "com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext$BasicJanitorContext";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = "";
      SystemPropertiesCredentialsProvider systemPropertiesCredentialsProvider0 = new SystemPropertiesCredentialsProvider();
      // Undeclared exception!
      try { 
        systemPropertiesCredentialsProvider0.getCredentials();
      } catch(RuntimeException e) {
         //
         // Unable to load AWS credentials from Java system properties (aws.accessKeyId and aws.secretKey)
         //
         verifyException("com.amazonaws.auth.SystemPropertiesCredentialsProvider", e);
      }
  }

  @Test(timeout = 11000)
  public void test8()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      String string0 = "r]{%92=#.e0:I u;dG";
      BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = string0;
      JanitorEmailNotifier janitorEmailNotifier0 = basicJanitorMonkeyContext0.emailNotifier();
  }
}