/*
 * This file was automatically generated by EvoSuite
 * Sun May 03 05:32:31 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ReadArrayBuffer readArrayBuffer0 = new ReadArrayBuffer(byteArray0);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Invalid move, position out of bounce: -3067
      readArrayBuffer0.movePosition((-3067));
  }
}