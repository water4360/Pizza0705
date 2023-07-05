package pizza.store;

import pizza.kind.NewyorkCheesePizza;
import pizza.kind.Pizza;

public class NewyorkPizzaStore extends PizzaStore {
	
	@Override
	public void createPizza(Pizza pizza) {
		pizza = new NewyorkCheesePizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.boxing();
	}
}
