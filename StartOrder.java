package desertPizza;

public class StartOrder implements Order {
	
    Worker worker;
    public StartOrder(Worker worker) {
        this.worker = worker;
    }
    
    //Using a Facade design pattern 
    public void orderUp() {
        worker.makeCaramelApplePizza();
        worker.makePerfectCookieCakePizza();
    }

}
