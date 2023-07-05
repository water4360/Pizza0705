package pizza.kind;

public class NewyorkCheesePizza extends Pizza {

	public NewyorkCheesePizza() {
		super();
	}

	@Override
	public void prepare() {
		System.out.println("[NY]뉴욕치즈피자 준비!");
	}
	
	@Override
	public void bake() {
		System.out.println("[NY]200도 직화구이");
	}

	@Override
	public void cut() {
		System.out.println("[NY]8조각으로 커팅!");
	}

	@Override
	public void boxing() {
		System.out.println("[NY]치즈색 리본으로 포장!");
		
	}

	
	
	

}
