package member;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberCAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
				MemberDao mdao = new MemberDao();
				MemberBean mbean = new MemberBean();
				ActionForward forward = new ActionForward();
				ArrayList <MemberBean> mlist = new ArrayList();
				request.setCharacterEncoding("utf-8");
			try {	
				
				//select
				mlist=mdao.memberlist(); // arraylist 타입 
				request.setAttribute("memberlist", mlist);
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
				
			forward.setRedirect(false);
			forward.setPath("mvc_memberList.jsp");	
				return forward;
			}
}
