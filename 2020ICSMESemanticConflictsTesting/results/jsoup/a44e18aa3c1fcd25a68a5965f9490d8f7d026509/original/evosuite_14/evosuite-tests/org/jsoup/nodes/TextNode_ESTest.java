/*
 * This file was automatically generated by EvoSuite
 * Fri May 01 13:15:08 GMT 2020
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      String string0 = "^\\s+";
      String string1 = TextNode.stripLeadingWhitespace(string0);
      TextNode textNode0 = new TextNode(string1, string1);
      Node node0 = textNode0.removeAttr(string0);
      int int0 = 0;
      TextNode textNode1 = textNode0.splitText(int0);
      String string2 = "          ";
      textNode1.text = string2;
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      textNode1.outerHtmlHead(stringBuilder0, int0, document_OutputSettings0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      String string1 = "5C97v4ezLG|\\/,'4";
      TextNode textNode1 = (TextNode)textNode0.attr(string1, string1);
      String string2 = textNode0.absUrl(string1);
      String string3 = textNode0.text();
      Attributes attributes0 = textNode0.attributes();
      StringBuilder stringBuilder0 = new StringBuilder();
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      int int0 = 93;
      // Undeclared exception!
      try { 
        textNode1.splitText(int0);
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      int int0 = (-69);
      StringBuilder stringBuilder0 = new StringBuilder();
      boolean boolean0 = false;
      StringBuilder stringBuilder1 = stringBuilder0.append(boolean0);
      boolean boolean1 = TextNode.lastCharIsWhitespace(stringBuilder1);
      String string0 = "Split offset must be not be negative";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      // Undeclared exception!
      try { 
        textNode0.splitText(int0);
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = new TextNode(string0, string0);
      Document document0 = new Document(string0);
      textNode0.parentNode = (Node) document0;
      String string1 = textNode0.toString();
      int int0 = 0;
      // Undeclared exception!
      try { 
        textNode0.splitText(int0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "";
      TextNode textNode0 = new TextNode(string0, string0);
      int int0 = 1;
      StringBuilder stringBuilder0 = new StringBuilder(string0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      textNode0.outerHtmlTail(stringBuilder0, int0, document_OutputSettings0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "KI\"";
      TextNode textNode0 = new TextNode(string0, string0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      String string0 = "Split offset must not be greater than current text length";
      TextNode textNode0 = new TextNode(string0, string0);
      int int0 = 0;
      TextNode textNode1 = textNode0.splitText(int0);
      String string1 = textNode1.text();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      String string0 = "";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      String string1 = textNode0.attr(string0);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "ul";
      String string1 = null;
      TextNode textNode0 = TextNode.createFromEncoded(string0, string1);
      int int0 = 3036;
      // Undeclared exception!
      try { 
        textNode0.splitText(int0);
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      String string0 = "br";
      String string1 = "{rnm`3n!A;7Kab=Nix";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = textNode0.toString();
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      String string0 = "";
      String string1 = TextNode.normaliseWhitespace(string0);
      String string2 = "^\\s+";
      TextNode textNode0 = new TextNode(string2, string2);
      int int0 = 1731;
      String string3 = textNode0.toString();
      String string4 = "org.jsoup.nodes.TextNode";
      Node node0 = textNode0.removeAttr(string4);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "";
      String string1 = "T ]36sT]+I+SG:";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string1);
      String string2 = textNode0.toString();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      long long0 = 0L;
      StringBuilder stringBuilder1 = stringBuilder0.append(long0);
      int int0 = 0;
      boolean boolean0 = false;
      StringBuilder stringBuilder2 = stringBuilder1.insert(int0, boolean0);
      int int1 = 0;
      StringBuilder stringBuilder3 = stringBuilder1.append(int1);
      StringBuilder stringBuilder4 = stringBuilder3.insert(int1, (double) long0);
      char char0 = '+';
      StringBuilder stringBuilder5 = stringBuilder4.insert(int1, char0);
      int int2 = (-66);
      int int3 = 0;
      StringBuilder stringBuilder6 = stringBuilder5.insert(int3, char0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean1 = true;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(boolean1);
      textNode0.outerHtmlHead(stringBuilder5, int2, document_OutputSettings1);
      // Undeclared exception!
      try { 
        textNode0.removeAttr(string0);
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = null;
      String string1 = "org.jsoup.select.Evaluator$ContainsOwnText";
      // Undeclared exception!
      try { 
        TextNode.createFromEncoded(string0, string1);
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      String string0 = "text";
      TextNode textNode0 = new TextNode(string0, string0);
      String string1 = textNode0.toString();
      boolean boolean0 = textNode0.isBlank();
      String string2 = textNode0.getWholeText();
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = "";
      TextNode textNode0 = new TextNode(string0, string1);
      // Undeclared exception!
      try { 
        textNode0.attributes();
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      String string0 = "3iW8/CqBeZ%#Oh";
      TextNode textNode0 = new TextNode(string0, string0);
      textNode0.setBaseUri(string0);
      Attributes attributes0 = textNode0.attributes();
      String string1 = "input";
      Node node0 = textNode0.attr(string0, string1);
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        TextNode.stripLeadingWhitespace(string0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      String string0 = "br";
      TextNode textNode0 = new TextNode(string0, string0);
      int int0 = 0;
      TextNode textNode1 = textNode0.splitText(int0);
      boolean boolean0 = textNode1.hasAttr(string0);
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      String string0 = "text";
      String string1 = "@<FjN/e=>wsAU,6k";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string1);
      String string2 = "";
      // Undeclared exception!
      try { 
        textNode0.absUrl(string2);
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      String string0 = "=(nbQi)s$zz(%6,";
      TextNode textNode0 = new TextNode(string0, string0);
      Node node0 = textNode0.removeAttr(string0);
      boolean boolean0 = textNode0.isBlank();
      TextNode textNode1 = textNode0.text(string0);
      String string1 = "xhEw-[_*vT";
      String string2 = TextNode.normaliseWhitespace(string1);
      String string3 = textNode0.text();
      String string4 = "I";
      textNode1.setBaseUri(string4);
      textNode1.baseUri = string0;
      int int0 = 0;
      TextNode textNode2 = textNode1.splitText(int0);
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      String string0 = "";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      String string1 = "em";
      TextNode textNode1 = textNode0.text(string1);
      String string2 = "org.jsoup.nodes.TextNode";
      String string3 = textNode1.attr(string2);
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      String string0 = "z?=*V_GU3fjU]Sr";
      String string1 = null;
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = "";
      Node node0 = textNode0.attr(string0, string2);
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      String string0 = "eZQZWs3";
      String string1 = TextNode.stripLeadingWhitespace(string0);
      String string2 = "";
      String string3 = TextNode.normaliseWhitespace(string2);
      String string4 = "^\\s+";
      TextNode textNode0 = TextNode.createFromEncoded(string4, string4);
      Node node0 = textNode0.attr(string4, string3);
      String string5 = null;
      // Undeclared exception!
      try { 
        textNode0.text(string5);
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      String string0 = null;
      String string1 = "thead";
      TextNode textNode0 = new TextNode(string0, string1);
      TextNode textNode1 = textNode0.text(string1);
      int int0 = 0;
      TextNode textNode2 = textNode1.splitText(int0);
      String string2 = ">jS p34@?Y@A$v";
      boolean boolean0 = textNode2.hasAttr(string2);
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      String string0 = "video";
      String string1 = "ul_)";
      TextNode textNode0 = new TextNode(string0, string1);
      int int0 = (-2552);
      // Undeclared exception!
      try { 
        textNode0.splitText(int0);
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      String string0 = "Split offset must not be greater than current text length";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      TextNode textNode1 = textNode0.text(string0);
      int int0 = 32;
      Attributes attributes0 = textNode1.attributes;
      textNode0.attributes = attributes0;
      TextNode textNode2 = textNode1.splitText(int0);
      List<Node> list0 = textNode2.childNodes();
      String string1 = textNode1.absUrl(string0);
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      String string0 = null;
      String string1 = "Split offset must be not be negative";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = "var";
      Attributes attributes0 = new Attributes();
      String string3 = ":containsOwn(%s";
      String string4 = attributes0.get(string3);
      textNode0.attributes = attributes0;
      boolean boolean0 = textNode0.hasAttr(string2);
      String string5 = null;
      String string6 = attributes0.html();
      attributes0.addAll(textNode0.attributes);
      String string7 = "";
      // Undeclared exception!
      try { 
        textNode0.attr(string5, string7);
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      String string0 = "Yx:gQZ%[<{$'";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      Node node0 = textNode0.removeAttr(string0);
      String string1 = textNode0.absUrl(string0);
      String string2 = "'LXMX!\\,Y|<'6~m";
      String string3 = TextNode.stripLeadingWhitespace(string2);
      String string4 = textNode0.attr(string0);
      String string5 = textNode0.outerHtml();
      String string6 = "";
      // Undeclared exception!
      try { 
        textNode0.absUrl(string6);
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      String string0 = "V[fT#K";
      String string1 = "";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = "4@y7UwBDhX";
      TextNode textNode1 = textNode0.text(string2);
      String string3 = textNode1.nodeName();
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      String string0 = ":eq(%d)";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      int int0 = 1;
      StringBuilder stringBuilder0 = new StringBuilder(int0);
      int int1 = 0;
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = false;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(boolean0);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.indentAmount(int0);
      textNode0.outerHtmlTail(stringBuilder0, int1, document_OutputSettings2);
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      String string0 = null;
      String string1 = "";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = "Split offset must be not be negative";
      TextNode textNode1 = textNode0.text(string2);
      // Undeclared exception!
      try { 
        textNode1.hasAttr(string0);
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      int int0 = 23;
      StringBuilder stringBuilder0 = new StringBuilder(int0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      StringBuilder stringBuilder0 = null;
      // Undeclared exception!
      try { 
        TextNode.lastCharIsWhitespace(stringBuilder0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 11000)
  public void test33()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      String string1 = "*{l;a5/^ZiW#";
      Document document0 = Document.createShell(string1);
      List<Node> list0 = textNode0.childNodesCopy();
      String string2 = "IT";
      Element element0 = document0.createElement(string2);
      Element element1 = element0.val(string2);
      DataNode dataNode0 = new DataNode(string0, string1);
      DataNode dataNode1 = dataNode0.setWholeData(string2);
      Node node0 = element1.doClone(dataNode1);
      textNode0.parentNode = (Node) element1;
      String string3 = textNode0.toString();
      boolean boolean0 = textNode0.isBlank();
      TextNode textNode1 = (TextNode)textNode0.removeAttr(string2);
      String string4 = textNode0.nodeName();
      String string5 = "text";
      String string6 = TextNode.stripLeadingWhitespace(string5);
      String string7 = textNode0.text();
      StringBuilder stringBuilder0 = null;
      int int0 = 1436;
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
      // Undeclared exception!
      try { 
        textNode1.outerHtmlHead(stringBuilder0, int0, document_OutputSettings1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 11000)
  public void test34()  throws Throwable  {
      String string0 = "-#|r_";
      TextNode textNode0 = new TextNode(string0, string0);
      int int0 = 0;
      TextNode textNode1 = textNode0.splitText(int0);
      TextNode textNode2 = textNode1.text(string0);
      String string1 = null;
      // Undeclared exception!
      try { 
        textNode2.attr(string1);
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test35()  throws Throwable  {
      String string0 = "";
      TextNode textNode0 = new TextNode(string0, string0);
      TextNode textNode1 = textNode0.text(string0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        textNode1.splitText(int0);
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test36()  throws Throwable  {
      String string0 = "";
      String string1 = "org.jsoup.nodes.TextNode";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = "}/;7 e*`yC?gVV;a\"";
      TextNode textNode1 = textNode0.text(string2);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string1);
      float float0 = 1.0F;
      StringBuilder stringBuilder1 = stringBuilder0.append(float0);
      int int0 = 0;
      StringBuilder stringBuilder2 = stringBuilder1.insert(int0, (CharSequence) string0, int0, int0);
      StringBuilder stringBuilder3 = stringBuilder2.append((long) int0);
      Document.OutputSettings document_OutputSettings0 = null;
      // Undeclared exception!
      try { 
        textNode1.outerHtmlHead(stringBuilder3, int0, document_OutputSettings0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 11000)
  public void test37()  throws Throwable  {
      String string0 = null;
      String string1 = "hzF7(^Zwo4w~lQ?C";
      TextNode textNode0 = new TextNode(string0, string1);
      TextNode textNode1 = textNode0.text(string0);
      int int0 = 158;
      // Undeclared exception!
      try { 
        textNode1.splitText(int0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 11000)
  public void test38()  throws Throwable  {
      String string0 = "8%Vaw;T8]G";
      String string1 = TextNode.stripLeadingWhitespace(string0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      float float0 = 0.0F;
      StringBuilder stringBuilder1 = stringBuilder0.append(float0);
      long long0 = 1L;
      StringBuilder stringBuilder2 = stringBuilder1.append(long0);
      int int0 = 0;
      StringBuilder stringBuilder3 = stringBuilder2.insert(int0, (double) float0);
      long long1 = 4762L;
      StringBuilder stringBuilder4 = stringBuilder1.append(long1);
      StringBuilder stringBuilder5 = stringBuilder3.append((double) int0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder5);
      String string2 = "Split offset must not be greater than current text length";
      TextNode textNode0 = TextNode.createFromEncoded(string2, string1);
      Attributes attributes0 = textNode0.attributes();
  }

  @Test(timeout = 11000)
  public void test39()  throws Throwable  {
      String string0 = null;
      String string1 = "#text";
      TextNode textNode0 = new TextNode(string0, string1);
      String string2 = ":gt(%d)";
      textNode0.baseUri = string2;
      List<Node> list0 = null;
      // Undeclared exception!
      try { 
        textNode0.toString();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 11000)
  public void test40()  throws Throwable  {
      String string0 = "}";
      TextNode textNode0 = new TextNode(string0, string0);
      TextNode textNode1 = textNode0.text(string0);
      String string1 = null;
      // Undeclared exception!
      try { 
        TextNode.normaliseWhitespace(string1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 11000)
  public void test41()  throws Throwable  {
      String string0 = "\\pP";
      String string1 = TextNode.stripLeadingWhitespace(string0);
      TextNode textNode0 = new TextNode(string1, string1);
      Attributes attributes0 = textNode0.attributes();
      String string2 = TextNode.normaliseWhitespace(string1);
      String string3 = "org.jsoup.select.Evaluator";
      TextNode textNode1 = textNode0.text(string3);
      int int0 = 0;
      TextNode textNode2 = textNode0.splitText(int0);
      String string4 = textNode2.toString();
      int int1 = (-2345);
      textNode1.setSiblingIndex(int1);
      String string5 = textNode2.outerHtml();
      boolean boolean0 = textNode2.isBlank();
      String string6 = TextNode.normaliseWhitespace(string1);
      String string7 = textNode0.toString();
      String string8 = textNode0.attr(string0);
      String string9 = TextNode.stripLeadingWhitespace(string4);
      String string10 = "Split offset must be not be negative";
      TextNode textNode3 = textNode1.text(string10);
      StringBuilder stringBuilder0 = null;
      int int2 = 909;
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(boolean0);
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.escapeMode(entities_EscapeMode0);
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead(stringBuilder0, int2, document_OutputSettings2);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 11000)
  public void test42()  throws Throwable  {
      String string0 = "\\pP";
      String string1 = TextNode.normaliseWhitespace(string0);
      TextNode textNode0 = new TextNode(string1, string1);
      Attributes attributes0 = textNode0.attributes();
      String string2 = TextNode.normaliseWhitespace(string1);
      String string3 = "org.jsoup.select.Evaluator";
      Node node0 = textNode0.removeAttr(string3);
      int int0 = 0;
      TextNode textNode1 = textNode0.splitText(int0);
      String string4 = textNode1.toString();
      String string5 = textNode1.outerHtml();
      boolean boolean0 = textNode1.isBlank();
      String string6 = TextNode.normaliseWhitespace(string1);
      textNode1.setBaseUri(string2);
      String string7 = textNode0.toString();
      String string8 = textNode0.attr(string0);
      String string9 = TextNode.stripLeadingWhitespace(string4);
      String string10 = "Split offset must be not be negative";
      String string11 = "          ";
      textNode1.text = string11;
      TextNode textNode2 = textNode0.text(string10);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string8);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings0.clone();
      Charset charset0 = Charset.defaultCharset();
      Document.OutputSettings document_OutputSettings3 = document_OutputSettings0.prettyPrint(boolean0);
      int int1 = 17;
      Document.OutputSettings document_OutputSettings4 = document_OutputSettings3.indentAmount(int1);
      textNode1.outerHtmlHead(stringBuilder0, int0, document_OutputSettings4);
      boolean boolean1 = TextNode.lastCharIsWhitespace(stringBuilder0);
  }

  @Test(timeout = 11000)
  public void test43()  throws Throwable  {
      String string0 = "-O'-cqxL%[v+vre)tWZ";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      List<Node> list0 = textNode0.siblingNodes();
      String string1 = textNode0.text();
      String string2 = "#1:ek?7{7=";
      TextNode textNode1 = textNode0.text(string2);
      int int0 = 192;
      textNode1.setSiblingIndex(int0);
      StringBuilder stringBuilder0 = null;
      int int1 = (-1167);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Charset charset0 = Charset.defaultCharset();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead(stringBuilder0, int1, document_OutputSettings1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.TextNode", e);
      }
  }

  @Test(timeout = 11000)
  public void test44()  throws Throwable  {
      String string0 = null;
      TextNode textNode0 = new TextNode(string0, string0);
      int int0 = 234;
      textNode0.setSiblingIndex(int0);
      // Undeclared exception!
      try { 
        textNode0.text();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 11000)
  public void test45()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = TextNode.createFromEncoded(string0, string0);
      String string1 = "*{l;a5/^ZiW#";
      Document document0 = Document.createShell(string1);
      List<Node> list0 = textNode0.childNodesCopy();
      String string2 = "IT";
      Element element0 = document0.createElement(string2);
      Element element1 = element0.val(string2);
      DataNode dataNode0 = new DataNode(string0, string1);
      DataNode dataNode1 = dataNode0.setWholeData(string2);
      Node node0 = textNode0.removeAttr(string1);
      Node node1 = element1.doClone(dataNode1);
      textNode0.parentNode = (Node) element1;
      String string3 = textNode0.toString();
      boolean boolean0 = textNode0.isBlank();
      TextNode textNode1 = (TextNode)textNode0.removeAttr(string2);
      String string4 = textNode0.nodeName();
      String string5 = "text";
      String string6 = TextNode.stripLeadingWhitespace(string5);
      String string7 = textNode0.text();
      int int0 = 0;
      // Undeclared exception!
      try { 
        textNode1.splitText(int0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test46()  throws Throwable  {
      String string0 = "!p=$n&E)";
      StringBuilder stringBuilder0 = new StringBuilder();
      long long0 = (-673L);
      StringBuilder stringBuilder1 = stringBuilder0.append(long0);
      char[] charArray0 = new char[9];
      char char0 = 'M';
      charArray0[0] = char0;
      char char1 = 'w';
      charArray0[1] = char1;
      char char2 = '_';
      charArray0[2] = char2;
      char char3 = 'c';
      charArray0[3] = char3;
      char char4 = '\"';
      charArray0[4] = char4;
      char char5 = '#';
      charArray0[5] = char5;
      char char6 = 'x';
      charArray0[6] = char6;
      char char7 = '*';
      charArray0[7] = char7;
      char char8 = 'j';
      charArray0[8] = char8;
      StringBuilder stringBuilder2 = stringBuilder1.append(charArray0);
      StringBuilder stringBuilder3 = stringBuilder2.append((double) long0);
      int int0 = 18;
      StringBuilder stringBuilder4 = stringBuilder3.appendCodePoint(int0);
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder4);
  }

  @Test(timeout = 11000)
  public void test47()  throws Throwable  {
      String string0 = "^\\s+";
      String string1 = TextNode.stripLeadingWhitespace(string0);
      TextNode textNode0 = new TextNode(string1, string1);
      Attributes attributes0 = textNode0.attributes;
      Node node0 = textNode0.removeAttr(string0);
      int int0 = 0;
      textNode0.parentNode = node0;
      // Undeclared exception!
      try { 
        textNode0.splitText(int0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 11000)
  public void test48()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = new TextNode(string0, string0);
      Document document0 = Document.createShell(string0);
      int int0 = (-9);
      textNode0.setSiblingIndex(int0);
      textNode0.parentNode = (Node) document0;
      // Undeclared exception!
      try { 
        textNode0.toString();
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 11000)
  public void test49()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = new TextNode(string0, string0);
      Document document0 = Document.createShell(string0);
      textNode0.parentNode = (Node) document0;
      document0.setParentNode(textNode0);
      // Undeclared exception!
      try { 
        textNode0.toString();
      } catch(ClassCastException e) {
         //
         // org.jsoup.nodes.TextNode cannot be cast to org.jsoup.nodes.Element
         //
         verifyException("org.jsoup.nodes.Element", e);
      }
  }

  @Test(timeout = 11000)
  public void test50()  throws Throwable  {
      String string0 = "UTF-8";
      TextNode textNode0 = new TextNode(string0, string0);
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Node node0 = textNode0.traverse(nodeVisitor0);
      textNode0.parentNode = node0;
      Document document0 = Document.createShell(string0);
      // Undeclared exception!
      try { 
        textNode0.toString();
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
