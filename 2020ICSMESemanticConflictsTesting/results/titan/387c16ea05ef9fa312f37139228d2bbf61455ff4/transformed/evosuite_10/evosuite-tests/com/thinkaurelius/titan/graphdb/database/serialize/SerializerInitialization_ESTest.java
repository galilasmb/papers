/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 19:42:11 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.ReadBuffer;
import com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.DataOutput;
import com.thinkaurelius.titan.graphdb.database.serialize.Serializer;
import com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization;
import com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      SerializerInitialization serializerInitialization0 = new SerializerInitialization();
      serializerInitialization0.KRYO_OFFSET = serializerInitialization0.RESERVED_ID_OFFSET;
      boolean boolean0 = true;
      KryoSerializer kryoSerializer0 = null;
      try {
        kryoSerializer0 = new KryoSerializer(boolean0);
      } catch(IllegalArgumentException e) {
         //
         // ID allocation overflow!
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      boolean boolean0 = true;
      KryoSerializer kryoSerializer0 = new KryoSerializer(boolean0);
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(kryoSerializer0);
      } catch(IllegalArgumentException e) {
         //
         // ID has already been registered: 41
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      boolean boolean0 = true;
      KryoSerializer kryoSerializer0 = new KryoSerializer(boolean0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-54);
      byteArray0[1] = byte1;
      byte byte2 = (byte)82;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-122);
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte)1;
      byteArray0[5] = byte5;
      byte byte6 = (byte)26;
      byteArray0[6] = byte6;
      ReadByteBuffer readByteBuffer0 = new ReadByteBuffer(byteArray0);
      Class<Object> class0 = Object.class;
      Object object0 = kryoSerializer0.readObject((ReadBuffer) readByteBuffer0, class0);
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(kryoSerializer0);
      } catch(IllegalArgumentException e) {
         //
         // Serializer has already been initialized!
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      SerializerInitialization serializerInitialization0 = new SerializerInitialization();
      boolean boolean0 = false;
      Serializer serializer0 = null;
      // Undeclared exception!
      try { 
        SerializerInitialization.initialize(serializer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization", e);
      }
  }
}
