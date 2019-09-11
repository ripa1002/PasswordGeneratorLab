package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MD5Test {
    MD5 testMD5;
    
    @Before
    public void setUp() {
        testMD5 = new MD5("salasana");
    }
    
    @Test
    public void returnCorrectHash() throws NoSuchAlgorithmException {
        final String correctHash = "E7E941B1F09F266540C6780DB51D5F58";
        Assert.assertEquals(correctHash, testMD5.hash());
    }
}