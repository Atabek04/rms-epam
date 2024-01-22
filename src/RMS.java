import models.Chef;
import models.Customer;
import models.Order;
import models.Table;
import models.Menu;
import java.util.ArrayList;
import java.util.List;

public class RMS {
    private Menu menu;
    private List<Order> orders;
    private List<Customer> customers;
    private List<Chef> chefs;
    private List<Table> tables;

    public RMS() {
        this.menu = new Menu();
        this.orders = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.chefs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void assignTable(Customer customer, Table table) {
        // Logic to assign a table to a customer
    }

    public Menu displayMenu() {
        return menu;
    }

    public List<Order> displayOrders() {
        return orders;
    }

    public List<Customer> displayCustomers() {
        return customers;
    }

    public List<Chef> displayChefs() {
        return chefs;
    }

    public List<Table> displayTables() {
        return tables;
    }
}
