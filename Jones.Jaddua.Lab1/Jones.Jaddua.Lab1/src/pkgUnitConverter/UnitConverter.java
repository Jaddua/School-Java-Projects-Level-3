/*
Student Name: Jaddua Jones
Student Number: 040898457
Course & Section #: 22S_CST8288_013
Declaration:
This is my own original work and is free from Plagiarism.
 */
package pkgUnitConverter;

/**
 * Class to convert units based on behaviours given using the strategy pattern
 * learned in week 1
 *
 * @author Jaddua Jones
 */
public class UnitConverter {

    private double value;
    private Behaviour behaviour;

    /**
     * Default constructor for the UnitConverter class
     */
    public UnitConverter() {
        this.behaviour = new CFconverter();
    }

    /**
     * Setter method to set the value after being converted
     *
     * @param value the value to be converted and then have the class level
     * field of value set to the converted value with unit based on what
     * behaviour has been specified
     */
    public void setValue(double value) {
        this.value = this.behaviour.convert(value);
    }

    /**
     * Getter method to retrieve the converted value and return it
     *
     * @return the converted value of the unit based on what behaviour has been
     * specified
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Method to change the behaviour (which unit will be converted in to which unit and how to perform the conversion)
     * @param behaviour The class corresponding to a particular behaviour to control how the units are to be converted
     */
    public void changeBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

}
