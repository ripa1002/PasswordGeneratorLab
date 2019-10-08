package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;
/**
 * This is the main class of this program. The algorithm classes are used from here.
 * @author rsutinen
 */

public class Generator {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String saltString = "salasana";
        String mac = "01-23-45-67-89-AB";
        String hashable = saltString + mac;
        
        MD5 hashableMD5 = new MD5(hashable);
        SHA1 hashableSHA1 = new SHA1(hashable);
        
        Base64alg encodedHash = new Base64alg(hashableMD5.hash());
        Base64alg encodedHash2 = new Base64alg(hashableSHA1.hash());
        
        //Printing encoded MD5 hash
        System.out.println(encodedHash.encode());
        //Printing encoded SHA1 hash
        System.out.println(encodedHash2.encode());
    }
}
