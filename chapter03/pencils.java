package chapter03;

public class pencils {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		int percilsLaft = pencils % students;
		
		System.out.println(percilsLaft);
	}

}
