package ezen.springbasic.guestbook.dto;


public class Guestbook {
	
	private String writer;
	private String message;
	
	public Guestbook() {}
		
	public Guestbook(String writer, String message) {
		super();
		this.writer = writer;
		this.message = message;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Guestbook [writer=" + writer + ", message=" + message + "]";
	}
		
}
