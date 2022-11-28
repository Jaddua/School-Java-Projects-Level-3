/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * Class to convert Celsius to Fahrenheit
 *
 * @author Jaddua Jones
 */
public class CFconverter implements Behaviour {

    private final double convFactor = 1.8;
    private final double convOrigin = 32.0;

    @Override
    /**
     * @param celsius value in Celsius to be converted
     * @return equivalent in Fahrenheit
     */
    public double convert(double celsius) {
        return (celsius - convOrigin) / convFactor;
    }
}
