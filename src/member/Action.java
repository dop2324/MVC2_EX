package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//인터페이스는 공통적인 것을 모아서 추상메소드를 만든다.
// Action인터페이스 : 특정 비즈니스로직(사용자 요청)을 수행하고 결과를
// ActionForward 타입으로 반환하는(execute)메소드가 정의되어있다.
public interface Action {
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception;
}
