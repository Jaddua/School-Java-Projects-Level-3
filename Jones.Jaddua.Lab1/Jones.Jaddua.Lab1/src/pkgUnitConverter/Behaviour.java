/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * An interface to implement the strategy pattern learned in week 1. The
 * interface will allow multiple behaviours (unit to unit conversions) to be
 * used on a single UnitConverter class
 *
 * @author Jaddua Jones
 */
public interface Behaviour {

    /**
     * Abstract method to convert units to another unit based on the behaviour
     * specified
     *
     * @param value The value of the unit to be converted
     * @return The value of the resulting unit after conversion
     */
    public double convert(double value);

}
