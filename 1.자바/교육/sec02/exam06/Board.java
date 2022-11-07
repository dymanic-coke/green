package sec02.exam06;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int bno;
	private String title;
	private String contant;
	private String writer;
	private Date date;
	
	public Board(int bno, String title, String contant, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.contant = contant;
		this.writer = writer;
		this.date = date;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContant() {
		return contant;
	}
	public void setContant(String contant) {
		this.contant = contant;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getdate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
