import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    void display();
}

class VegetarianMeal implements MealPlan {
    public void display() {
        System.out.println("Vegetarian Meal: Paneer Curry");
    }
}

class VeganMeal implements MealPlan {
    public void display() {
        System.out.println("Vegan Meal: Tofu Salad");
    }
}

class KetoMeal implements MealPlan {
    public void display() {
        System.out.println("Keto Meal: Grilled Chicken");
    }
}

class HighProteinMeal implements MealPlan {
    public void display() {
        System.out.println("High Protein Meal: Eggs and Chicken");
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

public class MealPlanGenerator {

    public static <T extends MealPlan> void generateMealPlan(T meal) {
        meal.display();
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegetarian = new Meal<>();
        vegetarian.addMeal(new VegetarianMeal());

        Meal<VeganMeal> vegan = new Meal<>();
        vegan.addMeal(new VeganMeal());

        Meal<KetoMeal> keto = new Meal<>();
        keto.addMeal(new KetoMeal());

        Meal<HighProteinMeal> protein = new Meal<>();
        protein.addMeal(new HighProteinMeal());

        for (VegetarianMeal meal : vegetarian.getMeals()) {
            generateMealPlan(meal);
        }

        for (VeganMeal meal : vegan.getMeals()) {
            generateMealPlan(meal);
        }

        for (KetoMeal meal : keto.getMeals()) {
            generateMealPlan(meal);
        }

        for (HighProteinMeal meal : protein.getMeals()) {
            generateMealPlan(meal);
        }
    }
}
