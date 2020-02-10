package classpart;


public class StudentTest {
	public static void main(String [] ar) {
		
		Student studentHo = new Student("호일");
//		studentHo.studentName = "호일";
		studentHo.address = "서울";
		
		studentHo.showStudentInfo();
		
		Student studentKim = new Student(100,"김이");
//		studentKim.studentName ="김이";
//		studentKim.address = "부산";
		
		studentKim.showStudentInfo();
		
//		System.out.println(studentHo);
//		System.out.println(studentKim);
	}
}
