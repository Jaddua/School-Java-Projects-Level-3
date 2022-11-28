/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverterTest;

import pkgUnitConverter.*;

/**
 * Simple class to test 4 classes for converting Fahrenheit to Celsius and the
 * reverse, as well as kilometres to miles and the reverse.
 *
 * @author Jaddua Jones
 */
public class UnitConverterTest {

    /**
     * The main method to demonstrate the use of the strategy learned in week 1
     * and to show different conversion classes implementing the Behaviour
     * interface
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        UnitConverter UC = new UnitConverter();

        UC.setValue(70.0);

        System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, UC.getValue());

        UC.changeBehaviour(new FCconverter());

        UC.setValue(20.0);

        System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, UC.getValue());

        UC.changeBehaviour(new KmMConverter());

        UC.setValue(250.0);

        System.out.printf("%5.2f in kilometres is %5.2f in miles\n", 250.0, UC.getValue());

        UC.changeBehaviour(new MKmConverter());

        UC.setValue(100.0);
        System.out.printf("%5.2f in miles is %5.2f in kilometres\n", 100.0, UC.getValue());
    }

}
