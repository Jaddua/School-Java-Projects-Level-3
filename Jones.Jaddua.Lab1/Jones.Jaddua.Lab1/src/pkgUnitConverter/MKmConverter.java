/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * Class to convert miles to kilometres
 *
 * @author Jaddua Jones
 */
public class MKmConverter implements Behaviour {

    private final double convFactor = 1.609344;

    @Override
    /**
     * @param miles value in miles to be converted
     * @return equivalent in kilometres
     */
    public double convert(double miles) {
        return (miles * convFactor);
    }
}
