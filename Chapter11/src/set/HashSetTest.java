package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String [] ar) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
