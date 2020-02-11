package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("태백산맥1", "조정래");
		studentLee.addBook("태백산맥2", "조정래");
		
		studentLee.showBookInfo();

	}

}
