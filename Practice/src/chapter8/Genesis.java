package chapter8;

public class Genesis extends Car{

	@Override
	public void start() {
		System.out.println("제네시스가 시동을 겁니다");
	}

	@Override
	public void drive() {
		System.out.println("제네시스가 주행을 합니다");
	}

	@Override
	public void stop() {
		System.out.println("제네시스가  멈춥니다");
	}

	@Override
	public void turnoff() {
		System.out.println("제네시스가  시동을 끕니다");
	}

}
