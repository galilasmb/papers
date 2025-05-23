/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 04:49:58 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = "\n";
      String string1 = "Insert position out of bounds.";
      String string2 = hashMap0.put(string0, string1);
      httpConnection_Response0.cookies = (Map<String, String>) hashMap0;
      httpConnection_Response0.method = connection_Method0;
      String string3 = "applet";
      String string4 = "]\\d'I>";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string3, string4);
      Connection.Method connection_Method1 = Connection.Method.POST;
      URL uRL0 = MockURL.getFileExample();
      httpConnection_Response0.url = uRL0;
      Connection.Response connection_Response1 = httpConnection_Response0.method(connection_Method1);
      String string5 = hashMap0.remove((Object) httpConnection_Response0.method);
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "title";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: title
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "Fh.";
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)94;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      int int0 = 1048576;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, byte1, int0);
      int int1 = byteArrayInputStream0.read();
      byteArrayInputStream0.close();
      byteArrayInputStream0.reset();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, byteArray0[0]);
      long long0 = (-1685L);
      long long1 = bufferedInputStream0.skip(long0);
      try { 
        bufferedInputStream0.reset();
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "d)R>b!ra5n";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      Connection.Method connection_Method0 = Connection.Method.POST;
      Connection.Response connection_Response1 = httpConnection_Response0.method(connection_Method0);
      String string1 = httpConnection_Response0.charset();
      String string2 = ".]F2yH6W";
      Connection.Response connection_Response2 = httpConnection_Response0.removeCookie(string2);
      String string3 = httpConnection_Response0.charset();
      String string4 = "yxD8~";
      String string5 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string4, string5);
      String string6 = null;
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string4);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string4);
      boolean boolean0 = true;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(boolean0).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream(enumeration0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      String string0 = "";
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, string0, uRLStreamHandler0);
      Connection connection0 = HttpConnection.connect(uRL1);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection connection1 = HttpConnection.connect(uRL1);
      String string1 = httpConnection_Response0.contentType();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)11;
      byteArray0[0] = byte0;
      byte byte1 = (byte)38;
      String string2 = "";
      String string3 = null;
      String[] stringArray0 = new String[3];
      stringArray0[0] = string0;
      String string4 = "n2Pz1\"?EU\"b2";
      stringArray0[1] = string4;
      stringArray0[2] = ((HttpConnection) connection1).CONTENT_ENCODING;
      // Undeclared exception!
      try { 
        connection1.data(stringArray0);
      } catch(IllegalArgumentException e) {
         //
         // Must supply an even number of key value pairs
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "[";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0, (InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.inputStream((InputStream) pipedInputStream0);
      String string1 = "systemId";
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.key(string1);
      String string2 = "T2";
      int int0 = 0;
      pipedOutputStream0.write(int0);
      String string3 = "Entities";
      HttpConnection.KeyVal httpConnection_KeyVal4 = HttpConnection.KeyVal.create(string3, string0, (InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal5 = HttpConnection.KeyVal.create(string1, string2);
      HttpConnection.KeyVal httpConnection_KeyVal6 = httpConnection_KeyVal5.inputStream((InputStream) pipedInputStream0);
      String string4 = httpConnection_KeyVal5.toString();
      HttpConnection.KeyVal httpConnection_KeyVal7 = HttpConnection.KeyVal.create(string2, string1);
      HttpConnection.KeyVal httpConnection_KeyVal8 = httpConnection_KeyVal5.inputStream((InputStream) pipedInputStream0);
      String string5 = "!;Sfb";
      HttpConnection.KeyVal httpConnection_KeyVal9 = HttpConnection.KeyVal.create(string5, string2);
      String string6 = "i^2vq+IK%ODttj";
      HttpConnection.KeyVal httpConnection_KeyVal10 = httpConnection_KeyVal1.value(string5);
      HttpConnection.KeyVal httpConnection_KeyVal11 = httpConnection_KeyVal5.key(string6);
      String string7 = httpConnection_KeyVal1.key();
      String string8 = httpConnection_KeyVal5.value();
      String string9 = httpConnection_KeyVal5.key();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string10 = httpConnection_Response0.contentType();
      // Undeclared exception!
      try { 
        httpConnection_Response0.parse();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before parsing response
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = null;
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      String string0 = "<T))J$Q";
      boolean boolean1 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, string0);
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Document document0 = Parser.parseBodyFragmentRelaxed(string0, string0);
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0, httpConnection_Response0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.statusMessage();
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "UTF-8";
      String string1 = "tsrR_3hX#n#fd`/<";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "+!Hr_|b";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string2);
      boolean boolean0 = httpConnection_KeyVal0.hasInputStream();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string3 = httpConnection_Response0.charset();
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "xK";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      Connection.Method connection_Method0 = Connection.Method.GET;
      Connection.Response connection_Response1 = httpConnection_Response0.method(connection_Method0);
      String string1 = null;
      // Undeclared exception!
      try { 
        httpConnection_Response0.removeHeader(string1);
      } catch(IllegalArgumentException e) {
         //
         // Header name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.GET;
      httpConnection_Response0.method = connection_Method0;
      String string0 = "8ZF0aZfGS<!F\"";
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string0);
      Connection.Response connection_Response1 = httpConnection_Response0.cookie(string0, string0);
      String string1 = httpConnection_Response0.statusMessage();
      int int0 = httpConnection_Response0.statusCode();
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "\"\r\nContent-Type: application/octet-stream\r\n\r\n";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.GERMANY;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      List<String> list1 = hashMap0.put(string0, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      // Undeclared exception!
      try { 
        httpConnection_Response0.parse();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before parsing response
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "dhooJAsvW|`?50fO";
      MockFile mockFile0 = new MockFile(string0);
      URL uRL0 = mockFile0.toURL();
      Connection.Response connection_Response0 = httpConnection_Response0.url(uRL0);
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      String string0 = "!|,Mk";
      String string1 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = httpConnection_KeyVal0.toString();
      String string3 = "H|mmUs";
      String string4 = "";
      File file0 = MockFile.createTempFile(string3, string4);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      long long0 = 3862L;
      long long1 = pushbackInputStream0.skip(long0);
      boolean boolean0 = pushbackInputStream0.markSupported();
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string3, string1, (InputStream) pushbackInputStream0);
      boolean boolean1 = httpConnection_KeyVal0.hasInputStream();
      String string5 = httpConnection_KeyVal0.key();
      InputStream inputStream0 = httpConnection_KeyVal1.inputStream();
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      URL uRL0 = null;
      // Undeclared exception!
      try { 
        HttpConnection.connect(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // URL must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      String string0 = ":lt(%d)";
      String string1 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = httpConnection_KeyVal0.toString();
      String string3 = "";
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      int int0 = 0;
      mockFileInputStream0.mark(int0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) mockFileInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = HttpConnection.KeyVal.create(string0, string3);
      String string4 = httpConnection_KeyVal0.value();
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal0.value(string1);
      boolean boolean0 = httpConnection_KeyVal0.hasInputStream();
      boolean boolean1 = httpConnection_KeyVal2.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0, httpConnection_Response0);
      } catch(IllegalArgumentException e) {
         //
         // Request must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "+r9,~7-7 z)AodJT&b";
      String string1 = "";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      // Undeclared exception!
      try { 
        httpConnection_Response0.body();
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "content";
      String string1 = "4Ux]ik";
      String string2 = "Data collection must not be null";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string1, string2);
      EvoSuiteFile evoSuiteFile0 = null;
      boolean boolean0 = true;
      boolean boolean1 = true;
      boolean boolean2 = false;
      boolean boolean3 = FileSystemHandling.createFolder(evoSuiteFile0);
      Connection.Response connection_Response1 = httpConnection_Response0.removeHeader(string0);
      boolean boolean4 = FileSystemHandling.setPermissions(evoSuiteFile0, boolean0, boolean1, boolean2);
      boolean boolean5 = FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean6 = FileSystemHandling.createFolder(evoSuiteFile0);
      try { 
        MockURL.URL(string0);
      } catch(MalformedURLException e) {
         //
         // no protocol: content
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      String string0 = "\"\r\nContent-Type: application/octet-stream\r\n\r\n";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      URL uRL0 = MockURL.getFtpExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)6;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, byte1, byteArray0[1]);
      byteArrayInputStream0.close();
      boolean boolean0 = byteArrayInputStream0.markSupported();
      long long0 = byteArrayInputStream0.skip(byteArray0[0]);
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string0, string0, (InputStream) byteArrayInputStream0);
      Connection connection1 = HttpConnection.connect(uRL0);
      Connection connection2 = connection1.userAgent(string0);
  }
}
