/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:37:13 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.APersistentVector;
import clojure.lang.IPersistentMap;
import clojure.lang.MapEntry;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Pattern;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff;
import org.apache.storm.kafka.spout.KafkaSpoutStream;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.KafkaSpoutTupleBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilderWildcardTopics;
import org.apache.storm.kafka.spout.SerializableDeserializer;
import org.apache.storm.topology.OutputFieldsGetter;
import org.apache.storm.tuple.Fields;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      objectArray0[0] = object0;
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
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(objectArray0);
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Object, KafkaSpoutStreamsWildcardTopics>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, KafkaSpoutStreamsWildcardTopics>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics>(persistentArrayMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<Object, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Object, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, String>(hashMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: {}
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[3];
      String string0 = "F!:0P[u/JBTxt";
      stringArray0[0] = string0;
      String string1 = "epto. 13}p;-i~";
      stringArray0[1] = string1;
      String string2 = "";
      stringArray0[2] = string2;
      Fields fields0 = new Fields(stringArray0);
      String string3 = "";
      int int0 = 0;
      Object object0 = hashMap0.put(stringArray0[0], stringArray0[2]);
      Pattern pattern0 = Pattern.compile(stringArray0[2]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string2, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      Stack<Integer> stack0 = new Stack<Integer>();
      Vector<Object> vector0 = new Vector<Object>(stack0);
      KafkaSpoutTupleBuilder<Integer, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Integer, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(kafkaSpoutTupleBuilder0).buildTuple(nullable(org.apache.kafka.clients.consumer.ConsumerRecord.class));
      KafkaSpoutTuplesBuilderWildcardTopics<Integer, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Integer, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, String>(hashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int1 = 1388;
      Integer integer0 = new Integer(int1);
      String string4 = "Must specify stream associated with each topic. Multiple topics can emit to the same stream";
      ConsumerRecord<Integer, String> consumerRecord0 = new ConsumerRecord<Integer, String>(stringArray0[0], int1, int0, integer0, string4);
      List<Object> list0 = kafkaSpoutTuplesBuilderWildcardTopics0.buildTuple(consumerRecord0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(int0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics1 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, String> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, String> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, String>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder3 = new KafkaSpoutConfig.Builder<Object, String>(hashMap0, kafkaSpoutStreamsWildcardTopics1, kafkaSpoutTuplesBuilderWildcardTopics1);
      SerializableDeserializer<Object> serializableDeserializer0 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder3.setKeyDeserializer(serializableDeserializer0);
      int int2 = (-1382);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder5 = kafkaSpoutConfig_Builder4.setMaxUncommittedOffsets(int2);
      KafkaSpoutTupleBuilder<String, Object> kafkaSpoutTupleBuilder2 = (KafkaSpoutTupleBuilder<String, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, Object> kafkaSpoutTuplesBuilderWildcardTopics2 = new KafkaSpoutTuplesBuilderWildcardTopics<String, Object>(kafkaSpoutTupleBuilder2);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder6 = new KafkaSpoutConfig.Builder<String, Object>(hashMap0, kafkaSpoutStreamsWildcardTopics1, kafkaSpoutTuplesBuilderWildcardTopics2);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setValueDeserializer(serializableDeserializer1);
      SerializableDeserializer<String> serializableDeserializer2 = null;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setKeyDeserializer(serializableDeserializer2);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder9 = kafkaSpoutConfig_Builder8.setMaxUncommittedOffsets(consumerRecord0.NULL_SIZE);
      long long0 = 2341L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder10 = kafkaSpoutConfig_Builder9.setPollTimeoutMs(long0);
      long long1 = 0L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder11 = kafkaSpoutConfig_Builder10.setPollTimeoutMs(long1);
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      Map<String, Object> map0 = null;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTupleBuilder<Object, APersistentVector.SubVector> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Object, APersistentVector.SubVector>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, APersistentVector.SubVector> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, APersistentVector.SubVector>(kafkaSpoutTupleBuilder0);
      long long0 = 0L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(long0);
      int int0 = 434;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<Object, APersistentVector.SubVector> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, APersistentVector.SubVector>(map0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilderWildcardTopics0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      KafkaSpoutConfig.FirstPollOffsetStrategy[] kafkaSpoutConfig_FirstPollOffsetStrategyArray0 = KafkaSpoutConfig.FirstPollOffsetStrategy.values();
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(kafkaSpoutConfig_FirstPollOffsetStrategyArray0);
      String[] stringArray0 = new String[9];
      String string0 = "Returns a sorted sequence of the items in coll. If no comparator is\n  supplied, uses compare.  comparator must implement\n  java.util.Comparator.  If coll is a Java array, it will be modified.\n  To avoid this, sort a copy of the array.";
      stringArray0[0] = string0;
      String string1 = "=*";
      stringArray0[1] = string1;
      String string2 = "N{Dc7uH}#(0:Dv";
      stringArray0[2] = string2;
      String string3 = ", pollTimeoutMs=";
      stringArray0[3] = string3;
      String string4 = "clojure.core$get__inliner__4390";
      stringArray0[4] = string4;
      String string5 = "lh>|2,,@D-cF";
      stringArray0[5] = string5;
      String string6 = "";
      stringArray0[6] = string6;
      String string7 = "h9";
      stringArray0[7] = string7;
      String string8 = "Returns the hash code of its argument. Note this is the hash code\n  consistent with =, and thus is different than .hashCode for Integer,\n  Short, Byte and Clojure collections.";
      stringArray0[8] = string8;
      Fields fields0 = new Fields(stringArray0);
      int int0 = (-5);
      Pattern pattern0 = Pattern.compile(stringArray0[2], int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<KafkaSpoutStreamsWildcardTopics, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(kafkaSpoutTupleBuilder0).buildTuple(nullable(org.apache.kafka.clients.consumer.ConsumerRecord.class));
      KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<KafkaSpoutStreamsWildcardTopics, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      Pattern pattern1 = kafkaSpoutStreamsWildcardTopics0.getTopicWildcardPattern();
      int int1 = 794;
      OutputFieldsGetter outputFieldsGetter0 = new OutputFieldsGetter();
      kafkaSpoutStreamsWildcardTopics0.declareOutputFields(outputFieldsGetter0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int1);
      Pattern pattern2 = kafkaSpoutStreamsWildcardTopics0.getTopicWildcardPattern();
      long long0 = 128L;
      String string9 = "clojure.core$byte_array";
      ConsumerRecord<KafkaSpoutStreamsWildcardTopics, String> consumerRecord0 = new ConsumerRecord<KafkaSpoutStreamsWildcardTopics, String>(string2, int0, long0, kafkaSpoutStreamsWildcardTopics0, string9);
      List<Object> list0 = kafkaSpoutTuplesBuilderWildcardTopics0.buildTuple(consumerRecord0);
      long long1 = 3917L;
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setOffsetCommitPeriodMs(long1);
      // Undeclared exception!
      try { 
        KafkaSpoutConfig.FirstPollOffsetStrategy.valueOf(stringArray0[1]);
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.=*
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = "";
      Object object0 = hashMap0.replace(string0, (Object) string0);
      Object object1 = hashMap0.clone();
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTuplesBuilder<Integer, Object> kafkaSpoutTuplesBuilder0 = null;
      KafkaSpoutConfig.Builder<Integer, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, Object>(hashMap0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilder0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: {}
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      Map<String, Object> map0 = null;
      KafkaSpoutStreams kafkaSpoutStreams0 = null;
      KafkaSpoutTuplesBuilder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutTuplesBuilder0 = null;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = null;
      int int0 = (-2864);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.microSeconds(int0);
      long long0 = 0L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval2 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(long0);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval1);
      String[] stringArray0 = new String[5];
      String string0 = ", keyDeserializer=";
      stringArray0[0] = string0;
      String string1 = "";
      stringArray0[1] = string1;
      String string2 = "Loh)rc^WIMm]m&";
      stringArray0[2] = string2;
      String string3 = "55-~&N{aDDNLY";
      stringArray0[3] = string3;
      String string4 = "HymVAnI8y0pEK04";
      stringArray0[4] = string4;
      Fields fields0 = new Fields(stringArray0);
      Pattern pattern0 = Pattern.compile(stringArray0[4]);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, stringArray0[4], pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      MapEntry mapEntry0 = new MapEntry(kafkaSpoutStreamsWildcardTopics0, stringArray0[4]);
      boolean boolean0 = kafkaSpoutRetryExponentialBackoff0.retainAll(mapEntry0);
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics>(map0, kafkaSpoutStreams0, kafkaSpoutTuplesBuilder0, kafkaSpoutRetryExponentialBackoff0);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createWithCheck(objectArray0);
      IPersistentMap iPersistentMap0 = PersistentHashMap.create((Map) persistentArrayMap0);
      PersistentArrayMap persistentArrayMap1 = persistentArrayMap0.withMeta(iPersistentMap0);
      PersistentArrayMap persistentArrayMap2 = persistentArrayMap1.withMeta(iPersistentMap0);
      String[] stringArray0 = new String[8];
      String string0 = "!z{\\";
      stringArray0[0] = string0;
      String string1 = "By";
      stringArray0[1] = string1;
      String string2 = "SI\"`|x'm!_(>Sb%J";
      stringArray0[2] = string2;
      String string3 = "";
      stringArray0[3] = string3;
      String string4 = "org.apache.storm.kafka.spout.KafkaSpoutConfig$1";
      stringArray0[4] = string4;
      String string5 = "EARLIEST";
      stringArray0[5] = string5;
      String string6 = "<(/x)N";
      stringArray0[6] = string6;
      String string7 = "auto.commit.interval.ms";
      stringArray0[7] = string7;
      Fields fields0 = new Fields(stringArray0);
      String string8 = "ytls";
      Pattern pattern0 = Pattern.compile(string1);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string8, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Integer, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Integer, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Integer, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Integer, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, String>(persistentArrayMap2, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      KafkaSpoutTupleBuilder<Object, Object> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, Object> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, Object>(kafkaSpoutTupleBuilder1);
      long long0 = (-2315L);
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long0);
      int int0 = (-4);
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = new KafkaSpoutConfig.Builder<Object, Object>(persistentArrayMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics1, kafkaSpoutRetryExponentialBackoff0);
  }

  @Test(timeout = 11000)
  public void test8()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[3];
      String string0 = "F!:0P[u/JBTxt";
      stringArray0[0] = string0;
      String string1 = "epto. 13}p;-i~";
      stringArray0[1] = string1;
      String string2 = "";
      stringArray0[2] = string2;
      Fields fields0 = new Fields(stringArray0);
      String string3 = "";
      int int0 = 0;
      Object object0 = hashMap0.put(stringArray0[0], stringArray0[2]);
      Pattern pattern0 = Pattern.compile(string3, int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string2, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Integer, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Integer, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(kafkaSpoutTupleBuilder0).buildTuple(nullable(org.apache.kafka.clients.consumer.ConsumerRecord.class));
      KafkaSpoutTuplesBuilderWildcardTopics<Integer, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Integer, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, String>(hashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int1 = 1388;
      Integer integer0 = new Integer(int1);
      String string4 = "Must specify stream associated with each topic. Multiple topics can emit to the same stream";
      ConsumerRecord<Integer, String> consumerRecord0 = new ConsumerRecord<Integer, String>(stringArray0[0], int1, int0, integer0, string4);
      List<Object> list0 = kafkaSpoutTuplesBuilderWildcardTopics0.buildTuple(consumerRecord0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<String> serializableDeserializer0 = (SerializableDeserializer<String>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setValueDeserializer(serializableDeserializer0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics1 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, String> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, String> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, String>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder4 = new KafkaSpoutConfig.Builder<Object, String>(hashMap0, kafkaSpoutStreamsWildcardTopics1, kafkaSpoutTuplesBuilderWildcardTopics1);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder5 = kafkaSpoutConfig_Builder4.setKeyDeserializer(serializableDeserializer1);
      int int2 = (-1382);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setMaxUncommittedOffsets(int2);
      SerializableDeserializer<String> serializableDeserializer2 = (SerializableDeserializer<String>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder7 = kafkaSpoutConfig_Builder6.setValueDeserializer(serializableDeserializer2);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
  }

  @Test(timeout = 11000)
  public void test9()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[3];
      String string0 = "F!:0P[u/JBTxt";
      stringArray0[0] = string0;
      String string1 = "epto. 13}p;-i~";
      stringArray0[1] = string1;
      String string2 = "";
      stringArray0[2] = string2;
      Fields fields0 = new Fields(stringArray0);
      String string3 = "";
      int int0 = 0;
      Object object0 = hashMap0.put(stringArray0[0], stringArray0[2]);
      Pattern pattern0 = Pattern.compile(string3, int0);
      KafkaSpoutStream kafkaSpoutStream0 = new KafkaSpoutStream(fields0, string2, pattern0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics0 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      Stack<Integer> stack0 = new Stack<Integer>();
      Vector<Object> vector0 = new Vector<Object>(stack0);
      KafkaSpoutTupleBuilder<Integer, String> kafkaSpoutTupleBuilder0 = (KafkaSpoutTupleBuilder<Integer, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      doReturn(vector0).when(kafkaSpoutTupleBuilder0).buildTuple(nullable(org.apache.kafka.clients.consumer.ConsumerRecord.class));
      KafkaSpoutTuplesBuilderWildcardTopics<Integer, String> kafkaSpoutTuplesBuilderWildcardTopics0 = new KafkaSpoutTuplesBuilderWildcardTopics<Integer, String>(kafkaSpoutTupleBuilder0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, String>(hashMap0, kafkaSpoutStreamsWildcardTopics0, kafkaSpoutTuplesBuilderWildcardTopics0);
      int int1 = 1388;
      Integer integer0 = new Integer(int1);
      String string4 = "Must specify stream associated with each topic. Multiple topics can emit to the same stream";
      ConsumerRecord<Integer, String> consumerRecord0 = new ConsumerRecord<Integer, String>(stringArray0[0], int1, int0, integer0, string4);
      List<Object> list0 = kafkaSpoutTuplesBuilderWildcardTopics0.buildTuple(consumerRecord0);
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(int0);
      SerializableDeserializer<String> serializableDeserializer0 = (SerializableDeserializer<String>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Integer, String> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setValueDeserializer(serializableDeserializer0);
      KafkaSpoutStreamsWildcardTopics kafkaSpoutStreamsWildcardTopics1 = new KafkaSpoutStreamsWildcardTopics(kafkaSpoutStream0);
      KafkaSpoutTupleBuilder<Object, String> kafkaSpoutTupleBuilder1 = (KafkaSpoutTupleBuilder<Object, String>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<Object, String> kafkaSpoutTuplesBuilderWildcardTopics1 = new KafkaSpoutTuplesBuilderWildcardTopics<Object, String>(kafkaSpoutTupleBuilder1);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder4 = new KafkaSpoutConfig.Builder<Object, String>(hashMap0, kafkaSpoutStreamsWildcardTopics1, kafkaSpoutTuplesBuilderWildcardTopics1);
      SerializableDeserializer<Object> serializableDeserializer1 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder5 = kafkaSpoutConfig_Builder4.setKeyDeserializer(serializableDeserializer1);
      int int2 = (-1382);
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder5.setMaxUncommittedOffsets(int2);
      KafkaSpoutTupleBuilder<String, Object> kafkaSpoutTupleBuilder2 = (KafkaSpoutTupleBuilder<String, Object>) mock(KafkaSpoutTupleBuilder.class, new ViolatedAssumptionAnswer());
      KafkaSpoutTuplesBuilderWildcardTopics<String, Object> kafkaSpoutTuplesBuilderWildcardTopics2 = new KafkaSpoutTuplesBuilderWildcardTopics<String, Object>(kafkaSpoutTupleBuilder2);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder7 = new KafkaSpoutConfig.Builder<String, Object>(hashMap0, kafkaSpoutStreamsWildcardTopics1, kafkaSpoutTuplesBuilderWildcardTopics2);
      SerializableDeserializer<Object> serializableDeserializer2 = (SerializableDeserializer<Object>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder8 = kafkaSpoutConfig_Builder7.setValueDeserializer(serializableDeserializer2);
      SerializableDeserializer<String> serializableDeserializer3 = null;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder9 = kafkaSpoutConfig_Builder8.setKeyDeserializer(serializableDeserializer3);
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder10 = kafkaSpoutConfig_Builder9.setMaxUncommittedOffsets(consumerRecord0.NULL_SIZE);
      long long0 = 2341L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder11 = kafkaSpoutConfig_Builder10.setPollTimeoutMs(long0);
      long long1 = 0L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder12 = kafkaSpoutConfig_Builder11.setPollTimeoutMs(long1);
  }
}