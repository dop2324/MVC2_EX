package member;
//Action 인터페이스에서 명령을 수행하고 결과 값을 가지고 페이지를
// 포워딩할 때 사용되는 클래스.
public class ActionForward {
		private boolean isRedirect=false;
		private String path=null;
		
		
		public boolean isRedirect() {
			return isRedirect;
		}
		public void setRedirect(boolean isRedirect) {
			this.isRedirect = isRedirect;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
}
