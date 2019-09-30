package risto.tira.passwordgeneratorlab;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
/**
 * Class that handles the SHA1 algorithm.
 * @author rsutinen
 */

public class SHA1 {
    private final String inputString;
    
    public SHA1(String inputString) {
        this.inputString = inputString;
    }
    
    public String hash() throws NoSuchAlgorithmException {
        //Using SHA1 algorithm.
        MessageDigest sha1 = MessageDigest.getInstance("SHA1");
        
        //Encode inputString into a sequence of bytes, store result into a new byte array.
        //Update message digest using inputString byte array.
        sha1.update(this.inputString.getBytes());
        
        //Completes the hash computation.
        //Store result to digest variable.
        byte[] digest = sha1.digest();
        
        //Convert digest byte array into String.
        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
        
        return myHash;
    }
}
