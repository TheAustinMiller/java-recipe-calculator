/*
 * Course: CS1021
 * Winter 2020-2021
 * Lab 2 - Kitchen
 * Name: Austin Miller
 * Created: 15 Dec 2020
 */

/**
 * Creates a sample ingredient
 */
public class SimpleIngredient implements Ingredient {
    private final double calories;
    private final double cups;
    private boolean isDry;
    private final String name;

    /**
     * Sets instance variables equal to
     * appropriate input
     * @param name name of ingredient
     * @param calories how much energy ingredient has
     * @param cups how many cups-worth of ingredient
     * @param isDry checks if the ingredient is dry or wet
     */
    public SimpleIngredient(String name, double calories, double cups, boolean isDry){
        this.calories = calories;
        this.cups = cups;
        this.isDry = isDry;
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public double getCups() {
        return cups;
    }

    public String getName() {
        return name;
    }

    public boolean isDry(){
        return isDry;
    }

    /**
     * Prints the ingredient in specified way
     */
    public void printRecipe(){
        System.out.println("====================================================");
        System.out.println(name);
        System.out.println("====================================================");
        System.out.println();
        System.out.println("Cups: " + getCups());
        System.out.println("Energy: " + getCalories());
    }
}
