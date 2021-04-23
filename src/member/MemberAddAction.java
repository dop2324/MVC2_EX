package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//회원가입 관련 Action
public class MemberAddAction implements Action {
			//구현부가 없어서
		@Override
		public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
					MemberDao mdao = new MemberDao();
					MemberBean mbean = new MemberBean();
					ActionForward forward = new ActionForward();
					
					request.setCharacterEncoding("utf-8");
				try {	
					mbean.setId(request.getParameter("id"));
					mbean.setAge(Integer.parseInt(request.getParameter("age")));
					mbean.setBirth(request.getParameter("birth"));
					mbean.setEmail(request.getParameter("email"));
					mbean.setName(request.getParameter("name"));
					mbean.setPassword(request.getParameter("password"));
					mbean.setPhone(request.getParameter("phone"));
					// insert 메서드 호출
					mdao.insertM(mbean);	
					
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
					forward.setRedirect(false);
					forward.setPath("mvc_membermain.jsp");
					
					return forward;
				}
}
