/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 14:53:40 GMT 2020
 */

package org.elasticsearch.index.query.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.CharBuffer;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.join.BitDocIdSetFilter;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.index.mapper.object.ObjectMapper;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.index.query.support.NestedInnerQueryParseSupport;
import org.elasticsearch.search.internal.SearchContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestedInnerQueryParseSupport_ESTest extends NestedInnerQueryParseSupport_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      SearchContext searchContext0 = SearchContext.current();
      XContentParser xContentParser0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      XContentParser xContentParser0 = null;
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      JsonXContent jsonXContent0 = JsonXContent.jsonXContent;
      InputStream inputStream0 = null;
      XContentParser xContentParser0 = jsonXContent0.createParser(inputStream0);
      SearchContext searchContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }
}
