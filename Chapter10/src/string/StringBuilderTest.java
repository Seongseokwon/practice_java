package string;

public class StringBuilderTest {
	
	public static void main(String [] ar) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));
		java = buffer.toString();
		
		
		Integer a1 = 1;
		int a2 =1;
		
		System.out.println(a1);
		System.out.println(a2);
		
	}

}
