/*
 * Course: CS1021
 * Winter 2020-2021
 * Lab 2 - Kitchen
 * Name: Austin Miller
 * Created: 15 Dec 2020
 */
/**
 * Creates a bakedIngredient for use in kitchen
 */
public class BakedIngredient implements Ingredient {
    private final Ingredient bakedIngredient;
    private final double expansionFactor;
    /**
     * Assigns values to instance variables
     * @param ingredient Brings in an already created ingredient
     * @param expansionFactor a value that is factored in when calculating expansion
     */
    public BakedIngredient(Ingredient ingredient, double expansionFactor) {
        bakedIngredient = ingredient;
        this.expansionFactor = expansionFactor;
    }

    public double getCalories() {
        return bakedIngredient.getCalories();
    }

    public double getCups() {
        return bakedIngredient.getCups() * expansionFactor;
    }

    public String getName() {
        return "Baked " + bakedIngredient.getName();
    }

    public boolean isDry() {
        return true;
    }
    /**
     * Prints the full recipe
     */
    public void printRecipe() {
        System.out.println("====================================================");
        System.out.println("Baked " + bakedIngredient.getName());
        System.out.println("====================================================");
        System.out.println("Ingredient to be baked: " + bakedIngredient.getName());
        System.out.println("Cups: " +
                bakedIngredient.CUP_FORMAT.format(bakedIngredient.getCups()
                        * expansionFactor) + " Cups");
        System.out.println("Energy: " + Math.round(bakedIngredient.getCalories()) + " Calories\n");
    }
}
