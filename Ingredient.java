/*
 * Course: CS1021
 * Winter 2020-2021
 * Lab 2 - Kitchen
 * Name: Austin Miller
 * Created: 15 Dec 2020
 */

import java.text.DecimalFormat;

/**
 * Creates an interface for mix, bake, and measure
 */
public interface Ingredient {
    /**
     * Designated format for printing out volume
     */
    DecimalFormat CUP_FORMAT = new DecimalFormat("#.##");
    /**
     * How many calories per ingredient
     * @return number of calories
     */
    double getCalories();
    /**
     * How many cups per ingredient
     * @return number of cups
     */
    double getCups();
    /**
     * Name of ingredient
     * @return name
     */
    String getName();
    /**
     * returns if the ingredient is dry or wet
     * @return boolean value representing dryness or wetness
     */
    boolean isDry();
    /**
     * Prints the full recipe of the ingredient
     */
    void printRecipe();
}
