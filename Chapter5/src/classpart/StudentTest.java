package classpart;


public class StudentTest {
	public static void main(String [] ar) {
		
		Student studentHo = new Student("ȣ��");
//		studentHo.studentName = "ȣ��";
		studentHo.address = "����";
		
		studentHo.showStudentInfo();
		
		Student studentKim = new Student(100,"����");
//		studentKim.studentName ="����";
//		studentKim.address = "�λ�";
		
		studentKim.showStudentInfo();
		
//		System.out.println(studentHo);
//		System.out.println(studentKim);
	}
}
