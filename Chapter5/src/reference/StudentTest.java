package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubejct("����", 100);
		studentLee.setMathSubject("����", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubejct("����", 20);
		studentKim.setMathSubject("����", 95);
		
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
