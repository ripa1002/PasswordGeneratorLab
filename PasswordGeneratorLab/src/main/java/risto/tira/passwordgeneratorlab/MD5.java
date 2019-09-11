package risto.tira.passwordgeneratorlab;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class MD5 {
    private String inputString;
    
    public MD5(String inputString) {
        this.inputString = inputString;
    }
    
    public String hash() throws NoSuchAlgorithmException {
        //Using MD5 algorithm.
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        
        //Encode inputString into a sequence of bytes, store result into a new byte array.
        //Update message digest using inputString byte array.
        md5.update(this.inputString.getBytes());
        
        //Completes the hash computation.
        //Store result to digest variable.
        byte[] digest = md5.digest();
        
        //Convert digest byte array into String.
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        
        return myHash;
    }
}
