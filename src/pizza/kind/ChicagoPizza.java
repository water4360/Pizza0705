package pizza.kind;

public class ChicagoPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("[CHI]시카고피자 준비!");
		
	}

	@Override
	public void bake() {
		System.out.println("[CHI]180도 오븐구이");
		
	}

	@Override
	public void cut() {
		System.out.println("[CHI]6조각 컷팅!");
		
	}

	@Override
	public void boxing() {
		System.out.println("[CHI]남색 박스에 포장!");
		
	}

}
