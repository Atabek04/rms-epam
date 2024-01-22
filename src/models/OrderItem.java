package models;

public class OrderItem {
    private int quantity;
    private Dish dish;

    public OrderItem(int quantity, Dish dish) {
        this.quantity = quantity;
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", dish=" + dish +
                '}';
    }
}