package risto.tira.passwordgeneratorlab;

import java.util.Base64;
/**
 * Class that handles the Base64 algorithm.
 * @author rsutinen
 */
public class Base64alg {
    private String inputString;

    public Base64alg(String inputString) {
        this.inputString = inputString;
    }
    
    public String encode() {
        String encoded = Base64.getEncoder().encodeToString(this.inputString.getBytes());
        return encoded;
    }
    
    public String decode() {
        byte[] decodedBytes = Base64.getDecoder().decode(this.inputString.getBytes());
        String decoded = new String(decodedBytes);
        return decoded;
    }
}
