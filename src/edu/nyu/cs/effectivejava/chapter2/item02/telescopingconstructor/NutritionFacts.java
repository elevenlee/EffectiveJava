package edu.nyu.cs.effectivejava.chapter2.item02.telescopingconstructor;

/**
 * @author shenli
 * <p>
 * Telescoping constructor pattern -- does not scale well!
 */
public class NutritionFacts {
    @SuppressWarnings("unused")
    private final int servingSize;  // (mL)             required
    @SuppressWarnings("unused")
    private final int servings;     // (per container)  required
    @SuppressWarnings("unused")
    private final int calories;     //                  optional
    @SuppressWarnings("unused")
    private final int fat;          // (g)              optional
    @SuppressWarnings("unused")
    private final int sodium;       // (mg)             optional
    @SuppressWarnings("unused")
    private final int carbohydrate; // (g)              optional
    
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }
    
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }
    
    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }
    
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }
    
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
    }
    
}
