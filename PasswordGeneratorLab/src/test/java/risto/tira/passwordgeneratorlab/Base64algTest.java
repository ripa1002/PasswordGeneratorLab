package risto.tira.passwordgeneratorlab;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base64algTest {
    Base64alg testEncode;
    
    @Before
    public void setUp() {
        testEncode = new Base64alg("9FE7C8A6484E52197B61633A791CD224");
    }
    
    @Test
    public void returnCorrectEncodedString() {
        final String correct = "OUZFN0M4QTY0ODRFNTIxOTdCNjE2MzNBNzkxQ0QyMjQ=";
        Assert.assertEquals(correct, testEncode.encode());
    }
}
