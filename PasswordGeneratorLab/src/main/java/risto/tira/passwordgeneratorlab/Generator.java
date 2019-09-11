package risto.tira.passwordgeneratorlab;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class Generator {
    
    public static String md5(String inputString) throws NoSuchAlgorithmException {
        //Using MD5 algorithm.
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        
        //Encode inputString into a sequence of bytes, store result into a new byte array.
        //Update message digest using inputString byte array.
        md5.update(inputString.getBytes());
        
        //Completes the hash computation.
        //Store result to digest variable.
        byte[] digest = md5.digest();
        
        //Convert digest byte array into String.
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        
        return myHash;
    }
    
    public static String sha1(String inputString) throws NoSuchAlgorithmException {
        //Using SHA-1 algorithm.
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        
        //Encode inputString into a sequence of bytes, store result into a new byte array.
        //Update message digest using inputString byte array.
        sha1.update(inputString.getBytes());
        
        //Completes the hash computation.
        //Store result to digest variable.
        byte[] digest = sha1.digest();
        
        //Convert digest byte array into String.
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        
        return myHash;
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(md5("salasana"));
        System.out.println(sha1("salasana"));
    }
}
