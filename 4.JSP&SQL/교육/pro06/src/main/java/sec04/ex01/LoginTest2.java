package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest2
 */
@WebServlet("/loginT2")
public class LoginTest2 extends HttpServlet {

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메소드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메소드 호출");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		
		if((id != null && (id.length() != 0)) && (pw != null && (pw.length() != 0))) {
			if(id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>관리자로 로그인 하셨습니다.</font>");
				out.print("<hr>");
				out.print("<input type='button' value='회원정보 수정하기' />");
				out.print("<input type='button' value='회원정보 삭제하기' />");
				out.print("</body>");
				out.print("</html>");
			}else {
				out.print("<html>");
				out.print("<body>");
				out.print(id + "님!!! 로그인 하셨습니다.");
				out.print("</body>");
				out.print("</html>");
			}
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디와 비밀번호를 입력하세요!!");
			out.print("<br>");
			out.print("<a href='login.html'>로그인창으로 이동</a>");
			out.print("</body>");
			out.print("</html>");
//			response.sendRedirect("login.html");
		}
	}

}
