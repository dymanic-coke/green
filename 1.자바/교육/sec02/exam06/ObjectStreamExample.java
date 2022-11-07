package sec02.exam06;

import java.io.*;
import java.text.*;
import java.util.*;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception{
		writeList();
		List<Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일");
		for(Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" + board.getContant()
					+ "\t" + board.getWriter() + "\t" + sdf.format(board.getdate()));
		}
	}
	
	public static void writeList() throws Exception{
		List<Board> list = new ArrayList<>();
		
		list.add(new Board(1, "제목1", "내용1", "작가1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "작가2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "작가3", new Date()));
		
		OutputStream os = new FileOutputStream("E:/kimheejae/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception{
		InputStream is = new FileInputStream("E:/kimheejae/temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(is);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
