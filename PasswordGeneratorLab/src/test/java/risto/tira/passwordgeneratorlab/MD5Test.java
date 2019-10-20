package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MD5Test {
    MD5 testMD5a;
    
    MD5 testMD5b;
    
    MD5 testMD5c;
    
    MD5 testMD5d;
    
    MD5 testMD5e;
    
    MD5 testMD5f;
    
    @Before
    public void setUp() {
        testMD5a = new MD5("salasana");
        testMD5b = new MD5("");
        testMD5c = new MD5("llhjaaaaagvygavgyasvyuasdgyascyghilas");
        testMD5d = new MD5("12-12-12-12-12-12");
        testMD5e = new MD5("uyasdtftgsdtgsdfgyuasdfgysdfagyuasdfyusdgyafgysdfgyuasdfgyfasdgyusdfyugysdafgyuasdftasdtfsdtfdsfghsdfghsdfyyusdafgyuasdfgyusdfgyuygsdf");
        //2412 chars
        testMD5f = new MD5("fhukasfhusdSDFDFDFGFS453455234-fsdaf-3453-fgddfgdfgsdgdsSDFGDFG-456456dgdfggdsdfughdfughsdfughsduisuisgsduifiudfgjdfghdfjdjkfdksSD5386"
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
        final String correctHash = "E7E941B1F09F266540C6780DB51D5F58";
        Assert.assertEquals(correctHash, testMD5a.hash());
    }
    
    @Test
    public void returnCorrectEmptyHash() throws NoSuchAlgorithmException {
        final String correctHash = "D41D8CD98F00B204E9800998ECF8427E";
        Assert.assertEquals(correctHash, testMD5b.hash());
    }
    
    @Test
    public void returnCorrectHash2() throws NoSuchAlgorithmException {
        final String correctHash = "9B3EC16897F89EFF97BCCA6F0B827866";
        Assert.assertEquals(correctHash, testMD5c.hash());
    }
    
    @Test
    public void returnCorrectHash3() throws NoSuchAlgorithmException {
        final String correctHash = "72CE3CC3E42389C3F78313BB9A219151";
        Assert.assertEquals(correctHash, testMD5d.hash());
    }
    
    @Test
    public void returnCorrectHash4() throws NoSuchAlgorithmException {
        final String correctHash = "13D998162560FA33E5CB2ACD6492303D";
        Assert.assertEquals(correctHash, testMD5e.hash());
    }
    
    @Test
    public void testPerformance() throws NoSuchAlgorithmException {
        for (int i = 0; i < 1000000; i++) {
            testMD5d.hash();
        }
    }
    
    @Test
    public void testPerformance2() throws NoSuchAlgorithmException {
        for (int i = 0; i < 1000000; i++) {
            testMD5f.hash();
        }
    }
}