package risto.tira.passwordgeneratorlab;

/**
 * Class that handles the Base64 encode algorithm.
 * @author rsutinen
 */
public class Base64alg {
    private final byte[] inputString;
    
    //Base64 character table
    private final char[] base64Chars = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    
    //Constructor to read inputString as byte array
    public Base64alg(String inputString) {
        this.inputString = inputString.getBytes();
    }
    
    //Base 64 encode function. Returns Base64 encoded String.
    public String encode() {
        StringBuilder sb = new StringBuilder();
        int padding = 0;
        
        //Loop through the String 3 chars at a time
        for (int i = 0; i < inputString.length; i += 3) {
            int a = ((inputString[i] & 0xFF) << 16) & 0xFFFFFF;
            
            if (i + 1 < inputString.length) {
                a |= (inputString[i + 1] & 0xFF) << 8;
            } else {
                padding++;
            }
            
            if (i + 2 < inputString.length) {
                a |= (inputString[i + 2] & 0xFF);
            } else {
                padding++;
            }

            for (int j = 0; j < 4 - padding; j++) {
                int b = (a & 0xFC0000) >> 18;
                sb.append(base64Chars[b]);
                a <<= 6;
            }
        }
        
        //Ensure the String is multiple of 3 chars
        for (int j = 0; j < padding; j++) {
            sb.append("=");
        }

        return sb.toString();
    }
}
