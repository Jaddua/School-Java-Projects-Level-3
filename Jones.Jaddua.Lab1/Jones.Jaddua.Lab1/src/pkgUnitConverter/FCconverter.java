/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * Class to convert Fahrenheit to Celsius
 *
 * @author Jaddua Jones
 */
public class FCconverter implements Behaviour {

    private final double convFactor = 1.8;
    private final double convOrigin = 32.0;

    @Override
    /**
     * @param fahrenheit value in Fahrenheit to be converted
     * @return equivalent in Celsius
     */
    public double convert(double fahrenheit) {
        return fahrenheit * convFactor + convOrigin;
    }
}
