package risto.tira.passwordgeneratorlab.ui;

import risto.tira.passwordgeneratorlab.Base64alg;
import risto.tira.passwordgeneratorlab.MD5;
import risto.tira.passwordgeneratorlab.SHA1;

/**
 * User interface class.
 * @author rsutinen
 */
public class UI {
    private final IOController io;
    
    public UI(IOController io) {
        this.io = io;
    }
    
    public void run() {
        System.out.println("Hi! ");
        String input = "";
        
        while (true) {
            input = io.readInput("Please enter mac address: ");
            
            if (io.validateMac(input)) {
                break;
            } else {
                System.out.println("Error: Invalid MAC-address.");
            }
        }
        
        String saltString = "salasana";
        String hashable = saltString + input;
        
        MD5 hashableMD5 = new MD5(hashable);
        SHA1 hashableSHA1 = new SHA1(hashable);
        
        Base64alg encodedHash = new Base64alg(hashableMD5.hash());
        Base64alg encodedHash2 = new Base64alg(hashableSHA1.hash());
        
        //Printing encoded MD5 hash
        System.out.println("MD5: " + encodedHash.encode());
        //Printing encoded SHA1 hash
        System.out.println("SHA-1: " + encodedHash2.encode());
    }
}
