/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 21:39:15 GMT 2020
 */

package com.metamx.druid.loading;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.metamx.druid.client.DataSegment;
import com.metamx.druid.loading.S3SegmentPusher;
import com.metamx.druid.loading.S3SegmentPusherConfig;
import com.metamx.druid.shard.NoneShardSpec;
import com.metamx.druid.shard.ShardSpec;
import com.metamx.druid.shard.SingleDimensionShardSpec;
import com.metamx.emitter.service.ServiceMetricEvent;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.apache.commons.httpclient.auth.CredentialsProvider;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.deser.StdDeserializerProvider;
import org.codehaus.jackson.map.ser.StdSerializerProvider;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.BigIntegerNode;
import org.codehaus.jackson.node.NumericNode;
import org.codehaus.jackson.util.BufferRecycler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.pager.PageControl;
import org.hyperic.sigar.pager.PageList;
import org.hyperic.sigar.pager.StaticPageFetcher;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.handler.codec.http.DefaultHttpChunkTrailer;
import org.jets3t.service.acl.AccessControlList;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.model.MultipartUpload;
import org.jets3t.service.security.AWSDevPayCredentials;
import org.jets3t.service.security.ProviderCredentials;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class S3SegmentPusher_ESTest extends S3SegmentPusher_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      String string0 = "Uploading [%s] to S3";
      String string1 = "wDTX";
      String string2 = "";
      AWSDevPayCredentials aWSDevPayCredentials0 = new AWSDevPayCredentials(string0, string1, string0, string2);
      String string3 = "";
      CredentialsProvider credentialsProvider0 = mock(CredentialsProvider.class, new ViolatedAssumptionAnswer());
      RestS3Service restS3Service0 = new RestS3Service(aWSDevPayCredentials0, string3, credentialsProvider0);
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      JsonFactory jsonFactory0 = new JsonFactory();
      StdSerializerProvider stdSerializerProvider0 = new StdSerializerProvider();
      StdDeserializerProvider stdDeserializerProvider0 = new StdDeserializerProvider();
      JsonParser.Feature jsonParser_Feature0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS;
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper0);
      System.setCurrentTimeMillis(restS3Service0.BUCKET_STATUS__DOES_NOT_EXIST);
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "<o";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0, string0).when(s3SegmentPusherConfig0).getBaseKey();
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      MockFile mockFile0 = new MockFile(string0, string0);
      DataSegment dataSegment0 = null;
      MockFile mockFile1 = new MockFile(string0);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile1, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      MockFile mockFile0 = new MockFile(string0, string0);
      Shell shell0 = new Shell();
      Sigar sigar0 = shell0.getSigar();
      File file0 = sigar0.getNativeLibrary();
      String string1 = "!\"3";
      Interval interval0 = null;
      String string2 = null;
      String string3 = "MP";
      CredentialsProvider credentialsProvider0 = mock(CredentialsProvider.class, new ViolatedAssumptionAnswer());
      String string4 = "q[0aK";
      DataSegment dataSegment0 = mock(DataSegment.class, new ViolatedAssumptionAnswer());
      doReturn(sigar0.BUILD_DATE).when(dataSegment0).getDataSource();
      doReturn(interval0).when(dataSegment0).getInterval();
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "wJwFO0";
      String string1 = "Basic %s";
      File file0 = MockFile.createTempFile(string0, string1);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) gJChronology0);
      Interval interval0 = new Interval(dateMidnight0, dateMidnight0);
      DateTime dateTime0 = DateTime.now((Chronology) gJChronology0);
      String string2 = "[*N-&])";
      String[] stringArray0 = new String[5];
      stringArray0[0] = string2;
      stringArray0[1] = string0;
      stringArray0[2] = string2;
      stringArray0[3] = string2;
      stringArray0[4] = string2;
      String[] stringArray1 = new String[4];
      stringArray1[0] = string2;
      stringArray1[1] = string1;
      stringArray1[2] = string2;
      stringArray1[3] = string2;
      String string3 = "[EZX`)";
      short short0 = (short)2;
      Short short1 = new Short(short0);
      ServiceMetricEvent serviceMetricEvent0 = new ServiceMetricEvent(dateTime0, string2, string1, stringArray0, stringArray0, stringArray0, stringArray0, stringArray1, stringArray1, stringArray1, stringArray1, stringArray0, stringArray0, string3, short1);
      Map<String, Object> map0 = serviceMetricEvent0.toMap();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      SingleDimensionShardSpec singleDimensionShardSpec0 = new SingleDimensionShardSpec(stringArray0[1], stringArray1[1], stringArray1[3], short0);
      int int0 = 2183;
      Integer integer0 = new Integer(int0);
      DataSegment dataSegment0 = new DataSegment(string1, interval0, string1, map0, arrayList0, arrayList0, singleDimensionShardSpec0, integer0, short0);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(file0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      S3SegmentPusherConfig s3SegmentPusherConfig0 = null;
      JsonFactory jsonFactory0 = new JsonFactory();
      StdSerializerProvider stdSerializerProvider0 = new StdSerializerProvider();
      StdDeserializerProvider stdDeserializerProvider0 = new StdDeserializerProvider();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, stdSerializerProvider0, stdDeserializerProvider0);
      ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
      JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
      ObjectMapper objectMapper1 = objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0, jsonTypeInfo_As0);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper1);
      MockFile mockFile0 = new MockFile(jsonFactory0.FORMAT_NAME_JSON);
      long long0 = 0L;
      Interval interval0 = new Interval(long0, long0);
      Map<String, Object> map0 = null;
      DefaultHttpChunkTrailer defaultHttpChunkTrailer0 = new DefaultHttpChunkTrailer();
      String string0 = "";
      List<String> list0 = defaultHttpChunkTrailer0.getHeaders(string0);
      NoneShardSpec noneShardSpec0 = new NoneShardSpec();
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      long long1 = 4219L;
      DataSegment dataSegment0 = new DataSegment(jsonFactory0.FORMAT_NAME_JSON, interval0, jsonFactory0.FORMAT_NAME_JSON, map0, list0, list0, noneShardSpec0, integer0, long1);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "Adding indexFile[%s] with size[%,d].  Total size[%,d]";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0, (String) null).when(s3SegmentPusherConfig0).getBaseKey();
      ObjectMapper objectMapper0 = null;
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper0);
      String string1 = "SE!G}";
      Sigar sigar0 = new Sigar();
      File file0 = sigar0.getNativeLibrary();
      File file1 = MockFile.createTempFile(string1, string1, file0);
      DataSegment dataSegment0 = null;
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(file1, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      S3SegmentPusher.JOINER = s3SegmentPusher0.JOINER;
      String string1 = "";
      MockFile mockFile0 = new MockFile(string1);
      DataSegment dataSegment0 = null;
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      EvoSuiteFile evoSuiteFile0 = null;
      String string1 = "";
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string1);
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      MockFile mockFile0 = new MockFile(string0, string0);
      Shell shell0 = new Shell();
      Sigar sigar0 = shell0.getSigar();
      File file0 = sigar0.getNativeLibrary();
      String string2 = "!\"3";
      Interval interval0 = null;
      String string3 = null;
      ProviderCredentials providerCredentials0 = null;
      String string4 = "MP";
      CredentialsProvider credentialsProvider0 = mock(CredentialsProvider.class, new ViolatedAssumptionAnswer());
      RestS3Service restS3Service0 = new RestS3Service(providerCredentials0, string4, credentialsProvider0);
      String string5 = "q[0aK";
      DataSegment dataSegment0 = mock(DataSegment.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dataSegment0).getDataSource();
      doReturn((Interval) null).when(dataSegment0).getInterval();
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }
}