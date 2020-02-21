package sort;

public class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort Asccendig");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort Descendig");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort ¿‘¥œ¥Ÿ");
	}

}
