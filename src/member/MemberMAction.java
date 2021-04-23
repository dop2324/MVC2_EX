package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




// 글 수정 Action
public class MemberMAction implements Action {
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
					// Modify 메서드 호출
					mdao.memberModify(mbean);	
					
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				forward.setRedirect(true);
	    		forward.setPath("BoardList.me");
					// url 을 활용할 때  
	    		// "BoardList.me?id="+ request.getParameter("id"));
					return forward;
				}

}
