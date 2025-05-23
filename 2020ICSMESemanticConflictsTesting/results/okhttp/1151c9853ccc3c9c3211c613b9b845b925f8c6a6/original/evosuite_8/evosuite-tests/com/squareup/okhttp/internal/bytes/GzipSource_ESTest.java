/*
 * This file was automatically generated by EvoSuite
 * Tue May 26 07:40:37 GMT 2020
 */

package com.squareup.okhttp.internal.bytes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.squareup.okhttp.internal.bytes.OkBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GzipSource_ESTest extends GzipSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OkBuffer okBuffer0 = new OkBuffer();
      // Undeclared exception!
      try { 
        okBuffer0.getByte((-1140L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.squareup.okhttp.internal.Util", e);
      }
  }
}
