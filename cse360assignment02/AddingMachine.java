package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    /**
     * Constructor that sets initial total and calculation history to 0
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * Returns the current total
     * @return total the current total
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds the input to both the total and the calculation history
     * @param value value to be added
     */
    public void add (int value) {
        total += value;
        history = history + " + " + value;
    }

    /**
     * Subtracts the input to both the total and the calculation history
     * @param value value to be subtracted
     */
    public void subtract (int value) {
        total -= value;
        history = history + " - " + value;
    }

    /**
     * Returns the calculation history
     * @return history the calculation history
     */
    public String toString () {
        return history;
    }

    /**
     * Sets the total and calculation history to 0
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}