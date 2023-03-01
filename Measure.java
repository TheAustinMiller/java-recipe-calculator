/*
 * Course: CS1021
 * Winter 2020-2021
 * Lab 2 - Kitchen
 * Name: Austin Miller
 * Created: 15 Dec 2020
 */
/**
 * Full class for a measured out ingredient
 */
public class Measure implements Ingredient {
    private final int numerator;
    private final int denominator;
    private final Ingredient measuredIngredient;

    /**
     * Assigns values to instance variables
     * @param numerator top value of volume
     * @param denominator bottom value of volume
     * @param measuredIngredient brings in the object
     */
    public Measure(int numerator, int denominator, Ingredient measuredIngredient) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.measuredIngredient = measuredIngredient;
    }
    /**
     * Assigns values to instance variables
     * @param numerator top value of volume
     * @param measuredIngredient brings in the object
     */
    public Measure(int numerator, Ingredient measuredIngredient) {
        this.numerator = numerator;
        this.denominator = 1;
        this.measuredIngredient = measuredIngredient;
    }

    public double getCalories() {
        return Math.round((double) (numerator / denominator)
                * (measuredIngredient.getCalories() / measuredIngredient.getCups()));
    }

    public double getCups() {
        return Double.parseDouble(measuredIngredient.CUP_FORMAT.format((double)
                (numerator / denominator)));
    }
    /**
     * Returns the ingredients name
     * @return name of ingredient
     */
    public String getName() {
        if (denominator == 1) {
            return "" + measuredIngredient.getCups() + " Cups " + measuredIngredient.getName();
        } else {
            return "" + numerator + "/" + denominator + " Cups " + measuredIngredient.getName();
        }
    }

    public boolean isDry() {
        return measuredIngredient.isDry();
    }
    /**
     * Prints the full recipe
     */
    public void printRecipe() {
        System.out.println("====================================================");
        System.out.println(getName());
        System.out.println("====================================================");
        System.out.println("Measured ingredient: " + measuredIngredient.getName());
        if (denominator == 1) {
            System.out.println("Quantity: " + numerator + " (" + getCups() + " Cups)");
        } else {
            System.out.println("Quantity: " + numerator + "/"
                    + denominator + " (" + getCups() + " Cups)");
        }
        System.out.println("Energy: " + getCalories() + "\n");
    }

    private String formatQuantity() {
        return "";
    }

}
