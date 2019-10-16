package risto.tira.passwordgeneratorlab;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base64algTest {
    Base64alg testEncode;
    
    Base64alg testEncode2;
    
    Base64alg testEncode3;
    
    Base64alg testEncode4;
    
    @Before
    public void setUp() {
        testEncode = new Base64alg("9FE7C8A6484E52197B61633A791CD224");
        testEncode2 = new Base64alg("juu");
        testEncode3 = new Base64alg("iyfgasdfygyefgyir64758hsdfyusgyvfsbsdfvbsdfvyystdsdtfastydtasdSDASDFFSDERSFGSDsdsfasddf");
        testEncode4 = new Base64alg("odisfjseiofjasdfkasfks3478347erhsdfsd");
    }
    
    @Test
    public void returnCorrectEncodedString() {
        final String correct = "OUZFN0M4QTY0ODRFNTIxOTdCNjE2MzNBNzkxQ0QyMjQ=";
        Assert.assertEquals(correct, testEncode.encode());
    }
    
    @Test
    public void returnCorrectEncodedString2() {
        final String correct = "anV1";
        Assert.assertEquals(correct, testEncode2.encode());
    }
    
    @Test
    public void returnCorrectEncodedString3() {
        final String correct = "aXlmZ2FzZGZ5Z3llZmd5aXI2NDc1OGhzZGZ5dXNneXZmc2JzZGZ2YnNkZnZ5eXN0ZHNkdGZhc3R5ZHRhc2RTREFTREZGU0RFUlNGR1NEc2RzZmFzZGRm";
        Assert.assertEquals(correct, testEncode3.encode());
    }
    
    @Test
    public void returnCorrectEncodedString4() {
        final String correct = "b2Rpc2Zqc2Vpb2ZqYXNkZmthc2ZrczM0NzgzNDdlcmhzZGZzZA==";
        Assert.assertEquals(correct, testEncode4.encode());
    }
}
