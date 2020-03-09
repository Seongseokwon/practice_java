package collection;

import java.util.ArrayList;

class MyStack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
		
	}
	
	public String pop() {
		int len= arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		return arrayStack.remove(len-1);
		
	}
}

public class StackTest{
	 public static void main(String [] ar) {
		 MyStack mystack = new MyStack();
		 mystack.push("A");
		 mystack.push("B");
		 mystack.push("C");
		 
		 System.out.println(mystack.pop());
		 System.out.println(mystack.pop());
		 System.out.println(mystack.pop());
		 System.out.println(mystack.pop());
		 
	 }
}