import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = objectMapper14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher3.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = s3SegmentPusherConfig9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        java.io.File file17 = null;
        com.metamx.druid.client.DataSegment dataSegment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment19 = s3SegmentPusher0.push(file17, dataSegment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher0.push(file10, dataSegment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher0.push(file10, dataSegment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher3.jsonMapper;
        java.io.File file20 = null;
        com.metamx.druid.client.DataSegment dataSegment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment22 = s3SegmentPusher3.push(file20, dataSegment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher0.push(file10, dataSegment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher0.push(file14, dataSegment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper22);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig21;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig23 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig23);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher0.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher3.s3Client = restS3Service15;
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher0.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = null;
        s3SegmentPusher0.s3Client = restS3Service21;
        java.io.File file23 = null;
        com.metamx.druid.client.DataSegment dataSegment24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment25 = s3SegmentPusher0.push(file23, dataSegment24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = s3SegmentPusherConfig10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher0.s3Client = restS3Service20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        java.io.File file19 = null;
        com.metamx.druid.client.DataSegment dataSegment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment21 = s3SegmentPusher0.push(file19, dataSegment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = null;
        s3SegmentPusher3.jsonMapper = objectMapper21;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig23 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher0.push(file14, dataSegment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher3.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher3.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher0.push(file10, dataSegment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = restS3Service8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = null;
        s3SegmentPusher0.s3Client = restS3Service22;
        java.io.File file24 = null;
        com.metamx.druid.client.DataSegment dataSegment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment26 = s3SegmentPusher0.push(file24, dataSegment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher3.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig22;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service24 = null;
        s3SegmentPusher0.s3Client = restS3Service24;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = null;
        s3SegmentPusher0.jsonMapper = objectMapper26;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper22);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        java.io.File file19 = null;
        com.metamx.druid.client.DataSegment dataSegment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment21 = s3SegmentPusher0.push(file19, dataSegment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher3.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher0.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher0.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher0.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher3.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher3.jsonMapper = objectMapper6;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher3.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = null;
        s3SegmentPusher0.s3Client = restS3Service22;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher3.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher3.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = null;
        s3SegmentPusher0.jsonMapper = objectMapper22;
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = objectMapper24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper24);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        java.io.File file17 = null;
        com.metamx.druid.client.DataSegment dataSegment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment19 = s3SegmentPusher0.push(file17, dataSegment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher0.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher3.s3Client = restS3Service18;
        java.io.File file20 = null;
        com.metamx.druid.client.DataSegment dataSegment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment22 = s3SegmentPusher3.push(file20, dataSegment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher0.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = s3SegmentPusherConfig6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        java.io.File file17 = null;
        com.metamx.druid.client.DataSegment dataSegment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment19 = s3SegmentPusher0.push(file17, dataSegment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher0.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig22;
        org.codehaus.jackson.map.ObjectMapper objectMapper24 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig25 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service26 = null;
        s3SegmentPusher0.s3Client = restS3Service26;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig25);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        java.io.File file20 = null;
        com.metamx.druid.client.DataSegment dataSegment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment22 = s3SegmentPusher0.push(file20, dataSegment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig21;
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = null;
        s3SegmentPusher3.jsonMapper = objectMapper23;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service25 = null;
        s3SegmentPusher3.s3Client = restS3Service25;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = null;
        s3SegmentPusher0.s3Client = restS3Service21;
        java.lang.Class<?> wildcardClass23 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher3.s3Client = restS3Service20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher0.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher0.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass22 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = null;
        s3SegmentPusher0.jsonMapper = objectMapper21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher0.s3Client = restS3Service20;
        java.lang.Class<?> wildcardClass22 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        java.io.File file22 = null;
        com.metamx.druid.client.DataSegment dataSegment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment24 = s3SegmentPusher0.push(file22, dataSegment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        java.io.File file18 = null;
        com.metamx.druid.client.DataSegment dataSegment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment20 = s3SegmentPusher0.push(file18, dataSegment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = s3SegmentPusherConfig9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher3.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig22;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig24 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig24;
        java.io.File file26 = null;
        com.metamx.druid.client.DataSegment dataSegment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment28 = s3SegmentPusher0.push(file26, dataSegment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher0.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig22);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig19);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        java.io.File file18 = null;
        com.metamx.druid.client.DataSegment dataSegment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment20 = s3SegmentPusher3.push(file18, dataSegment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher0.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher0.push(file6, dataSegment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = null;
        s3SegmentPusher0.jsonMapper = objectMapper21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        java.io.File file17 = null;
        com.metamx.druid.client.DataSegment dataSegment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment19 = s3SegmentPusher0.push(file17, dataSegment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher3.jsonMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher0.push(file14, dataSegment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = null;
        s3SegmentPusher3.jsonMapper = objectMapper21;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service23 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig24 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig24;
        org.codehaus.jackson.map.ObjectMapper objectMapper26 = null;
        s3SegmentPusher3.jsonMapper = objectMapper26;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service23);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher0.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = objectMapper16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher3.s3Client = restS3Service20;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service22 = null;
        s3SegmentPusher3.s3Client = restS3Service22;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher0.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }
}

