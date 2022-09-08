package exercise13;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNum == other.studentNum;
	}
	
	
}
