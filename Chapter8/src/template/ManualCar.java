package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�");
		System.out.println("����� �ڵ�� ������ �ٲߴϴ�");
	}

	@Override
	public void stop() {
		System.out.println("����� ����ϴ� ����ϴ�");
	}

	
}
