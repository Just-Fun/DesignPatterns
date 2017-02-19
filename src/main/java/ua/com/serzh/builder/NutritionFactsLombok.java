package ua.com.serzh.builder;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Serzh on 11/17/16.
 */
@Builder
@ToString
@Getter
public class NutritionFactsLombok {

    private  int servingSize;
    private  int servings;
    private  int calories;
    @Singular // create an empty list
    private  List<Integer> fats;
    private  int sodium;
    private  int carbohydrate;

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        NutritionFactsLombok nutritionFactsLombok = NutritionFactsLombok.builder().servingSize(240).
                calories(100).sodium(35).carbohydrate(27).fats(integers).build();

        List<Integer> fats = nutritionFactsLombok.getFats();

        System.out.println(nutritionFactsLombok.toString());
        System.out.println(nutritionFactsLombok.getClass());
        System.out.println(fats);
    }

  /*  public static class Builder {
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

        public NutritionFactsLombok build() {
            return new NutritionFactsLombok(this);
        }
    }

    private NutritionFactsLombok(Builder builder) {
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
    }*/
}