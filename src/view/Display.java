package view;

import java.util.Scanner;

public class Display {
    /**
     * A flag used to stop the program.
     *
     * False when you want to stop, true when you want to continue.
     */
    private static boolean myFlag;

    public void mainMenu() {
        Scanner theConsole = new Scanner(System.in);
        String theFirstFileName, theSecondFileName;
        myFlag = false;
        while(!myFlag) {
            System.out.println("Please enter the first filepath: ");
            theFirstFileName = theConsole.nextLine();
            //Write if-statement to check if filename exists.
        }
        myFlag = false;
        while(!myFlag) {
            System.out.println("Please enter the second filepath: ");
            theSecondFileName = theConsole.nextLine();
            //Write if-statement to check if filename exists.
        }

        //Call method that checks files.
    }
}
