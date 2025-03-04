/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 04:36:35 GMT 2020
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
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = ">[nX|6yLeI[Ck%>)sx";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: >[nX|6yLeI[Ck%>)sx
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "blcS";
      String string1 = "application/xml";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = httpConnection_KeyVal0.value();
      URL uRL0 = MockURL.getHttpExample();
      String string3 = httpConnection_KeyVal0.toString();
      try { 
        MockURL.openStream(uRL0);
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = ";";
      boolean boolean0 = true;
      boolean boolean1 = false;
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
  public void test03()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      String string0 = "EPqLE+\\LUEkX<";
      String string1 = "video";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      Connection.Response connection_Response1 = httpConnection_Response0.header(string0, string0);
      Map<String, String> map0 = null;
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response2 = httpConnection_Response0.method(connection_Method0);
      String string2 = httpConnection_Response0.statusMessage();
      URL uRL0 = MockURL.getFileExample();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string3 = "3'Yn!)F Fhf:(gS~dK";
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Collection<String> collection0 = null;
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, collection0, locale_FilteringMode0);
      List<String> list1 = hashMap0.put(string3, list0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection connection0 = HttpConnection.connect(uRL0);
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
  public void test04()  throws Throwable  {
      String string0 = "K9ic<siLF%B7H@%W'!;";
      String string1 = "";
      boolean boolean0 = false;
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(boolean0).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, (InputStream) sequenceInputStream0);
      boolean boolean1 = httpConnection_KeyVal0.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "org.jsoup.helper.H\\tpCoFnection$KeyVal";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "s0*6D[TI{zuisi',#>";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string1);
      String string2 = "&#x";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.value(string2);
      String string3 = "caption";
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal1.key(string3);
      HttpConnection.KeyVal httpConnection_KeyVal4 = httpConnection_KeyVal1.value(string0);
      InputStream inputStream0 = httpConnection_KeyVal1.inputStream();
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Attributes attributes0 = new Attributes();
      Map<String, String> map0 = attributes0.dataset();
      httpConnection_Response0.cookies = map0;
      Connection.Method connection_Method0 = Connection.Method.GET;
      httpConnection_Response0.method = connection_Method0;
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string1);
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
      String string0 = ">}qF*HP";
      Connection.Response connection_Response0 = httpConnection_Response0.removeHeader(string0);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string1 = null;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
      List<String> list1 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      List<String> list2 = hashMap0.put(string1, list1);
      Set<Map.Entry<String, List<String>>> set1 = hashMap0.entrySet();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      int int0 = httpConnection_Response0.statusCode();
      String string2 = httpConnection_Response0.contentType();
      // Undeclared exception!
      try { 
        HttpConnection.KeyVal.create(string2, string2);
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = "3knGWV,V)89#";
      String string1 = "nyz%`/~g]~)";
      InputStream inputStream0 = null;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, inputStream0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "TN[1yty6Dp";
      // Undeclared exception!
      try { 
        HttpConnection.connect(string0);
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: TN[1yty6Dp
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      String string0 = "~hYsv=ao%6+";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string0, string0, (InputStream) pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal0.value(string0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "Og";
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string1 = "JPfIR>k";
      String string2 = ".jDYUE";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string2);
      String string3 = "";
      Connection.Response connection_Response1 = httpConnection_Response0.cookie(string1, string3);
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
  public void test12()  throws Throwable  {
      String string0 = "Malformed URL: ";
      String string1 = "org.jsoup.select.Elements";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "'/5-_U#aJ]";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.key(string2);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Response0.method = connection_Method0;
      Connection.Method connection_Method1 = Connection.Method.POST;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method1);
      String string0 = httpConnection_Response0.charset();
      HttpConnection.Response httpConnection_Response1 = new HttpConnection.Response();
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Response0.method = connection_Method0;
      String string0 = "hidden";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string0);
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
  public void test15()  throws Throwable  {
      String string0 = "v<";
      String string1 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string2 = httpConnection_Response0.statusMessage();
      Map<String, List<String>> map0 = null;
      // Undeclared exception!
      try { 
        httpConnection_Response0.processResponseHeaders(map0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      URL uRL0 = null;
      // Undeclared exception!
      try { 
        httpConnection_Response0.url(uRL0);
      } catch(IllegalArgumentException e) {
         //
         // URL must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      URI uRI0 = MockURI.aFTPURI;
      URL uRL0 = MockURI.toURL(uRI0);
      Connection connection0 = HttpConnection.connect(uRL0);
      String string0 = "#,Z";
      String string1 = "5W,p\\#+Uc%3zk~";
      String string2 = "-Tc5)?pUBZZ)N5OjfQ@";
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(string2);
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "b4M7O";
      String string1 = "DHCrzY,z";
      Document document0 = Parser.parseBodyFragmentRelaxed(string0, string1);
      Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.noQuirks;
      Document document1 = document0.quirksMode(document_QuirksMode0);
      Document document2 = document0.normalise();
      Map<String, String> map0 = document1.dataset();
      Connection.Method connection_Method0 = Connection.Method.POST;
      Connection.Response connection_Response0 = httpConnection_Response0.method(connection_Method0);
      Elements elements0 = document0.getElementsByAttributeValueContaining(string1, string1);
      httpConnection_Response0.cookies = map0;
      // Undeclared exception!
      try { 
        document1.before((Node) document0);
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "bbYAz#at/Dw!h}B";
      String string1 = "";
      Document document0 = Parser.parseBodyFragmentRelaxed(string0, string1);
      Map<String, String> map0 = document0.dataset();
      String string2 = "video";
      String string3 = document0.outerHtml();
      // Undeclared exception!
      try { 
        httpConnection_Response0.header(string1, string2);
      } catch(IllegalArgumentException e) {
         //
         // Header name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "noscript";
      String string1 = "; filename=\"";
      Connection.Response connection_Response0 = httpConnection_Response0.header(string0, string1);
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      String string0 = "wbVmw+I";
      String string1 = "";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      int int0 = 458;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, int0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1, (InputStream) bufferedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.inputStream((InputStream) bufferedInputStream0);
      String string2 = "@u[)lgybA!YU_x-%JW";
      HttpConnection.KeyVal httpConnection_KeyVal2 = httpConnection_KeyVal1.key(string2);
      String string3 = httpConnection_KeyVal2.key();
      String string4 = ".2Qz)c406B#^'WB";
      HttpConnection.KeyVal httpConnection_KeyVal3 = HttpConnection.KeyVal.create(string2, string4, (InputStream) pipedInputStream0);
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "h";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string0);
      String string1 = "Kw</eh2jrhIj,";
      Connection.Response connection_Response1 = httpConnection_Response0.removeHeader(string0);
      String string2 = "";
      String string3 = "center";
      String string4 = "2";
      String string5 = "";
      Connection.Response connection_Response2 = httpConnection_Response0.header(string4, string5);
      Connection.Response connection_Response3 = httpConnection_Response0.removeHeader(string3);
      Document document0 = Document.createShell(string2);
      Connection.Method connection_Method0 = Connection.Method.POST;
      Connection.Response connection_Response4 = httpConnection_Response0.method(connection_Method0);
      Map<String, String> map0 = document0.dataset();
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response5 = httpConnection_Response0.cookie(string1, string2);
      int int0 = httpConnection_Response0.statusCode();
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
  public void test25()  throws Throwable  {
      Connection.Request connection_Request0 = null;
      HttpConnection.Response httpConnection_Response0 = null;
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
  public void test26()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = "'-!Yb5._%,FiX";
      Connection.Response connection_Response0 = httpConnection_Response0.removeCookie(string0);
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
  public void test27()  throws Throwable  {
      String string0 = "%22";
      int int0 = 15;
      PipedInputStream pipedInputStream0 = new PipedInputStream(int0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0, (InputStream) pipedInputStream0);
      InputStream inputStream0 = httpConnection_KeyVal0.inputStream();
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      String string0 = "Only http & https protocols supported";
      String string1 = "";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string1);
      String string2 = "%20";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      HttpConnection.KeyVal httpConnection_KeyVal1 = HttpConnection.KeyVal.create(string0, string2, (InputStream) pushbackInputStream0);
      boolean boolean0 = httpConnection_KeyVal0.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      String string0 = ". Mimetype=";
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create(string0, string0);
      String string1 = "g\\b";
      HttpConnection.KeyVal httpConnection_KeyVal1 = httpConnection_KeyVal0.value(string1);
      InputStream inputStream0 = null;
      int int0 = 25;
      String string2 = "h3";
      String string3 = "#jOH4$-$=WWAe3m9_T";
      HttpConnection.KeyVal httpConnection_KeyVal2 = HttpConnection.KeyVal.create(string2, string3);
      HttpConnection.KeyVal httpConnection_KeyVal3 = httpConnection_KeyVal0.inputStream(inputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(inputStream0, int0);
      String string4 = "";
      HttpConnection.KeyVal httpConnection_KeyVal4 = HttpConnection.KeyVal.create(string0, string4);
      HttpConnection.KeyVal httpConnection_KeyVal5 = httpConnection_KeyVal1.inputStream((InputStream) pushbackInputStream0);
      String string5 = "nVtx";
      String string6 = "E";
      HttpConnection.KeyVal httpConnection_KeyVal6 = HttpConnection.KeyVal.create(string5, string6, (InputStream) pushbackInputStream0);
      boolean boolean0 = httpConnection_KeyVal5.hasInputStream();
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      String string0 = "";
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = hashMap0.put(string0, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      String string0 = "EPqLE+\\LUEkX<";
      String string1 = "video";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      Connection.Response connection_Response1 = httpConnection_Response0.header(string0, string0);
      Map<String, String> map0 = null;
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response2 = httpConnection_Response0.method(connection_Method0);
      String string2 = httpConnection_Response0.statusMessage();
      URL uRL0 = MockURL.getFileExample();
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection connection0 = HttpConnection.connect(uRL0);
      Connection.Request connection_Request0 = null;
      Connection connection1 = connection0.setValidateSSLCertificates(boolean0);
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
  public void test32()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      Connection.Method connection_Method0 = Connection.Method.POST;
      String string0 = "EPqLE+\\LUEkX<";
      String string1 = "video";
      Connection.Response connection_Response0 = httpConnection_Response0.cookie(string0, string1);
      Connection.Response connection_Response1 = httpConnection_Response0.header(string0, string0);
      Map<String, String> map0 = null;
      httpConnection_Response0.cookies = map0;
      Connection.Response connection_Response2 = httpConnection_Response0.method(connection_Method0);
      String string2 = httpConnection_Response0.statusMessage();
      URL uRL0 = MockURL.getFileExample();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      Connection connection0 = HttpConnection.connect(uRL0);
      // Undeclared exception!
      try { 
        connection0.data(string1, string2);
      } catch(IllegalArgumentException e) {
         //
         // Data value must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
