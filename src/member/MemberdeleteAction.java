package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberdeleteAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
				MemberDao mdao = new MemberDao();
				MemberBean mbean = new MemberBean();
				ActionForward forward = new ActionForward();
				
				request.setCharacterEncoding("utf-8");
			try {	
				mbean.setId(request.getParameter("id"));
			
				mdao.memberRemove(mbean);	
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
				
				
				return null;
			}
}
