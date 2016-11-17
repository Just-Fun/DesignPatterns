package ua.com.serzh.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serzh on 11/17/16.
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final List<Integer> fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).fat(1,2,3,4,5).build();

        System.out.println(cocaCola.toString());
        System.out.println(cocaCola.getClass());

    }

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private List<Integer> fat = new ArrayList<>();
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int... val) {
            for (int i: val) {
                fat.add(i);
            }
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        String result = "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
        fat.stream().forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        return result;
    }
}