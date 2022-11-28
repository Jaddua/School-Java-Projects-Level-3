/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * Class to convert kilometres to miles
 *
 * @author Jaddua Jones
 */
public class KmMConverter implements Behaviour {

    private final double convFactor = 1.609344;

    @Override
    /**
     * @param kilometres value in kilometres to be converted
     * @return equivalent in miles
     */

    public double convert(double kilometres) {
        return (kilometres / convFactor);
    }
}
