package pizza.main;

import pizza.kind.NewyorkCheesePizza;
import pizza.kind.Pizza;
import pizza.store.NewyorkPizzaStore;
import pizza.store.PizzaStore;

public class PizzaStoreMain {

	public static void main(String[] args) {
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("pizza/main/pizzaSetting.xml");
//		PizzaStore pizzaStore = ac.getBean("pizzaStore", PizzaStore.class);
//		Pizza pizza = ac.getBean("pizza", Pizza.class);
		
		PizzaStore pizzaStore = new NewyorkPizzaStore();
		Pizza pizza = new NewyorkCheesePizza();
		pizzaStore.orderPizza(pizza);
	}
}
