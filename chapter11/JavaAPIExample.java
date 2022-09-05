package chapter11;

import java.util.Objects;

// VO(Value Object) : 데이터를 저장하는 객체
// DTO(Date Transfer Object) : 데이트를 전달하는 객체
// Bean => 자바 커피 원두(bean) => 데이터를 저장하는 객체를 표현
// Item, Model 등과 같은 접미사를 붙이기도 함
// Lombok
// Kotlin 언어 : jetBrain(intellij를 만든 회사)

public class JavaAPIExample {

		private String name;
		private int id;
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof JavaAPIExample)) {
				return false;
			}
			JavaAPIExample other = (JavaAPIExample) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public JavaAPIExample() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
		// apache 재단 => commons로 시작하는 접두어 라이브러리
			return String.format("JavaAPIExample [name=%s, id=%s]", name, id);
		}
	
}
