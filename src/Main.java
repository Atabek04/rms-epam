import models.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating a menu with some dishes
        Menu menu = new Menu();
        Dish spaghetti = new Dish(1, "Spaghetti", 10.99, Arrays.asList("Pasta", "Tomato Sauce", "Cheese"));
        Dish pizza = new Dish(2, "Pizza", 12.99, Arrays.asList("Dough", "Tomato Sauce", "Cheese", "Pepperoni"));
        menu.addDish(spaghetti);
        menu.addDish(pizza);

        // Creating a chef
        Chef chef = new Chef(1, "Chef Gordon", Arrays.asList("Italian Cuisine"));

        // Creating a customer
        Customer customer = new Customer(1, "Otabek Shadimatov", "+77475004241");

        // Creating a table
        Table table = new Table(1, 4);

        // Creating an order and add dishes to it
        Order order = new Order(1, customer);
        order.addItem(new OrderItem(2, spaghetti));
        order.addItem(new OrderItem(1, pizza));

        // Creating an instance of RMS
        RMS restaurant = new RMS();
        restaurant.displayMenu(); // Display the menu
        restaurant.addOrder(order); // Add the order to the system
        restaurant.addCustomer(customer); // Add the customer to the system
        restaurant.assignTable(customer, table); // Assign the table to the customer

        // Displaying information
        System.out.println("Orders: " + restaurant.displayOrders());
        System.out.println("Customers: " + restaurant.displayCustomers());
        System.out.println("Tables: " + restaurant.displayTables());

        // Chef conducting a class
        chef.conductClass();
    }
}
