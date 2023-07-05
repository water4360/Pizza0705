package pizza.store;

import pizza.kind.Pizza;

public abstract class PizzaStore {

	private Pizza pizza;

	//기본생성자
	public PizzaStore() {
		super();
	}
	
	public PizzaStore(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	//피잣집 메소드
	public void orderPizza(Pizza pizza) {
		System.out.println("피자주문 접수!");
		createPizza(pizza);
	}

	//피자만들기 안의...
	public abstract void createPizza(Pizza pizza);
	
}
