package chapter08;

public class Student implements Comparable<Student>{
	public String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
	}

	@Override //compareTo라는 정렬 메소드 
	public int compareTo(Student o) {
		//이름 기준 정렬
		return this.name.compareTo(o.name);
		//this. 앞에 -를 붙이면 순서 역순(내림차순)
		
		//나이 기준 정렬
//		if(this.age>o.age) {  
//			return 1; // 1은 변경
//		}else if(this.age<o.age) {
//			return -1;//-1은 변경X
//		}else {
//			return 0;//넘어감			
//		}
//		
	}

}