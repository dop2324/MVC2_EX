package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Action {
	
		
		@Override
		public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
					MemberDao mdao = new MemberDao();
					MemberBean mbean = new MemberBean();
					ActionForward forward = new ActionForward();
					
					request.setCharacterEncoding("utf-8");
				try {	
					mbean.setId(request.getParameter("id"));
					mbean.setPassword(request.getParameter("password"));
				
					mdao.Login(mbean);	
					System.out.print(mbean);
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				forward.setRedirect(false);
        		forward.setPath("mvc_membermain.jsp");
					
					return forward;
				}
	}

