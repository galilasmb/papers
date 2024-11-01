/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 05:17:50 GMT 2020
 */

package retrofit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import retrofit.RequestBuilder;
import retrofit.RestMethodInfo;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RequestBuilder_ESTest extends RequestBuilder_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      RequestBuilder requestBuilder1 = requestBuilder0.headers(linkedList0);
      Method method0 = null;
      Object[] objectArray0 = new Object[0];
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Converter converter0 = null;
      RequestBuilder requestBuilder0 = new RequestBuilder(converter0);
      Object[] objectArray0 = new Object[6];
      String string0 = "/";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder1.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) gson0;
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      RestMethodInfo restMethodInfo0 = null;
      RequestBuilder requestBuilder1 = requestBuilder0.methodInfo(restMethodInfo0);
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      RestMethodInfo restMethodInfo0 = null;
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      boolean boolean0 = true;
      boolean boolean1 = true;
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "/V1";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "#Hn;";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      // Undeclared exception!
      try { 
        requestBuilder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "B [e;p";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder1.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "RG7";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      Object[] objectArray0 = new Object[0];
      RequestBuilder requestBuilder2 = requestBuilder1.args(objectArray0);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Converter converter0 = null;
      RequestBuilder requestBuilder0 = new RequestBuilder(converter0);
      String string0 = "}";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder1.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      Object[] objectArray0 = new Object[0];
      RequestBuilder requestBuilder1 = requestBuilder0.args(objectArray0);
      String string0 = "V5AwZ";
      RequestBuilder requestBuilder2 = requestBuilder1.apiUrl(string0);
      RestMethodInfo restMethodInfo0 = null;
      RequestBuilder requestBuilder3 = requestBuilder1.methodInfo(restMethodInfo0);
      RequestBuilder requestBuilder4 = requestBuilder2.methodInfo(restMethodInfo0);
      String string1 = null;
      RequestBuilder requestBuilder5 = requestBuilder4.apiUrl(string1);
      RequestBuilder requestBuilder6 = requestBuilder4.args(objectArray0);
      LinkedList<Header> linkedList0 = new LinkedList<Header>();
      String string2 = "/";
      RequestBuilder requestBuilder7 = requestBuilder2.apiUrl(string2);
      RequestBuilder requestBuilder8 = requestBuilder6.headers(linkedList0);
      // Undeclared exception!
      try { 
        requestBuilder6.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      GsonConverter gsonConverter0 = new GsonConverter(gson0);
      RequestBuilder requestBuilder0 = new RequestBuilder(gsonConverter0);
      String string0 = "Expected value/";
      RequestBuilder requestBuilder1 = requestBuilder0.apiUrl(string0);
      // Undeclared exception!
      try { 
        requestBuilder1.build();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("retrofit.RequestBuilder", e);
      }
  }
}
