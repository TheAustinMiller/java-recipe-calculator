/*
 * Course: CS1021
 * Winter 2020-2021
 * Lab 2 - Kitchen
 * Name: Austin Miller
 * Created: 15 Dec 2020
 */

import java.util.ArrayList;
import java.util.List;
/**
 * Implements an ingredient to be mixed
 */
public class Mix implements Ingredient {
    private final List<Ingredient> ingredients;
    private final String name;
    private final List<Ingredient> wets;
    private final List<Ingredient> drys;
    /**
     * Assigns values to instance variables
     * @param name name of ingredient
     */
    public Mix(String name) {
        this.name = name;
        ingredients = new ArrayList<>();
        wets = new ArrayList<>();
        drys = new ArrayList<>();
    }
    /**
     * Adds an ingredient object to the list
     * @param ingredient ingredient object to be added to list
     */
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        if (ingredient.isDry()){
            drys.add(ingredient);
        } else {
            wets.add(ingredient);
        }
    }
    /**
     * Runs through list to determine if any ingredient is dry
     * @return boolean value of whether the above statement is T/F
     */
    public boolean hasDryIngredient() {
        boolean flag = false;
        for (int lcv = 0; lcv < ingredients.size(); lcv++){
            if (ingredients.get(lcv).isDry()){
                flag = true;
            }
        }
        return flag;
    }
    /**
     * Runs through list to determine if any ingredient is dry
     * @return boolean value of whether the above statement is T/F
     */
    public boolean hasWetIngredient() {
        boolean flag = false;
        for (int lcv = 0; lcv < ingredients.size(); lcv++){
            if (!ingredients.get(lcv).isDry()){
                flag = true;
            }
        }
        return flag;
    }
    /**
     * Returns sum of calories in the list
     * @return sum of calories
     */
    public double getCalories() {
        double sum = 0;
        for (int lcv = 0; lcv < ingredients.size(); lcv++){
            sum += ingredients.get(lcv).getCalories();
        }
        return sum;
    }
    /**
     * Returns sum of volume of all ingredients in the list
     * @return sum of volume
     */
    public double getCups() {
        double sum = 0;
        for (int lcv = 0; lcv < ingredients.size(); lcv++){
            sum += ingredients.get(lcv).getCups();
        }
        return sum;
    }

    public String getName(){
        return name;
    }

    public boolean isDry(){
        return !hasWetIngredient();
    }
    /**
     * prints the full recipe
     */
    public void printRecipe() {
        System.out.println("====================================================");
        System.out.println(name);
        System.out.println("====================================================");
        System.out.println("Dry Ingredients: ");
        for (int lcv = 0; lcv < drys.size(); lcv++){
            System.out.println("\t" + drys.get(lcv).getName());
        }
        System.out.println();
        System.out.println("Wet Ingredients: ");
        for (int lcv = 0; lcv < wets.size(); lcv++){
            System.out.println("\t" + wets.get(lcv).getName());
        }
        System.out.println();
        for (int lcv = 0; lcv < ingredients.size(); lcv++){
            System.out.println("====================================================");
            System.out.println(ingredients.get(lcv).getName());
            System.out.println("====================================================");
            System.out.println("Cups: " +
                    CUP_FORMAT.format(ingredients.get(lcv).getCups()) + " Cups");
            System.out.println("Energy: " +
                    Math.round(ingredients.get(lcv).getCalories()) + " Calories\n");
        }
        System.out.println("Cups: " + getCups());
        System.out.println("Energy: " + getCalories());
    }
}
