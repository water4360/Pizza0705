package pizza.kind;

import java.util.List;

public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String cheese;
//	protected List<Topping> toppingList;
	
	public Pizza() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void cut();
	public abstract void boxing();
	
	
}
