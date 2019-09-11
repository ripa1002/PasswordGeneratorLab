package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class SHA1Test {
    SHA1 testSHA1;
    
    @Before
    public void setUp() {
        testSHA1 = new SHA1("salasana");
    }
    
    @Test
    public void returnCorrectHash() throws NoSuchAlgorithmException {
        final String correctHash = "C7E6477ECEF29604380F3185E205C3CC4EF565F3";
        Assert.assertEquals(correctHash, testSHA1.hash());
    }
}