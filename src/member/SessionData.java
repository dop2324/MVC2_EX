package member;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionData {
	public void SessionD(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
	String id= request.getParameter("id"); 
	String name= request.getParameter("name");
	String phone= request.getParameter("phone");
	String birth= request.getParameter("birth");
	
	session.setAttribute("id",id);
	session.setAttribute("name",name);
	session.setAttribute("phone",phone);
	session.setAttribute("birth",birth);
	}
}
