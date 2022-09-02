package exercise08;

	public abstract class Book {
	//필드 
	private int number; // 관리번호
	private String title; //책의 제목
	private String autor; // 책의 저자
	private static int countOfBooks; //만들어진 책의 객체 개수,선언과 동시에 0으로 초기화
	//생성자
	public Book(String title, String autor) {
		
		
		number = ++countOfBooks;
		this.autor = autor;
		this.title = title;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public abstract int getLateFee(int lateDays); 
	
//	public boolean equals(Book a) {
//		if(a.getTitle()==getTitle()&& a.getAutor()==getAutor()) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		if(title.equals(book.title)&&autor.equals(book.autor)) {
			return true;
		}
		 return false;
	}
	public int hashCode(){
		return 0;
	}
	@Override
	public String toString() {
		return "관리번호" + number + "," +"제목: " + title + ", 작가: " + autor +
				"(일주일 연체료:" + getLateFee(7) + "원)";
	}
	
}
