package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class SHA1Test {
    SHA1 testSHA1a;
    
    SHA1 testSHA1b;
    
    SHA1 testSHA1c;
    
    SHA1 testSHA1d;
    
    SHA1 testSHA1e;
    
    SHA1 testSHA1f;
    
    @Before
    public void setUp() {
        testSHA1a = new SHA1("salasana");
        testSHA1b = new SHA1("");
        testSHA1c = new SHA1("llhjaaaaagvygavgyasvyuasdgyascyghilas");
        testSHA1d = new SHA1("12-12-12-12-12-12");
        testSHA1e = new SHA1("uyasdtftgsdtgsdfgyuasdfgysdfagyuasdfyusdgyafgysdfgyuasdfgyfasdgyusdfyugysdafgyuasdftasdtfsdtfdsfghsdfghsdfyyusdafgyuasdfgyusdfgyuygsdf");
        //2412 chars
        testSHA1f = new SHA1("fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386"
                + "fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhu"
                + "sdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDF"
                + "GFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455"
                + "234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf"
                + "-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgd"
                + "dfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdg"
                + "dsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG"
                + "-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dg"
                + "dfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfu"
                + "ghdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsd"
                + "fughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduis"
                + "uisgsduifiudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduif"
                + "iudfgjdfghdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfg"
                + "hdfjdjkfdksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfd"
                + "ksSD5386fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386f"
                + "hukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386");
    }
    
    @Test
    public void returnCorrectHash() throws NoSuchAlgorithmException {
        final String correctHash = "C7E6477ECEF29604380F3185E205C3CC4EF565F3";
        Assert.assertEquals(correctHash, testSHA1a.hash());
    }
    
    @Test
    public void returnCorrectEmptyHash() throws NoSuchAlgorithmException {
        final String correctHash = "DA39A3EE5E6B4B0D3255BFEF95601890AFD80709";
        Assert.assertEquals(correctHash, testSHA1b.hash());
    }
    
    @Test
    public void returnCorrectHash2() throws NoSuchAlgorithmException {
        final String correctHash = "C4E086917DAEC9C8310C1833FDF853799C06114F";
        Assert.assertEquals(correctHash, testSHA1c.hash());
    }
    
    @Test
    public void returnCorrectHash3() throws NoSuchAlgorithmException {
        final String correctHash = "E8BD5C7C24B9F05017B03DE0A82C364890989F1F";
        Assert.assertEquals(correctHash, testSHA1d.hash());
    }
    
    @Test
    public void returnCorrectHash4() throws NoSuchAlgorithmException {
        final String correctHash = "97F16E6B3B973A2B18F49123D71B4CEBF99CD02D";
        Assert.assertEquals(correctHash, testSHA1e.hash());
    }
    
    @Test
    public void testPerformance() throws NoSuchAlgorithmException {
        for (int i = 0; i < 1000000; i++) {
            testSHA1d.hash();
        }
    }
    
    @Test
    public void testPerformance2() throws NoSuchAlgorithmException {
        for (int i = 0; i < 1000000; i++) {
            testSHA1f.hash();
        }
    }
}