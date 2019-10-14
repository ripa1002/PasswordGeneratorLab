package risto.tira.passwordgeneratorlab.ui;

import java.util.Scanner;

/**
 * This is the main class. Used for starting the program.
 * @author rsutinen
 */

public class Generator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IOController io = new IOController(scanner);
        UI ui = new UI(io);
        ui.run();
    }
}
