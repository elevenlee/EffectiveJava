package edu.nyu.cs.effectivejava.chapter2.item02.builder;

/**
 * @author shenli
 * <p>
 * Builder pattern.
 */
public class NutritionFacts {
    @SuppressWarnings("unused")
    private final int servingSize;
    @SuppressWarnings("unused")
    private final int servings;
    @SuppressWarnings("unused")
    private final int calories;
    @SuppressWarnings("unused")
    private final int fat;
    @SuppressWarnings("unused")
    private final int sodium;
    @SuppressWarnings("unused")
    private final int carbohydrate;
    
    public static class InnerBuilder implements Builder<NutritionFacts> {
        // Required parameters
        private final int servingSize;
        private final int servings;
        
        // Optional parameters -- initialized to default values
        private int calories        = 0;
        private int fat             = 0;
        private int carbohydrate    = 0;
        private int sodium          = 0;
        
        public InnerBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        
        public InnerBuilder calories(int val) {
            calories = val;
            return this;
        }
        
        public InnerBuilder fat(int val) {
            fat = val;
            return this;
        }
        
        public InnerBuilder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }
        
        public InnerBuilder sodium(int val) {
            sodium = val;
            return this;
        }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    
    private NutritionFacts(InnerBuilder builder) {
        servingSize     = builder.servingSize;
        servings        = builder.servings;
        calories        = builder.calories;
        fat             = builder.fat;
        sodium          = builder.sodium;
        carbohydrate    = builder.carbohydrate;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        NutritionFacts cocaCola = new NutritionFacts.InnerBuilder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
    }

}
