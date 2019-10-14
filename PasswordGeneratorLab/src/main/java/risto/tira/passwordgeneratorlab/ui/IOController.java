package risto.tira.passwordgeneratorlab.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * I/O Controller class.
 * @author rsutinen
 */
public class IOController {
    private Scanner sc;

    public IOController(Scanner scanner) {
        this.sc = scanner;
    }

    public String readInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
    
    public boolean validateMac(String macAddress) {
        Pattern pattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Matcher matcher = pattern.matcher(macAddress);
        return matcher.find();
    }
}
