/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 23:45:51 GMT 2020
 */

package org.webbitserver.netty;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
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
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.junit.runner.RunWith;
import org.webbitserver.WebSocket;
import org.webbitserver.WebSocketConnection;
import org.webbitserver.WebSocketHandler;
import org.webbitserver.handler.ReconnectingWebSocketHandler;
import org.webbitserver.netty.WebSocketClient;
import org.webbitserver.stub.StubConnection;
import org.webbitserver.wrapper.WebSocketConnectionWrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebSocketClient_ESTest extends WebSocketClient_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.relativize(uRI0, uRI0);
      String string0 = "";
      URI uRI2 = MockURI.resolve(uRI1, string0);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      long long0 = (-396L);
      WebSocketClient webSocketClient1 = webSocketClient0.reconnectEvery(long0);
      webSocketClient1.exceptionHandler = webSocketClient0.ioExceptionHandler;
      long long1 = (-1L);
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient1, long1);
      WebSocketClient webSocketClient2 = new WebSocketClient(uRI2, reconnectingWebSocketHandler0, webSocketClient1.executor);
      Object object0 = WebSocketClient.nextId();
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      int int0 = 386;
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, int0);
      // Undeclared exception!
      try { 
        webSocketClient2.setupSsl(pushbackInputStream0, string0);
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.webbitserver.helpers.SslFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      long long0 = 4294967295L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      int int0 = 0;
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(int0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0, scheduledThreadPoolExecutor0);
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
  public void test02()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = MockThread.getDefaultUncaughtExceptionHandler();
      WebSocket webSocket0 = webSocketClient0.connectionExceptionHandler(thread_UncaughtExceptionHandler0);
      // Undeclared exception!
      try { 
        webSocketClient0.close();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.webbitserver.netty.WebSocketClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      String string0 = webSocketClient0.base64Nonce();
      byte byte0 = webSocketClient0.randomByte();
      long long0 = (-1213L);
      WebSocketClient webSocketClient1 = webSocketClient0.reconnectEvery(long0);
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
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      String string0 = "";
      pipedInputStream0.close();
      pipedInputStream0.close();
      String string1 = null;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-39);
      byteArray0[1] = byte0;
      int int0 = 13;
      // Undeclared exception!
      try { 
        pipedInputStream0.read(byteArray0, int0, (int) byteArray0[0]);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          String string0 = "o_e3lq$/~";
          URI uRI0 = MockURI.create(string0);
          WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
          WebSocketClient webSocketClient1 = webSocketClient0.start();
          long long0 = (-598L);
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient1, long0);
          WebSocketClient webSocketClient2 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0, webSocketClient1.executor);
          webSocketClient2.exceptionHandler = webSocketClient1.exceptionHandler;
          String string1 = webSocketClient2.base64Nonce();
          int int0 = 10;
          Random.setNextRandom(int0);
          WebSocketClient webSocketClient3 = webSocketClient1.start();
          WebSocketClient webSocketClient4 = webSocketClient3.start();
          String string2 = webSocketClient2.base64Nonce();
          WebSocketClient webSocketClient5 = webSocketClient4.start();
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URI uRI1 = MockURI.parseServerAuthority(uRI0);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = ForkJoinTask.getPool();
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI1, webSocketHandler0, forkJoinPool0);
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      // Undeclared exception!
      try { 
        webSocketClient0.close();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.webbitserver.netty.WebSocketClient", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-114);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      int int0 = (-2);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, int0, int0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      String string0 = "http";
      // Undeclared exception!
      try { 
        webSocketClient0.setupSsl(dataInputStream0, string0);
      } catch(RuntimeException e) {
         //
         // java.io.EOFException
         //
         verifyException("org.webbitserver.helpers.SslFactory", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      String string0 = "";
      HttpRequest httpRequest0 = webSocketClient0.createNettyHttpRequest(string0, string0);
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      boolean boolean0 = true;
      webSocketClient0.ssl = boolean0;
      InputStream inputStream0 = null;
      String string0 = "";
      WebSocketClient webSocketClient1 = webSocketClient0.setupSsl(inputStream0, string0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      Thread.UncaughtExceptionHandler thread_UncaughtExceptionHandler0 = webSocketClient0.exceptionHandler;
      WebSocket webSocket0 = webSocketClient0.uncaughtExceptionHandler(thread_UncaughtExceptionHandler0);
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "";
      URI uRI0 = MockURI.create(string0);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
      long long0 = 0L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0);
      String string1 = null;
      // Undeclared exception!
      try { 
        webSocketClient0.createNettyHttpRequest(string1, webSocketClient1.ACCEPT_GUID);
      } catch(NullPointerException e) {
         //
         // uri
         //
         verifyException("org.jboss.netty.handler.codec.http.DefaultHttpRequest", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          WebSocketClient webSocketClient0 = new WebSocketClient();
          int int0 = 0;
          MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(int0);
          webSocketClient0.remoteAddress = (InetSocketAddress) mockInetSocketAddress0;
          // Undeclared exception!
          try { 
            webSocketClient0.start();
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.webbitserver.netty.WebSocketClient", e);
          }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String string0 = "Connection";
          String string1 = "HX((q[?\"]4P0";
          int int0 = 2304;
          String string2 = null;
          String string3 = "http";
          URI uRI0 = MockURI.URI(string0, string1, string0, int0, string2, string1, string3);
          URI uRI1 = MockURI.relativize(uRI0, uRI0);
          URI uRI2 = MockURI.normalize(uRI1);
          WebSocketHandler webSocketHandler0 = null;
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI2, webSocketHandler0);
          WebSocketClient webSocketClient1 = webSocketClient0.start();
          String string4 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
          HttpRequest httpRequest0 = webSocketClient0.createNettyHttpRequest(webSocketClient1.ACCEPT_GUID, string4);
          String string5 = webSocketClient0.base64Nonce();
          MockFileInputStream mockFileInputStream0 = null;
          try {
            mockFileInputStream0 = new MockFileInputStream(string2);
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      String string0 = "d";
      String string1 = "i";
      URI uRI0 = MockURI.URI(string0, string1, string0);
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
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
      URI uRI0 = MockURI.aFileURI;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocketClient webSocketClient0 = new WebSocketClient();
      long long0 = 0L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
      WebSocketClient webSocketClient1 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0);
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
  public void test17()  throws Throwable  {
      WebSocketClient webSocketClient0 = new WebSocketClient();
      long long0 = 0L;
      WebSocketClient webSocketClient1 = webSocketClient0.reconnectEvery(long0);
      webSocketClient0.sslFactory = webSocketClient1.sslFactory;
      WebSocketClient.ACCEPT_GUID = webSocketClient0.base64Nonce;
      long long1 = (-2094L);
      // Undeclared exception!
      try { 
        webSocketClient0.start();
      } catch(NullPointerException e) {
         //
         // remoteAddress
         //
         verifyException("org.jboss.netty.bootstrap.ClientBootstrap", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          String string0 = "v#x+=";
          URI uRI0 = MockURI.URI(string0);
          URI uRI1 = MockURI.relativize(uRI0, uRI0);
          WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
          WebSocketClient webSocketClient0 = new WebSocketClient(uRI0, webSocketHandler0);
          long long0 = 0L;
          ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocketClient0, long0);
          WebSocketClient webSocketClient1 = new WebSocketClient(uRI1, reconnectingWebSocketHandler0, webSocketClient0.executor);
          WebSocketClient webSocketClient2 = webSocketClient1.start();
          WebSocket webSocket0 = webSocketClient2.close();
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(11000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      Object object0 = WebSocketClient.nextId();
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
  public void test20()  throws Throwable  {
      URI uRI0 = null;
      WebSocketHandler webSocketHandler0 = mock(WebSocketHandler.class, new ViolatedAssumptionAnswer());
      WebSocket webSocket0 = null;
      long long0 = 0L;
      ReconnectingWebSocketHandler reconnectingWebSocketHandler0 = new ReconnectingWebSocketHandler(webSocketHandler0, webSocket0, long0);
      StubConnection stubConnection0 = new StubConnection();
      WebSocketClient webSocketClient0 = null;
      try {
        webSocketClient0 = new WebSocketClient(uRI0, reconnectingWebSocketHandler0, stubConnection0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }
}
