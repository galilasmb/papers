/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 08:46:26 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.APersistentVector;
import clojure.lang.ArraySeq;
import clojure.lang.Cons;
import clojure.lang.IPersistentMap;
import clojure.lang.MapEntry;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentHashSet;
import clojure.lang.PersistentList;
import clojure.lang.PersistentVector;
import java.time.format.FormatStyle;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.header.internals.RecordHeaders;
import org.apache.kafka.common.record.TimestampType;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.kafka.spout.KafkaSpout;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutMessageId;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactory;
import org.apache.storm.kafka.spout.internal.KafkaConsumerFactoryDefault;
import org.apache.storm.task.GeneralTopologyContext;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsGetter;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.MessageId;
import org.apache.storm.tuple.TupleImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpout_ESTest extends KafkaSpout_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      KafkaSpoutConfig<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String> kafkaSpoutConfig0 = (KafkaSpoutConfig<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String>();
      KafkaSpout<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String> kafkaSpout0 = new KafkaSpout<ConsumerRecord<String, KafkaSpoutStreamsNamedTopics>, String>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      OutputFieldsGetter outputFieldsGetter0 = new OutputFieldsGetter();
      String string0 = ", emitted=";
      Fields fields0 = null;
      // Undeclared exception!
      try { 
        outputFieldsGetter0.declareStream(string0, fields0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.topology.OutputFieldsGetter", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      KafkaSpout.OffsetComparator kafkaSpout_OffsetComparator0 = new KafkaSpout.OffsetComparator();
      String string0 = "OF";
      int int0 = 0;
      long long0 = 1406L;
      TimestampType timestampType0 = TimestampType.NO_TIMESTAMP_TYPE;
      long long1 = 0L;
      int int1 = 0;
      ConsumerRecord<String, String> consumerRecord0 = new ConsumerRecord<String, String>(string0, int0, int0, long0, timestampType0, long1, int0, int1, string0, string0);
      KafkaSpoutMessageId kafkaSpoutMessageId0 = new KafkaSpoutMessageId(consumerRecord0);
      Thread thread0 = MockThread.currentThread();
      String string1 = kafkaSpoutMessageId0.getMetadata(thread0);
      int int2 = kafkaSpout_OffsetComparator0.compare(kafkaSpoutMessageId0, kafkaSpoutMessageId0);
      KafkaSpoutConfig<FormatStyle, Delayed> kafkaSpoutConfig0 = (KafkaSpoutConfig<FormatStyle, Delayed>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<FormatStyle, Delayed> kafkaSpout0 = new KafkaSpout<FormatStyle, Delayed>(kafkaSpoutConfig0);
      long long2 = 404L;
      KafkaSpout.OffsetEntry kafkaSpout_OffsetEntry0 = kafkaSpout0.new OffsetEntry();
      PersistentList persistentList0 = new PersistentList(kafkaSpout_OffsetEntry0);
      // Undeclared exception!
      try { 
        persistentList0.listIterator(int2);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.ASeq", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      KafkaSpoutConfig<String, KafkaSpout.OffsetEntry> kafkaSpoutConfig0 = (KafkaSpoutConfig<String, KafkaSpout.OffsetEntry>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<String, KafkaSpout.OffsetEntry> kafkaSpout0 = new KafkaSpout<String, KafkaSpout.OffsetEntry>(kafkaSpoutConfig0);
      // Undeclared exception!
      try { 
        kafkaSpout0.emit();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      KafkaSpoutConfig<MapEntry, TopicPartition> kafkaSpoutConfig0 = (KafkaSpoutConfig<MapEntry, TopicPartition>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<MapEntry, TopicPartition> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<MapEntry, TopicPartition>();
      KafkaSpout<MapEntry, TopicPartition> kafkaSpout0 = new KafkaSpout<MapEntry, TopicPartition>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      // Undeclared exception!
      try { 
        kafkaSpout0.shutdown();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      KafkaSpoutConfig<Integer, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = (KafkaSpoutConfig<Integer, KafkaSpoutStreamsNamedTopics>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(kafkaSpoutConfig0).getConsumerGroupId();
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaConsumerFactoryDefault<Integer, KafkaSpoutStreamsNamedTopics> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<Integer, KafkaSpoutStreamsNamedTopics>();
      KafkaSpout<Integer, KafkaSpoutStreamsNamedTopics> kafkaSpout0 = new KafkaSpout<Integer, KafkaSpoutStreamsNamedTopics>(kafkaSpoutConfig0, kafkaConsumerFactoryDefault0);
      KafkaSpout.OffsetEntry kafkaSpout_OffsetEntry0 = kafkaSpout0.new OffsetEntry();
      KafkaSpout.KafkaSpoutConsumerRebalanceListener kafkaSpout_KafkaSpoutConsumerRebalanceListener0 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
      Collection<TopicPartition> collection0 = null;
      // Undeclared exception!
      try { 
        kafkaSpout_KafkaSpoutConsumerRebalanceListener0.onPartitionsAssigned(collection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      KafkaSpoutConfig<TopicPartition, Integer> kafkaSpoutConfig0 = (KafkaSpoutConfig<TopicPartition, Integer>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      KafkaConsumerFactoryDefault<TopicPartition, Integer> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<TopicPartition, Integer>();
      KafkaSpoutConfig<TopicPartition, Integer> kafkaSpoutConfig1 = (KafkaSpoutConfig<TopicPartition, Integer>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(kafkaSpoutConfig1).getKafkaProps();
      doReturn((Deserializer) null).when(kafkaSpoutConfig1).getKeyDeserializer();
      doReturn((Deserializer) null).when(kafkaSpoutConfig1).getValueDeserializer();
      // Undeclared exception!
      try { 
        kafkaConsumerFactoryDefault0.createConsumer(kafkaSpoutConfig1);
      } catch(RuntimeException e) {
         //
         // Missing required configuration \"key.deserializer\" which has no default value.
         //
         verifyException("org.apache.kafka.common.config.ConfigDef", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpout<Integer, String> kafkaSpout0 = new KafkaSpout<Integer, String>();
      KafkaSpout.KafkaSpoutConsumerRebalanceListener kafkaSpout_KafkaSpoutConsumerRebalanceListener0 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) kafkaSpout_KafkaSpoutConsumerRebalanceListener0;
      objectArray0[1] = (Object) kafkaSpout0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[4] = (Object) kafkaSpout0;
      objectArray0[5] = (Object) kafkaSpout0;
      objectArray0[6] = (Object) kafkaSpout_KafkaSpoutConsumerRebalanceListener0;
      ArraySeq arraySeq0 = ArraySeq.create(objectArray0);
      // Undeclared exception!
      try { 
        kafkaSpout_KafkaSpoutConsumerRebalanceListener0.onPartitionsRevoked(arraySeq0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      KafkaSpout<OffsetAndMetadata, ConsumerRecord<Object, String>> kafkaSpout0 = new KafkaSpout<OffsetAndMetadata, ConsumerRecord<Object, String>>();
      // Undeclared exception!
      try { 
        kafkaSpout0.getWildCardTopics();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      KafkaSpoutConfig<TopicPartition, Object> kafkaSpoutConfig0 = (KafkaSpoutConfig<TopicPartition, Object>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      KafkaSpout<TopicPartition, Object> kafkaSpout0 = new KafkaSpout<TopicPartition, Object>(kafkaSpoutConfig0);
      KafkaSpout.KafkaSpoutConsumerRebalanceListener kafkaSpout_KafkaSpoutConsumerRebalanceListener0 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
      KafkaSpout.OffsetEntry kafkaSpout_OffsetEntry0 = kafkaSpout0.new OffsetEntry();
      TopicPartition topicPartition0 = kafkaSpout_OffsetEntry0.tp;
      long long0 = 0L;
      OffsetAndMetadata offsetAndMetadata0 = new OffsetAndMetadata(long0);
      // Undeclared exception!
      try { 
        kafkaSpout_KafkaSpoutConsumerRebalanceListener0.doSeek(topicPartition0, offsetAndMetadata0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      KafkaSpout<String, KafkaSpoutStreamsWildcardTopics> kafkaSpout0 = new KafkaSpout<String, KafkaSpoutStreamsWildcardTopics>();
      KafkaSpout.OffsetEntry kafkaSpout_OffsetEntry0 = kafkaSpout0.new OffsetEntry();
      TopicPartition topicPartition0 = kafkaSpout_OffsetEntry0.tp;
      KafkaSpout.OffsetEntry kafkaSpout_OffsetEntry1 = kafkaSpout0.new OffsetEntry(topicPartition0, kafkaSpout_OffsetEntry0.initialFetchOffset);
      String string0 = "t%&d<V\\0'vF6iD*";
      TimestampType timestampType0 = TimestampType.NO_TIMESTAMP_TYPE;
      int int0 = 0;
      int int1 = 0;
      KafkaSpoutStreamsNamedTopics kafkaSpoutStreamsNamedTopics0 = null;
      String string1 = "";
      pprint.fixed_float pprint_fixed_float0 = null;
      try {
        pprint_fixed_float0 = new pprint.fixed_float();
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, OffsetAndMetadata> kafkaSpoutConfig0 = (KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, OffsetAndMetadata>) mock(KafkaSpoutConfig.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(kafkaSpoutConfig0).getKafkaProps();
      doReturn((KafkaSpoutStreams) null).when(kafkaSpoutConfig0).getKafkaSpoutStreams();
      doReturn((Deserializer) null).when(kafkaSpoutConfig0).getKeyDeserializer();
      doReturn((Deserializer) null).when(kafkaSpoutConfig0).getValueDeserializer();
      KafkaSpout<KafkaSpoutStreamsNamedTopics, OffsetAndMetadata> kafkaSpout0 = new KafkaSpout<KafkaSpoutStreamsNamedTopics, OffsetAndMetadata>(kafkaSpoutConfig0);
      KafkaConsumerFactoryDefault<KafkaSpoutMessageId, ConsumerRecord<Object, KafkaSpoutStreamsNamedTopics>> kafkaConsumerFactoryDefault0 = new KafkaConsumerFactoryDefault<KafkaSpoutMessageId, ConsumerRecord<Object, KafkaSpoutStreamsNamedTopics>>();
      boolean boolean0 = kafkaSpout0.waitingToEmit();
      kafkaSpout0.kafkaConsumerFactory = (KafkaConsumerFactory) kafkaConsumerFactoryDefault0;
      // Undeclared exception!
      try { 
        kafkaConsumerFactoryDefault0.createConsumer(kafkaSpout0.kafkaSpoutConfig);
      } catch(RuntimeException e) {
         //
         // Missing required configuration \"key.deserializer\" which has no default value.
         //
         verifyException("org.apache.kafka.common.config.ConfigDef", e);
      }
  }
}
