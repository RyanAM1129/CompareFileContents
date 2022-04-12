package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Display {
    /**
     * A flag used to stop the program.
     *
     * False when you want to stop, true when you want to continue.
     */
    private static boolean myFlag;
    /**
     * Keeps count of the current line.
     */
    private static int myLineCount;

    public static void mainMenu() {
        Scanner theConsole = new Scanner(System.in);
        String theFirstFileName = null, theSecondFileName = null;
        myFlag = false;
        while(!myFlag) {
            System.out.println("Please enter the first filepath: ");
            theFirstFileName = theConsole.nextLine();
            //Write if-statement to check if filename exists.
            myFlag = true;
        }
        myFlag = false;
        while(!myFlag) {
            System.out.println("Please enter the second filepath: ");
            theSecondFileName = theConsole.nextLine();
            //Write if-statement to check if filename exists.
            myFlag = true;
        }

        //Call method that checks files.
        BufferedReader theFirstReader, theSecondReader;
        try {
            theFirstReader = new BufferedReader(new FileReader(theFirstFileName));
            theSecondReader = new BufferedReader(new FileReader(theSecondFileName));
            String theFirstLine = theFirstReader.readLine();
            String theSecondLine = theSecondReader.readLine();
            myLineCount = 1;
            while (theFirstLine != null) {
                if(!theFirstLine.equals(theSecondLine)) {
                    System.out.println("Not Equal at line " + myLineCount);
                    System.out.println(theFirstLine);
                    System.out.println(theSecondLine);
                }
                // read next line
                theFirstLine = theFirstReader.readLine();
                theSecondLine = theSecondReader.readLine();
                myLineCount++;
            }
            theFirstReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
