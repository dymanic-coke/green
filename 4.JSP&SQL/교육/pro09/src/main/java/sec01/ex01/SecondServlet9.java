package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet9
 */
@WebServlet("/second9")
public class SecondServlet9 extends HttpServlet {

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메소드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String address =request.getParameter("user_address");
		
		out.println("<html><body>");
		if(id != null && id.length() != 0) {
			out.println("이미 로그인 상태입니다!<br><br>");
			out.println("LoginServlet 서블릿에서 넘겨준 아이디 : " + id + "<br>");
			out.println("LoginServlet 서블릿에서 넘겨준 비밀번호 : " + pw + "<br>");
			out.println("LoginServlet 서블릿에서 넘겨준 주소 : " + address + "<br>");
			out.println("</body></html>");
			
		} else {
			out.println("로그인 하지 않았습니다.<br><br>");
			out.println("다시 로그인하세요.<br>");
			out.println("<a href='login.html'>로그인 창으로 이동 </>");
			
		}
	}

}
