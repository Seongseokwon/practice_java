package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubejct("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubejct("국어", 20);
		studentKim.setMathSubject("수학", 95);
		
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
