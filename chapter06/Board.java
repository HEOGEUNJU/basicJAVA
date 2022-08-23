package chapter06;

public class Board {

	private String title;
	private String content;
	private String writer;
	private String date;
	private int hitcount;

	Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.writer = "로그인한 회원아이디";
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
	}

	Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
	}

	Board(String title, String content, String writer, String date) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = 0;
	}
	// Getter 메소드
	public String gettitle(){
		return title; 
	}
		
	// Setter 메소드
	public void setTitle(String title ) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getwriter() {
		return writer;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public String date() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public int gethitcount() {
		return hitcount;
	}
	public void sethitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	
}



 














