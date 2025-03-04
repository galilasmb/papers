/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 16:35:28 GMT 2020
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.proxy("_,3", 3000);
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Key val must not be null
      // Undeclared exception!
      try { 
        httpConnection_Request1.data((Connection.KeyVal) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key val must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
         assertTrue(e.getMessage().equals("Key val must not be null"));   
      }
  }
}
