/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 18:26:09 GMT 2020
 */

package org.webbitserver.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.http.DefaultHttpRequest;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.junit.runner.RunWith;
import org.webbitserver.HttpRequest;
import org.webbitserver.WebSocket;
import org.webbitserver.WebSocketHandler;
import org.webbitserver.handler.ReconnectingWebSocketHandler;
import org.webbitserver.netty.NettyHttpRequest;
import org.webbitserver.netty.NettyWebSocketConnection;
import org.webbitserver.netty.WebSocketClient;
import org.webbitserver.stub.StubConnection;
import org.webbitserver.stub.StubHttpRequest;
import org.webbitserver.wrapper.WebSocketConnectionWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketClient_ESTest extends WebSocketClient_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String string0 = "";
          URI uRI0 = MockURI.create(string0);
          WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
          WebSocket webSocket0 = null;
          long long0 = (-1L);
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocket0, long0);
          StubConnection stubConnection0 = new StubConnection();
          String string1 = "0000";
          StubConnection stubConnection1 = stubConnection0.send(string1);
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0, stubConnection1);
          WebSocketClient webSocketClient1 = webSocketClient0.start();
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "keep-alive";
      URI uRI0 = MockURI.create(string0);
      WebSocketHandler webSocketHandler0 = null;
      int int0 = (-491);
      int int1 = 117;
      long long0 = 0L;
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      PriorityBlockingQueue<Runnable> priorityBlockingQueue0 = new PriorityBlockingQueue<Runnable>();
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = null;
      try {
        threadPoolExecutor0 = new ThreadPoolExecutor(int0, int1, long0, timeUnit0, priorityBlockingQueue0, threadPoolExecutor_CallerRunsPolicy0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ThreadPoolExecutor", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      String string0 = "L3^!3JIUCd1]s}ETm-";
      URI uRI0 = MockURI.aFTPURI;
      URI uRI1 = MockURI.aFileURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      int int0 = 1902;
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0, threadPoolExecutor_DiscardOldestPolicy0);
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, scheduledThreadPoolExecutor0);
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, int0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI1, reconnectingWebSocketHandler0);
      // Undeclared exception!
      try { 
        webSocketClient1.start();
      } catch(RuntimeException e) {
         //
         // Failed to initialize a pipeline.
         //
         verifyException("org.jboss.netty.bootstrap.ClientBootstrap", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      URI uRI0 = null;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      boolean boolean0 = true;
      ForkJoinPool forkJoinPool0 = null;
      try {
        forkJoinPool0 = new ForkJoinPool(int0, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, boolean0);
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ForkJoinPool", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      URI uRI0 = null;
      // Undeclared exception!
      try { 
        MockURI.relativize(uRI0, uRI0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      String string0 = "";
      URI uRI1 = MockURI.resolve(uRI0, string0);
      URI uRI2 = MockURI.normalize(uRI1);
      WebSocketHandler webSocketHandler0 = null;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, forkJoinPool0);
      long long0 = 0L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI2, reconnectingWebSocketHandler0);
      WebSocketClient webSocketClient2 = webSocketClient1.reconnectEvery(long0);
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      WebSocket webSocket0 = webSocketClient2.uncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = "Sec-WebSocket-Version";
      int int0 = 98;
      String string1 = "";
      String string2 = "c=Ko^xI:7R~IcTfM";
      String string3 = ".#.BH";
      URI uRI0 = MockURI.URI(string0, string0, string0, int0, string1, string2, string3);
      String string4 = "wsdecoder";
      URI uRI1 = MockURI.resolve(uRI0, string4);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinPool_ForkJoinWorkerThreadFactory0 = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      boolean boolean0 = false;
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(int0, forkJoinPool_ForkJoinWorkerThreadFactory0, thread_UncaughtExceptionHandler0, boolean0);
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, forkJoinPool0);
      long long0 = (-1215L);
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI1, reconnectingWebSocketHandler0);
      // Undeclared exception!
      try { 
        webSocketClient1.start();
      } catch(RuntimeException e) {
         //
         // Failed to initialize a pipeline.
         //
         verifyException("org.jboss.netty.bootstrap.ClientBootstrap", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      URI uRI0 = null;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "{5$^I<9]T> ";
      String string1 = "j%Cv=vAzr_ND1lq1";
      try { 
        MockURI.URI(string0, string1, string0, string0, string0);
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: {5$^I<9]T> ://j%25Cv=vAzr_ND1lq1%7B5$%5EI%3C9%5DT%3E%20?%7B5$%5EI%3C9]T%3E%20#%7B5$%5EI%3C9]T%3E%20
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          int int0 = (-1082953237);
          Random.setNextRandom(int0);
          Random.setNextRandom(int0);
          int int1 = (-454);
          Random.setNextRandom(int1);
          String string0 = "localhost";
          URI uRI0 = MockURI.create(string0);
          WebSocketHandler webSocketHandler0 = null;
          StubConnection stubConnection0 = new StubConnection();
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, stubConnection0);
          long long0 = 0L;
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
          WebSocketClient webSocketClient1 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0);
          WebSocketClient webSocketClient2 = webSocketClient1.start();
          int int2 = (-1);
          Random.setNextRandom(int2);
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      String string0 = "";
      URI uRI1 = MockURI.resolve(uRI0, string0);
      WebSocketHandler webSocketHandler0 = null;
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      long long0 = 1000000L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      StubConnection stubConnection0 = new StubConnection();
      StubConnection stubConnection1 = stubConnection0.ping(string0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI1, reconnectingWebSocketHandler0, stubConnection1);
      WebSocketClient webSocketClient2 = webSocketClient1.reconnectEvery(long0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        webSocketClient2.setupSsl(pipedInputStream0, string0);
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.webbitserver.helpers.SslFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String string0 = "";
          URI uRI0 = MockURI.create(string0);
          WebSocketHandler webSocketHandler0 = null;
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
          Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = null;
          WebSocket webSocket0 = webSocketClient0.uncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
          Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler1 = MockThread.getDefaultUncaughtExceptionHandler();
          WebSocket webSocket1 = webSocketClient0.connectionExceptionHandler(thread_UncaughtExceptionHandler1);
          WebSocket webSocket2 = webSocketClient0.connectionExceptionHandler(thread_UncaughtExceptionHandler1);
          WebSocketClient webSocketClient1 = webSocketClient0.start();
          byte[] byteArray0 = new byte[7];
          byte byte0 = (byte)120;
          byteArray0[0] = byte0;
          byte byte1 = (byte)0;
          byteArray0[1] = byte1;
          byte byte2 = (byte) (-120);
          byteArray0[2] = byte2;
          byte byte3 = (byte) (-41);
          byteArray0[3] = byte3;
          byte byte4 = (byte)27;
          byteArray0[4] = byte4;
          byte byte5 = (byte)0;
          byteArray0[5] = byte5;
          byte byte6 = (byte) (-87);
          byteArray0[6] = byte6;
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          String string1 = "org.webbitserver.handler.ReconnectingWebSocketHandler";
          // Undeclared exception!
          try { 
            webSocketClient0.setupSsl(byteArrayInputStream0, string1);
          } catch(RuntimeException e) {
             //
             // java.io.EOFException
             //
             verifyException("org.webbitserver.helpers.SslFactory", e);
          }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      int int0 = 1;
      int int1 = 1777;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      PriorityBlockingQueue<Runnable> priorityBlockingQueue0 = new PriorityBlockingQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.AbortPolicy threadPoolExecutor_AbortPolicy0 = new ThreadPoolExecutor.AbortPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(int0, int1, int1, timeUnit0, priorityBlockingQueue0, threadFactory0, threadPoolExecutor_AbortPolicy0);
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, threadPoolExecutor0);
      // Undeclared exception!
      try { 
        webSocketClient0.start();
      } catch(RuntimeException e) {
         //
         // Failed to initialize a pipeline.
         //
         verifyException("org.jboss.netty.bootstrap.ClientBootstrap", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      URI uRI0 = null;
      WebSocketHandler webSocketHandler0 = null;
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
      String string2 = "org.webbitserver.stub.StubConnection";
      String string3 = "org.jboss.netty.handler.codec.http.DefaultHttpRequest";
      URI uRI0 = MockURI.URI(string0, string1, string2, string3);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      int int0 = 504;
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor.DiscardPolicy threadPoolExecutor_DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0, threadFactory0, threadPoolExecutor_DiscardPolicy0);
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, scheduledThreadPoolExecutor0);
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      WebSocket webSocket0 = webSocketClient0.connectionExceptionHandler(thread_UncaughtExceptionHandler0);
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocket0, int0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0, scheduledThreadPoolExecutor0);
      long long0 = (-1469L);
      WebSocketClient webSocketClient2 = webSocketClient1.reconnectEvery(long0);
      // Undeclared exception!
      try { 
        webSocketClient1.close();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.webbitserver.netty.WebSocketClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      WebSocketHandler webSocketHandler0 = null;
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      WebSocketHandler webSocketHandler0 = null;
      Executor executor0 = null;
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, executor0);
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      URI uRI0 = null;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0, forkJoinPool0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String string0 = "";
          URI uRI0 = MockURI.create(string0);
          URI uRI1 = MockURI.normalize(uRI0);
          URI uRI2 = MockURI.parseServerAuthority(uRI1);
          URI uRI3 = MockURI.relativize(uRI2, uRI0);
          WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI1, webSocketHandler0);
          long long0 = 0L;
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
          String string1 = "kiB])UJbYX3A9U";
          StubHttpRequest stubHttpRequest0 = new StubHttpRequest(string1);
          StubConnection stubConnection0 = new StubConnection(stubHttpRequest0);
          WebSocketConnectionWrapper webSocketConnectionWrapper0 = new WebSocketConnectionWrapper(stubConnection0);
          WebSocketClient webSocketClient1 = new WebSocketClient(uRI3, reconnectingWebSocketHandler0, webSocketConnectionWrapper0);
          WebSocketClient webSocketClient2 = webSocketClient1.start();
          WebSocketClient webSocketClient3 = webSocketClient2.start();
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          URI uRI0 = MockURI.aFileURI;
          URI uRI1 = MockURI.parseServerAuthority(uRI0);
          URI uRI2 = MockURI.relativize(uRI1, uRI0);
          String string0 = "wshandler";
          URI uRI3 = MockURI.resolve(uRI2, string0);
          WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
          Executor executor0 = null;
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI2, webSocketHandler0, executor0);
          long long0 = (-767L);
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
          WebSocketClient webSocketClient1 = new WebSocketClient(uRI3, reconnectingWebSocketHandler0);
          WebSocketClient webSocketClient2 = webSocketClient1.start();
          Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
          WebSocket webSocket0 = webSocketClient2.connectionExceptionHandler(thread_UncaughtExceptionHandler0);
          WebSocket webSocket1 = webSocketClient2.close();
          long long1 = 2991L;
          WebSocketClient webSocketClient3 = webSocketClient1.reconnectEvery(long1);
          // Undeclared exception!
          try { 
            webSocketClient0.start();
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.webbitserver.netty.WebSocketClient", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }
}