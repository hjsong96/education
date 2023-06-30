package car;

public class Board {

	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = 0;
	}
	
	Board(String title, String content, String writer) {
		this(title, content);
		this.writer = writer;
		this.date = date;
		this.hitcount = 0;
	}
	
	Board(String title, String content, String writer, String date) {
		this(title, content, writer);
		this.date = date;
		this.hitcount = 0;
	}

	Board(String title, String content, String writer, String date, int hitcount) {
		this(title, content, writer, date);
		this.hitcount = 0;
	}

	public static void main(String[] args) {
		
		Board b = new Board("title", "content");
		System.out.println(b.title);

	}

}
