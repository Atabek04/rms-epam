package models;

import java.util.List;

public class Dish {
    private int dishId;
    private String name;
    private double price;
    private List<String> ingredients;

    public Dish(int dishId, String name, double price, List<String> ingredients) {
        this.dishId = dishId;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public int getDishId() {
        return dishId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
