package sort;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort Asccendig");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort Descendig");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort ¿‘¥œ¥Ÿ");
	}

}
