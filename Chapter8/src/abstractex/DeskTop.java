package abstractex;

public class DeskTop extends Computer{

	public void display() {
		System.out.println("DeskTop Display.");
	}
	public void typing() {
		System.out.println("DeskTop Typing.");
	}
	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}
	 
	
}
