package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;

public class Generator {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //Printing MD5 hash
        MD5 hashableMD5 = new MD5("salasana");
        System.out.println(hashableMD5.hash());
        
        //Printing SHA1 hash
        SHA1 hashableSHA1 = new SHA1("salasana");
        System.out.println(hashableSHA1.hash());
        
        //Printing encoded MD5 hash
        Base64alg encodedHash = new Base64alg(hashableMD5.hash());
        System.out.println(encodedHash.encode());
        
        //Printing encoded SHA1 hash
        Base64alg encodedHash2 = new Base64alg(hashableSHA1.hash());
        System.out.println(encodedHash2.encode());
        
        //Printing decoded Base64 encoded MD5 hash
        Base64alg decodedHash = new Base64alg(encodedHash.encode());
        System.out.println(decodedHash.decode());
        
        //Printing decoded Base64 encoded SHA1 hash
        Base64alg decodedHash2 = new Base64alg(encodedHash2.encode());
        System.out.println(decodedHash2.decode());
        
    }
}
