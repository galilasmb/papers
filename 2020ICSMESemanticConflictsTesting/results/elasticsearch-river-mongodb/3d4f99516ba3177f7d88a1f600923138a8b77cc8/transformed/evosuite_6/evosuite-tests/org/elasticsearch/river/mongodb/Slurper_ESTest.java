/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 15:30:08 GMT 2020
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBDecoderFactory;
import com.mongodb.DBObject;
import com.mongodb.LazyDBList;
import com.mongodb.LazyDBObject;
import com.mongodb.LazyWriteableDBObject;
import com.mongodb.Mongo;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.TaggableReadPreference;
import com.mongodb.WriteConcern;
import java.io.File;
import java.io.PrintStream;
import java.net.InetAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.bson.BasicBSONObject;
import org.bson.LazyBSONCallback;
import org.bson.io.BSONByteBuffer;
import org.bson.types.ObjectId;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.collect.ImmutableList;
import org.elasticsearch.common.logging.ESLoggerFactory;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.mapper.SourceToParse;
import org.elasticsearch.node.settings.NodeSettingsService;
import org.elasticsearch.river.RiverSettings;
import org.elasticsearch.river.mongodb.MongoDBRiver;
import org.elasticsearch.river.mongodb.MongoDBRiverDefinition;
import org.elasticsearch.river.mongodb.Operation;
import org.elasticsearch.river.mongodb.SharedContext;
import org.elasticsearch.river.mongodb.Slurper;
import org.elasticsearch.river.mongodb.Status;
import org.elasticsearch.river.mongodb.Timestamp;
import org.elasticsearch.script.ScriptEngineService;
import org.elasticsearch.script.ScriptService;
import org.elasticsearch.search.aggregations.support.ValuesSource;
import org.elasticsearch.search.fetch.FetchSubPhase;
import org.elasticsearch.watcher.ResourceWatcherService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Slurper_ESTest extends Slurper_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = "=M?Q'R";
      int int0 = 2;
      ServerAddress serverAddress0 = new ServerAddress(string0, int0);
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0);
      Settings settings0 = NodeSettingsService.getGlobalSettings();
      FetchSubPhase.HitContext fetchSubPhase_HitContext0 = new FetchSubPhase.HitContext();
      Map<String, Object> map0 = fetchSubPhase_HitContext0.cache();
      RiverSettings riverSettings0 = new RiverSettings(settings0, map0);
      Environment environment0 = new Environment(settings0);
      HashSet<ScriptEngineService> hashSet0 = new HashSet<ScriptEngineService>(int0, int0);
      ResourceWatcherService resourceWatcherService0 = null;
      ScriptService scriptService0 = null;
      try {
        scriptService0 = new ScriptService(settings0, environment0, hashSet0, resourceWatcherService0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.script.ScriptService", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = ")\"_yG";
      List<ServerAddress> list0 = null;
      Slurper slurper1 = null;
      try {
        slurper1 = new Slurper(list0, slurper0.definition, slurper0.context, slurper0.client);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-26);
      byteArray0[0] = byte0;
      byte byte1 = (byte)27;
      byteArray0[1] = byte1;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(byteArray0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.getObjectIdFromOplogEntry(lazyDBObject0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.run();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "K;vJo\\_q4I)\"M";
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      AtomicLong atomicLong0 = null;
      slurper0.totalDocuments = atomicLong0;
      // Undeclared exception!
      try { 
        slurper0.processFullOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.getCurrentOplogTimestamp();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      AtomicLong atomicLong0 = slurper0.totalDocuments;
      slurper0.totalDocuments = atomicLong0;
      Slurper.SlurperException slurper_SlurperException0 = slurper0.new SlurperException(slurper0.cmdOplogNamespace);
      // Undeclared exception!
      try { 
        slurper0.riverHasIndexedFromOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)7;
      byteArray0[0] = byte0;
      byte byte1 = (byte)57;
      byteArray0[1] = byte1;
      byte byte2 = (byte)53;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-125);
      byteArray0[3] = byte3;
      // Undeclared exception!
      try { 
        slurper0.processFullOplog();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.assignCollections();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.assignCollections();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      // Undeclared exception!
      try { 
        slurper0.isIndexEmpty();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DB dB0 = slurper0.oplogDb;
      slurper0.slurpedDb = dB0;
      // Undeclared exception!
      try { 
        slurper0.isIndexEmpty();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.MongoDBRiver", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      BasicDBObject basicDBObject0 = MongoDBRiverDefinition.convertToBasicDBObject(slurper0.cmdOplogNamespace);
      boolean boolean0 = basicDBObject0.getBoolean(string0);
      String string1 = "";
      BasicDBObject basicDBObject1 = slurper0.getFilterForInitialImport(basicDBObject0, string1);
      String string2 = "@=^";
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = null;
      BasicDBObject basicDBObject0 = null;
      String string1 = "#$ %9\\DT,@T4Y";
      BasicDBObject basicDBObject1 = slurper0.getFilterForInitialImport(basicDBObject0, string1);
      // Undeclared exception!
      try { 
        slurper0.getCollectionFromNamespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte) (-10);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-97);
      byteArray0[1] = byte1;
      byte byte2 = (byte)71;
      byteArray0[2] = byte2;
      byte byte3 = (byte)46;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-60);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-46);
      byteArray0[5] = byte5;
      byte byte6 = (byte)127;
      byteArray0[6] = byte6;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBList lazyDBList0 = new LazyDBList(byteArray0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.applyFieldFilter(lazyDBList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "T_M,";
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      ServerAddress serverAddress0 = new ServerAddress(inetAddress0);
      ServerAddress serverAddress1 = new ServerAddress(slurper0.gridfsOplogNamespace);
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress1, serverAddress0, serverAddress1, serverAddress1);
      Slurper slurper1 = null;
      try {
        slurper1 = new Slurper(immutableList0, slurper0.definition, slurper0.context, slurper0.client);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "";
      BasicDBObject basicDBObject0 = new BasicDBObject(string0, string0);
      slurper0.flattenOps(basicDBObject0);
      String string1 = "";
      double double0 = 0.0;
      // Undeclared exception!
      try { 
        basicDBObject0.getDouble(string1, double0);
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("org.bson.BasicBSONObject", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Slurper.SlurperException slurper_SlurperException0 = slurper0.new SlurperException();
      DBCollection dBCollection0 = slurper0.oplogCollection;
      // Undeclared exception!
      try { 
        slurper0.doInitialImport(dBCollection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Slurper slurper1 = new Slurper();
      slurper1.findKeys = slurper0.findKeys;
      // Undeclared exception!
      try { 
        slurper1.filterMatch(slurper0.findKeys, slurper0.findKeys);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)5;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte)7;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-41);
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte)65;
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-79);
      byteArray0[6] = byte6;
      byte byte7 = (byte)7;
      byteArray0[7] = byte7;
      byte byte8 = (byte)0;
      byteArray0[8] = byte8;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      int int0 = (-2868);
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      LazyDBObject lazyDBObject0 = new LazyDBObject(bSONByteBuffer0, int0, lazyBSONCallback0);
      // Undeclared exception!
      try { 
        slurper0.filterMatch(lazyDBObject0, lazyDBObject0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      Slurper.SlurperException slurper_SlurperException0 = slurper0.new SlurperException(slurper0.cmdOplogNamespace);
      Throwable[] throwableArray0 = slurper_SlurperException0.getSuppressed();
      slurper_SlurperException0.printStackTrace();
      Environment environment0 = new Environment();
      File file0 = environment0.workWithClusterFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) slurper0.gridfsOplogNamespace);
      slurper_SlurperException0.printStackTrace(printStream0);
      String string0 = "A mongoDB cursor bug ?";
      // Undeclared exception!
      try { 
        slurper0.updateIndexRefresh(string0, slurper_SlurperException0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      String string0 = "mO>!M";
      MongoDBRiver.QueueEntry mongoDBRiver_QueueEntry0 = new MongoDBRiver.QueueEntry(slurper0.findKeys, string0);
      DBObject dBObject0 = mongoDBRiver_QueueEntry0.getData();
      // Undeclared exception!
      try { 
        slurper0.getObjectIdFromOplogEntry(dBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      Slurper slurper0 = new Slurper();
      BasicDBObject basicDBObject0 = new BasicDBObject();
      String string0 = "";
      Mongo mongo0 = slurper0.mongo;
      slurper0.mongo = mongo0;
      MongoDBRiver.QueueEntry mongoDBRiver_QueueEntry0 = new MongoDBRiver.QueueEntry(basicDBObject0, string0);
      DBObject dBObject0 = mongoDBRiver_QueueEntry0.getData();
      String string1 = slurper0.getObjectIdFromOplogEntry(dBObject0);
      // Undeclared exception!
      try { 
        slurper0.applyFieldFilter(dBObject0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }
}
