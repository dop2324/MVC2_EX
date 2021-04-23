package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//접근제어자 public private protected

@WebServlet("/MemberFrontController")
public class MemberFrontController extends HttpServlet implements Servlet {
	
	/*private static final long serialVersionUID = 1L;*/

   
    /*public MemberFrontController() {
    		
    }*/
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			//연결실행문 입력
    	String RequestURI = request.getRequestURI();
    	//URI = MVC2/MemberWrite.me
    	String contextPath= request.getContextPath();
    	// getcontextPath = contextPath를 구해주는 메소드 
    	// contextPath는 MVC2가 들어가게된다.
    	// Server에서 확인 가능 
    	String command=RequestURI.substring(contextPath.length());
    	//substring 문자열을 줄일 때 사용 
    	// 즉, MVC2 가 잘리고 MemberWrite.me만 command에 들어가게 된다.
    	
    	ActionForward forward=null;
    	Action action=null; // interface
    	
    	
    	/*System.out.println("RequestURI="+RequestURI);
    	System.out.println("contextPath="+contextPath);
    	System.out.println("command="+command);*/
    	// command의 문자열이 "/BoardWrite.me" 이면 
    	if(command.equals("/BoardWrite.me")) {
    		// mvc_member.jsp이 실행 되게 
    		forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_member.jsp");
    		// action이 없는 이유는 .jsp를 실행하기 위한 용도이므로 insert,delete등이 없으므로
    	}
    	
    	// command의 문자열이 "/BoardModify.me" 이면
    	else if(command.equals("/BoardModify.me")) {
    		// mvc_memberModify.jsp가 실행
    		/*action = new MemberCAction();*/
        	try {	
        		/*forward= action.execute(request, response);*/
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	
    		forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_memberModify.jsp");
    	}
    	
    	// command의 문자열이 "/BoardList.me" 이면
    	else if(command.equals( "/BoardList.me")) {
    		action = new MemberCAction();
    	try {
    		forward = action.execute(request, response);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    		// mvc_memberList.jsp가 실행
    		/*forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_memberList.jsp");*/
    	}
    	
    	// command의 문자열이 "/BoardDetail.me" 이면
    	else if(command.equals("/BoardDetail.me")) {
    		// mvc_memberDetail.jsp가 실행
    		forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_memberDetail.jsp");
    	}
    	
    	// command의 문자열이 "/BoardRemove.me" 이면
    	else if(command.equals("/BoardRemove.me")) {
    		action = new MemberdeleteAction();
        	try {	
        		forward= action.execute(request, response);
        		forward= new ActionForward();
        		forward.setRedirect(false);
        		forward.setPath("mvc_membermain.jsp");
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    		// mvc_memberRemove.jsp가 실행
    		forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_memberRemove.jsp");
    	}
    	else if(command.equals("/BoardRemove2.me")) {
    		action = new MemberdeleteAction();
        	try {	
        		forward= action.execute(request, response);
        		forward= new ActionForward();
        		forward.setRedirect(false);
        		forward.setPath("BoardList.me");
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	}
    	// form의 액션에 command를 활용하여 addaction 자바와 연동 
    	else if(command.equals("/MemberAddAction.me")) {
    		action = new MemberAddAction();
    		// action 으로 보냄 
    	try {	
    		forward= action.execute(request, response);
    		/*forward= new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("mvc_membermain.jsp");*/
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	}
    	else if(command.equals("/MemberMAction.me")) {
    		action = new MemberMAction();
        	try {	
        		forward= action.execute(request, response);
        		forward.setRedirect(false);
        		forward.setPath("BoardList.me");
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	}
    	else if(command.equals("/Login.me")) {
    		action = new LoginAction();
        	try {	
        		forward= action.execute(request, response);
        		
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
    	}
    	// dispatcher 를 이용해서 포워딩을 하게 된다. 
    	// forward redirect 구문 
    	if(forward!=null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dispatcher=request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    	
	}

					// method 방식이 get 이냐 post 냐에  따라  실행되는 메소드가 달라짐
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

}
