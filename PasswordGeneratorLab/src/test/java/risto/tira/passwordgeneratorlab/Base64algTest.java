package risto.tira.passwordgeneratorlab;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base64algTest {
    Base64alg testBase64algEncode;
    Base64alg testBase64algDecode;
    
    @Before
    public void setUp() {
        testBase64algEncode = new Base64alg("9FE7C8A6484E52197B61633A791CD224");
        testBase64algDecode = new Base64alg("OUZFN0M4QTY0ODRFNTIxOTdCNjE2MzNBNzkxQ0QyMjQ=");
    }
    
    @Test
    public void testEncode() {
        final String correct = "OUZFN0M4QTY0ODRFNTIxOTdCNjE2MzNBNzkxQ0QyMjQ=";
        Assert.assertEquals(correct, testBase64algEncode.encode());
    }
    
    @Test
    public void testDecode() {
        final String decoded = "9FE7C8A6484E52197B61633A791CD224";
        Assert.assertEquals(decoded, testBase64algDecode.decode());
    }
}
