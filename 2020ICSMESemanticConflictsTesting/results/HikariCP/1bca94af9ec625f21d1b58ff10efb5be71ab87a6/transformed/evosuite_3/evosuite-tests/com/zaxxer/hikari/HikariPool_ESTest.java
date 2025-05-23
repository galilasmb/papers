/*
 * This file was automatically generated by EvoSuite
 * Mon May 25 06:58:42 GMT 2020
 */

package com.zaxxer.hikari;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.zaxxer.hikari.HikariDataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HikariPool_ESTest extends HikariPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HikariDataSource hikariDataSource0 = new HikariDataSource();
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockRuntimeException : driverClassName specified class '' could not be loaded
      // Modified Version:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      // Undeclared exception!
      try { 
        hikariDataSource0.setDriverClassName("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // driverClassName specified class '' could not be loaded
         //
         verifyException("com.zaxxer.hikari.HikariConfig", e);
         assertTrue(e.getMessage().equals("driverClassName specified class '' could not be loaded"));   
      }
  }
}
