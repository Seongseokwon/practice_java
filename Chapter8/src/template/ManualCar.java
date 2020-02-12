package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 주행합니다");
		System.out.println("사람이 핸들로 방향을 바꿉니다");
	}

	@Override
	public void stop() {
		System.out.println("사람이 멈춥니다 멈춥니다");
	}

	
}
