package desertPizza;

public class Manager {
	   Order order;
	    public Manager() {}
	    public void takeOrder(Order order) {
	        this.order = order;
	        order.orderUp();
	    }

}
