package edu.nyu.cs.effectivejava.chapter2.item02.javabeans;

public class NutritionFacts {
    // Parameters initialized to default values (if any)
    @SuppressWarnings("unused")
    private int servingSize     = -1;   // Required; no default value
    @SuppressWarnings("unused")
    private int servings        = -1;   // Required; not default value
    @SuppressWarnings("unused")
    private int calories        = 0;
    @SuppressWarnings("unused")
    private int fat             = 0;
    @SuppressWarnings("unused")
    private int sodium          = 0;
    @SuppressWarnings("unused")
    private int carbohydrate    = 0;
    
    public NutritionFacts() {}
    
    // Setters
    public void setServingSize(int val)     {   servingSize = val;  }
    public void setServings(int val)        {   servings = val; }
    public void setCalories(int val)        {   calories = val; }
    public void setFat(int val)             {   fat = val;  }
    public void setSodium(int val)          {   sodium = val;   }
    public void setCarbohydrate(int val)    {   carbohydrate = val; }
    
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }

}
