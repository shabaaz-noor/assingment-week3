package desertPizza;

public class Customer {
	
    Manager manager;
    Order order;

    public Customer(Manager manager) {
        this.manager = manager;
    }

    public void createOrder(Order order) {
        this.order = order;

    }

    public void ReadyForOrder() {
        manager.takeOrder(order);
    }

}
