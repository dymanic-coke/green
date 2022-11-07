package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet7
 */
@WebServlet("/second7")
public class SecondServlet7 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String address = (String)request.getAttribute("address");
		pw.println("<html><body>");
		pw.println("주소 : " + address);
		pw.println("<br>");
		pw.println("redirect를 이용한 바인딩 실습입니다.");
		pw.println("</body></html>");
	}

}
