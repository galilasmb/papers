/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 07:50:59 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.Keyword;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import clojure.lang.PersistentTreeMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutRetryService;
import org.apache.storm.kafka.spout.KafkaSpoutStream;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.KafkaSpoutTupleBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilderWildcardTopics;
import org.apache.storm.kafka.spout.SerializableDeserializer;
import org.apache.storm.tuple.Fields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Integer>();
      List<String> list0 = kafkaSpoutConfig0.getSubscribedTopics();
      KafkaSpoutConfig<Integer, String> kafkaSpoutConfig1 = new KafkaSpoutConfig<Integer, String>();
      KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (long) kafkaSpoutConfig0.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
      kafkaSpoutConfig1.tuplesBuilder = kafkaSpoutConfig0.tuplesBuilder;
      long long0 = 10L;
      KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = long0;
      kafkaSpoutConfig1.kafkaProps = kafkaSpoutConfig0.kafkaProps;
      int int0 = 1247;
      KafkaSpoutConfig.DEFAULT_MAX_RETRIES = int0;
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig1.getKafkaSpoutStreams();
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutRetryService kafkaSpoutRetryService0 = kafkaSpoutConfig0.getRetryService();
      kafkaSpoutConfig0.valueDeserializer = kafkaSpoutConfig1.valueDeserializer;
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutConfig2 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutConfig.FirstPollOffsetStrategy>();
      int int1 = kafkaSpoutConfig2.getMaxUncommittedOffsets();
      KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Keyword> kafkaSpoutConfig3 = new KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Keyword>();
      Deserializer<KafkaSpoutConfig.FirstPollOffsetStrategy> deserializer0 = kafkaSpoutConfig3.getKeyDeserializer();
      String string0 = kafkaSpoutConfig1.toString();
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      Integer integer0 = new Integer(kafkaSpoutConfig1.DEFAULT_MAX_RETRIES);
      // Undeclared exception!
      try { 
        persistentArrayMap0.put(integer0, kafkaSpoutConfig2);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Map<String, Object> map0 = null;
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig<Object, Keyword> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Keyword>();
      KafkaSpoutTuplesBuilder<Object, Keyword> kafkaSpoutTuplesBuilder0 = kafkaSpoutConfig0.getTuplesBuilder();
      KafkaSpoutConfig<Object, Integer> kafkaSpoutConfig1 = new KafkaSpoutConfig<Object, Integer>();
      long long0 = kafkaSpoutConfig1.getOffsetsCommitPeriodMs();
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsNamedTopics, Integer>();
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Integer> kafkaSpoutConfig2 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Integer>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig2.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Keyword> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Keyword>();
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      kafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams0;
      String string0 = kafkaSpoutConfig0.toString();
      Deserializer<KafkaSpoutConfig.FirstPollOffsetStrategy> deserializer0 = kafkaSpoutConfig0.getKeyDeserializer();
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsNamedTopics, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsNamedTopics, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsNamedTopics, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsNamedTopics, String>(kafkaSpoutTupleBuilder0);
      long long0 = (-286L);
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, KafkaSpoutStreamsWildcardTopics>();
      long long0 = kafkaSpoutConfig0.getOffsetsCommitPeriodMs();
      KafkaSpoutConfig.Builder<Keyword, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Keyword, Integer>();
      long long1 = 0L;
      long long2 = 1L;
      KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = long2;
      KafkaSpoutConfig.Builder<Keyword, Integer> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setPollTimeoutMs(long1);
      KafkaSpoutConfig.Builder<Keyword, Integer> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setOffsetCommitPeriodMs(kafkaSpoutConfig_Builder0.offsetCommitPeriodMs);
      int int0 = 45;
      KafkaSpoutConfig.Builder<Keyword, Integer> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setMaxUncommittedOffsets(int0);
      KafkaSpoutConfig.Builder<Keyword, Integer> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setValueDeserializer(kafkaSpoutConfig_Builder0.keyDeserializer);
      PersistentTreeMap persistentTreeMap0 = PersistentTreeMap.EMPTY;
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      KafkaSpoutConfig<Integer, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, Object>();
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, Integer>(kafkaSpoutConfig0.kafkaProps, kafkaSpoutConfig0.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      KafkaSpoutConfig<Object, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Object>();
      long long0 = (-666L);
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      Map<String, Object> map0 = kafkaSpoutConfig0.getKafkaProps();
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object> kafkaSpoutConfig1 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object>();
      KafkaSpoutTuplesBuilder<KafkaSpoutStreamsNamedTopics, Object> kafkaSpoutTuplesBuilder0 = null;
      kafkaSpoutConfig1.tuplesBuilder = kafkaSpoutConfig0.tuplesBuilder;
      kafkaSpoutConfig1.offsetCommitPeriodMs = kafkaSpoutConfig0.DEFAULT_POLL_TIMEOUT_MS;
      long long1 = kafkaSpoutConfig1.getPollTimeoutMs();
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>();
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>();
      SerializableDeserializer<KafkaSpoutStreamsWildcardTopics> serializableDeserializer0 = (SerializableDeserializer<KafkaSpoutStreamsWildcardTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(kafkaSpoutConfig_Builder0.maxUncommittedOffsets);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setOffsetCommitPeriodMs(kafkaSpoutConfig_Builder0.offsetCommitPeriodMs);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setFirstPollOffsetStrategy(kafkaSpoutConfig_Builder1.firstPollOffsetStrategy);
      KafkaSpoutConfig.Builder<Keyword, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutConfig_Builder5 = new KafkaSpoutConfig.Builder<Keyword, KafkaSpoutConfig.FirstPollOffsetStrategy>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig.Builder<Keyword, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      int int0 = 0;
      KafkaSpoutConfig.Builder<Keyword, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setMaxUncommittedOffsets(int0);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder7.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      PersistentHashMap persistentHashMap0 = PersistentHashMap.create(objectArray0);
      KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(persistentHashMap0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      KafkaSpoutConfig<Keyword, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Keyword, Object>();
      Deserializer<Keyword> deserializer0 = kafkaSpoutConfig0.getKeyDeserializer();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) kafkaSpoutConfig0;
      Object object0 = new Object();
      objectArray0[2] = (Object) deserializer0;
      objectArray0[3] = (Object) kafkaSpoutConfig0;
      objectArray0[4] = (Object) kafkaSpoutConfig0;
      objectArray0[5] = (Object) kafkaSpoutConfig0;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(objectArray0);
      KafkaSpoutConfig.Builder<Integer, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, KafkaSpoutStreamsWildcardTopics>(persistentArrayMap0, kafkaSpoutConfig0.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder, kafkaSpoutConfig0.retryService);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object>();
      int int0 = 4199;
      KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS = int0;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.getConsumerGroupId();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      long long0 = 836L;
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      Deserializer<KafkaSpoutStreamsWildcardTopics> deserializer0 = kafkaSpoutConfig0.getValueDeserializer();
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      KafkaSpoutConfig<Keyword, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Keyword, KafkaSpoutStreamsNamedTopics>();
      long long0 = kafkaSpoutConfig0.getOffsetsCommitPeriodMs();
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      KafkaSpoutConfig<Integer, Keyword> kafkaSpoutConfig1 = new KafkaSpoutConfig<Integer, Keyword>();
      long long1 = kafkaSpoutConfig1.getPollTimeoutMs();
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(kafkaSpoutConfig1.kafkaProps, kafkaSpoutConfig1.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder, kafkaSpoutConfig1.retryService);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics>();
      SerializableDeserializer<KafkaSpoutStreamsNamedTopics> serializableDeserializer0 = null;
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setValueDeserializer(serializableDeserializer0);
      KafkaSpoutConfig<Integer, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, Integer>();
      long long0 = 100L;
      kafkaSpoutConfig0.tuplesBuilder = kafkaSpoutConfig_Builder0.tuplesBuilder;
      kafkaSpoutConfig0.offsetCommitPeriodMs = long0;
      kafkaSpoutConfig0.pollTimeoutMs = kafkaSpoutConfig_Builder0.pollTimeoutMs;
      long long1 = kafkaSpoutConfig0.getPollTimeoutMs();
      KafkaSpoutConfig<Integer, String> kafkaSpoutConfig1 = new KafkaSpoutConfig<Integer, String>();
      Deserializer<String> deserializer0 = kafkaSpoutConfig1.getValueDeserializer();
      KafkaSpoutConfig.Builder<Integer, Object> kafkaSpoutConfig_Builder2 = null;
      try {
        kafkaSpoutConfig_Builder2 = new KafkaSpoutConfig.Builder<Integer, Object>(kafkaSpoutConfig_Builder1.kafkaProps, kafkaSpoutConfig1.kafkaSpoutStreams, kafkaSpoutConfig1.tuplesBuilder, kafkaSpoutConfig1.retryService);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      KafkaSpoutConfig<Integer, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, Object>();
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      kafkaSpoutConfig_Builder0.maxUncommittedOffsets = kafkaSpoutConfig0.DEFAULT_MAX_RETRIES;
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      kafkaSpoutConfig_Builder0.firstPollOffsetStrategy = kafkaSpoutConfig_Builder1.firstPollOffsetStrategy;
      KafkaSpoutConfig<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig1 = null;
      try {
        kafkaSpoutConfig1 = new KafkaSpoutConfig<String, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutConfig_Builder1);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>();
      long long0 = 1546L;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(long0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setPollTimeoutMs(kafkaSpoutConfig_Builder0.maxUncommittedOffsets);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setKeyDeserializer(kafkaSpoutConfig_Builder1.valueDeserializer);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Object>();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) kafkaSpoutConfig_Builder0;
      objectArray0[1] = (Object) kafkaSpoutConfig_Builder0;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(objectArray0);
      kafkaSpoutConfig_Builder0.kafkaProps = (Map<String, Object>) persistentArrayMap0;
      long long0 = 100L;
      int int0 = 0;
      kafkaSpoutConfig_Builder0.maxUncommittedOffsets = int0;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(long0);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(kafkaSpoutConfig_Builder0.maxUncommittedOffsets);
      KafkaSpoutConfig<String, Object> kafkaSpoutConfig0 = null;
      try {
        kafkaSpoutConfig0 = new KafkaSpoutConfig<String, Object>(kafkaSpoutConfig_Builder2);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(objectArray0);
      KafkaSpoutConfig<String, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, Object>();
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig0.getKafkaSpoutStreams();
      KafkaSpoutConfig.Builder<String, Keyword> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Keyword>(persistentArrayMap0, kafkaSpoutStreams0, kafkaSpoutConfig0.tuplesBuilder);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      KafkaSpoutConfig<Object, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Integer>();
      Map<String, Object> map0 = kafkaSpoutConfig0.getKafkaProps();
      kafkaSpoutConfig0.kafkaProps = map0;
      long long0 = kafkaSpoutConfig0.getOffsetsCommitPeriodMs();
      KafkaSpoutConfig<String, Object> kafkaSpoutConfig1 = new KafkaSpoutConfig<String, Object>();
      Deserializer<String> deserializer0 = kafkaSpoutConfig1.getKeyDeserializer();
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig2 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, String>();
      long long1 = kafkaSpoutConfig2.getOffsetsCommitPeriodMs();
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      KafkaSpoutConfig<Integer, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, Object>();
      Pattern pattern0 = kafkaSpoutConfig0.getTopicWildcardPattern();
      String string0 = kafkaSpoutConfig0.toString();
      Pattern pattern1 = kafkaSpoutConfig0.getTopicWildcardPattern();
      KafkaSpoutConfig<Integer, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig1 = new KafkaSpoutConfig<Integer, KafkaSpoutStreamsWildcardTopics>();
      long long0 = 10000000L;
      kafkaSpoutConfig1.offsetCommitPeriodMs = long0;
      KafkaSpoutTuplesBuilder<Integer, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilder0 = kafkaSpoutConfig1.getTuplesBuilder();
      KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Object> kafkaSpoutConfig2 = new KafkaSpoutConfig<KafkaSpoutConfig.FirstPollOffsetStrategy, Object>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = kafkaSpoutConfig2.getFirstPollOffsetStrategy();
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics>();
      SerializableDeserializer<KafkaSpoutStreamsWildcardTopics> serializableDeserializer0 = (SerializableDeserializer<KafkaSpoutStreamsWildcardTopics>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setValueDeserializer(serializableDeserializer0);
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics>();
      long long0 = 32L;
      kafkaSpoutConfig0.offsetCommitPeriodMs = long0;
      Map<String, Object> map0 = null;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(map0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      KafkaSpoutConfig<String, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, KafkaSpoutStreamsWildcardTopics>();
      long long0 = 0L;
      KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = long0;
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig1 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, KafkaSpoutStreamsWildcardTopics>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig1.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      long long0 = (-2824L);
      KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = long0;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      KafkaSpoutConfig<Object, Keyword> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Keyword>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.getConsumerGroupId();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String>();
      StringDeserializer stringDeserializer0 = new StringDeserializer();
      kafkaSpoutConfig0.valueDeserializer = (Deserializer<String>) stringDeserializer0;
      KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = kafkaSpoutConfig0.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.EMPTY;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(persistentHashMap0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      KafkaSpoutConfig<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, KafkaSpoutStreamsNamedTopics>();
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, String>();
      long long0 = 1L;
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      String string0 = kafkaSpoutConfig0.toString();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      Object object6 = new Object();
      objectArray0[6] = object6;
      Object object7 = new Object();
      objectArray0[7] = object7;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(objectArray0);
      String[] stringArray0 = new String[4];
      String string0 = "hbq5eWD JMv";
      stringArray0[0] = string0;
      String string1 = "EARLIEST";
      stringArray0[1] = string1;
      String string2 = "i";
      stringArray0[2] = string2;
      String string3 = "0dk)Xn0_;a>GT6u^";
      stringArray0[3] = string3;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(stringArray0[2]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<String, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<String, KafkaSpoutConfig.FirstPollOffsetStrategy>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutConfig.FirstPollOffsetStrategy> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<String, KafkaSpoutConfig.FirstPollOffsetStrategy>(kafkaSpoutTupleBuilder0);
      KafkaSpoutTuplesBuilder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutTuplesBuilder0 = null;
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilder0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify at last one tuple builder per topic declared in KafkaSpoutStreams
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }
}