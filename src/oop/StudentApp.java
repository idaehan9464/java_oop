package oop;

public class StudentApp {
	public static void main(String[] args) {
	Student student = new Student("이대한", "IT보안과");
		System.out.println(student.getSsn());
		String name = student.getName();
		System.out.println(name);
		student.study();
		
		// 클래스(static)변수는 클래스이름.변수명
		System.out.println(Student.SCHOOL_NAME);
		Student student2 = new Student("이대한", "컴퓨터공학과");
		System.out.println(student2.getSsn());
		System.out.println(Student.SCHOOL_NAME);
	}
}