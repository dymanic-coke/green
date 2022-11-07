package sec03.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest4
 */
@WebServlet("/sess4")
public class SessionTest4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		if(session.isNew()) {
			if(id != null) {
				session.setAttribute("user_id", id);
				out.println("<a href='sess4'>로그인 상태 확인하기</a>");
			}else {
				out.print("<a href='login09.html'>다시 로그인 하세요!!</a>");
				session.invalidate();
			}
		}else {
			id = (String) session.getAttribute("user_id");
			if(id !=null && id.length() != 0) {
				out.print("안녕하세요! " + id + "님!!");
			}else {
				out.print("<a href ='login09.html>다시 로그인 하세요!!</a>");
				session.invalidate();
			}
		}
	}

}
