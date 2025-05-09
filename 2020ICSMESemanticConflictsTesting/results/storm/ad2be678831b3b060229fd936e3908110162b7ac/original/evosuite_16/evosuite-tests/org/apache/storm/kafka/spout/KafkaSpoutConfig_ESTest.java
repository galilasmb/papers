/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:15:06 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.storm.kafka.spout.KafkaSpoutMessageId;
import org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff((KafkaSpoutRetryExponentialBackoff.TimeInterval) null, (KafkaSpoutRetryExponentialBackoff.TimeInterval) null, 1112, (KafkaSpoutRetryExponentialBackoff.TimeInterval) null);
      ConsumerRecord<Object, String> consumerRecord0 = new ConsumerRecord<Object, String>("<myJMSm", 1112, 1112, "", "<myJMSm");
      KafkaSpoutMessageId kafkaSpoutMessageId0 = new KafkaSpoutMessageId(consumerRecord0);
      // Undeclared exception!
      try { 
        kafkaSpoutRetryExponentialBackoff0.schedule(kafkaSpoutMessageId0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff$TimeInterval", e);
      }
  }
}
