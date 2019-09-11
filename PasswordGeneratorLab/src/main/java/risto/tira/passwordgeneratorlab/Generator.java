package risto.tira.passwordgeneratorlab;

import java.security.NoSuchAlgorithmException;

public class Generator {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5 hashableMD5 = new MD5("salasana");
        System.out.println(hashableMD5.hash());
        
        SHA1 hashableSHA1 = new SHA1("salasana");
        System.out.println(hashableSHA1.hash());
    }
}
