/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 15:36:06 GMT 2020
 */

package org.springframework.boot.context.embedded.undertow;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UndertowEmbeddedServletContainerFactory_ESTest extends UndertowEmbeddedServletContainerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new UndertowEmbeddedServletContainerFactory(0);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      undertowEmbeddedServletContainerFactory0.setAccessLogPattern(">X3Dj+Ruurir/Oo");
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Customizers must not be null
      // Undeclared exception!
      try { 
        undertowEmbeddedServletContainerFactory0.addBuilderCustomizers((UndertowBuilderCustomizer[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Customizers must not be null
         //
         verifyException("org.springframework.util.Assert", e);
         assertTrue(e.getMessage().equals("Customizers must not be null"));   
      }
  }
}
