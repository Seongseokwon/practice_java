package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("�¹���1", "������");
		studentLee.addBook("�¹���2", "������");
		
		studentLee.showBookInfo();

	}

}
