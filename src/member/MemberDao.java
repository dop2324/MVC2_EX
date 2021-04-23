package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao { 
	//DBBean 역할을 하는 Dao 
	// DB와 연결을 하는 클래스
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemberDao(){ // 초기화를 위한 생성자
		
		
		try{
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/mysql");
			con=ds.getConnection();
			
		}catch(Exception e){
			System.out.println("DB 연결실패"+e);
			e.printStackTrace();
			return;
		}
		
	}// 생성자 끝
	
	// 메소드 생성
	//insert 회원가입
	public void insertM(MemberBean MData) throws Exception {
		try{ 
		String sql ="";
		
			sql = "insert into member values (?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql); // mysql workbench의 컨트롤 엔터랑 같은 기능을 한다.
			
			// 물음표 값 추가 (순서에 따라)
			//1. id
			pstmt.setString(1, MData.getId());
			//2. password
			pstmt.setString(2, MData.getPassword());
			//3. name
			pstmt.setString(3, MData.getName());
			//4. birth
			pstmt.setString(4, MData.getBirth());
			//5. email
			pstmt.setString(5, MData.getEmail());
			//6. age
			pstmt.setInt(6, MData.getAge());
			//7. phone
			pstmt.setString(7, MData.getPhone());
			
		// values 값에 사용자가 입력한 값을 넣을려면 ? 를 넣으면 된다.
			
		// 대신에 ? 에 대한 값들을 명시해 주어야 한다.
			pstmt.executeUpdate();
			
			//executeUpdate(getConncetion(prepareStatement(sql)))
			//sql문장 중에서 insert, update, delete를 쓸 때 (executeUpdate())
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) con.close();
			if(pstmt!=null) pstmt.close();
		}
	}
	//update 회원정보 수정
	public void memberModify(MemberBean mdata) throws Exception{
		
		try {
			
			String sql ="";
			// sql 문장을 입력하기 전에 workbench 를 통해서 
			//입력해보고 잘 작동하는 것을 확인한 후에 sql 문장을 입력하자!  
			sql = "update member";
			sql+=" set password=?,";
			sql+="name=?,phone=?";
			sql+=" where id=?";
			pstmt=con.prepareStatement(sql); 	
			// 물음표 값 추가 (순서에 따라)
						
						pstmt.setString(1, mdata.getPassword());
						
						pstmt.setString(2, mdata.getName());
						
						pstmt.setString(3, mdata.getPhone());
						
						pstmt.setString(4, mdata.getId());
						
					// values 값에 사용자가 입력한 값을 넣을려면 ? 를 넣으면 된다.
						
					// 대신에 ? 에 대한 값들을 명시해 주어야 한다.
						pstmt.executeUpdate();
						
						//executeUpdate(getConncetion(prepareStatement(sql)))
						//sql문장 중에서 insert, update, delete를 쓸 때 (executeUpdate())
						
						
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						if(con!=null) con.close();
						if(pstmt!=null) pstmt.close();
					}
	}
	
	//delete 회원탈퇴
	//delete 구문
		public void memberRemove(MemberBean mdata) throws Exception{
			
			try {
				 //getConncetion이라는 메소드를 변수에 저장 해야 한다. 이 메소드의 .prepareStatement ->  ctrl 엔터와 같은 역할 을 한다.
				String sql ="";
				
				sql = "delete from member where id=?";
				pstmt=con.prepareStatement(sql); 	
				// 물음표 값 추가 (순서에 따라)
							
							
							
							pstmt.setString(1, mdata.getId());
							
						// values 값에 사용자가 입력한 값을 넣을려면 ? 를 넣으면 된다.
							
						// 대신에 ? 에 대한 값들을 명시해 주어야 한다.
							pstmt.executeUpdate();
							
							//executeUpdate(getConncetion(prepareStatement(sql)))
							//sql문장 중에서 insert, update, delete를 쓸 때 (executeUpdate())
							
							
							
						}catch(Exception e) {
							e.printStackTrace();
						}finally {
							if(con!=null) con.close();
							if(pstmt!=null) pstmt.close();
						}
		}
	//select 회원정보리스트
	
	public ArrayList <MemberBean> memberlist() throws Exception{
		ArrayList <MemberBean> mlist = new ArrayList();

		try {
			
			
			String sql ="";
			
				sql = "select * from member";
				pstmt=con.prepareStatement(sql);
				// sql문장 중에서 select를 쓸 때 (executeQuery())
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //next = rs의 위치가 배열의 끝까지 반복 데이터가 있으면 true
				MemberBean mbean = new MemberBean();
				mbean.setId(rs.getString("id"));
				mbean.setPassword("알려줄수없음");
				mbean.setBirth(rs.getString("birth"));
				mbean.setEmail(rs.getString("email"));
				mbean.setName(rs.getString("name"));
				mbean.setAge(rs.getInt("age"));
				mbean.setPhone(rs.getString("phone"));
				
				
				mlist.add(mbean); // 이것을 통해서 자동적으로 계속 해서 추가가 된다.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) con.close();
			if(pstmt!=null) pstmt.close();
			if(rs!=null) rs.close();
		}
		return mlist;
	}
	// login
	public void Login (MemberBean mdata) throws Exception{
		
		try {
			 //getConncetion이라는 메소드를 변수에 저장 해야 한다. 이 메소드의 .prepareStatement ->  ctrl 엔터와 같은 역할 을 한다.
			String sql ="";
			String dbPW ="";
			sql = "select password from member where id=?";
			pstmt=con.prepareStatement(sql); 	
			// 물음표 값 추가 (순서에 따라)
			//MemberBean mbean = new MemberBean();
			pstmt.setString(1, mdata.getId());
			rs=pstmt.executeQuery();
			
						
			
			if(rs.next()) {
				dbPW = rs.getString("password");
				
				if(dbPW.equals(mdata.getPassword())) {
					System.out.print("로그인 성공");
				}else {
					System.out.print("로그인 실패");
				}
			}
						pstmt.executeUpdate();
					
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						if(con!=null) con.close();
						if(pstmt!=null) pstmt.close();
					}
	}
	

	
	//select 회원정보상세내용
	public MemberBean memberinfo(String id) throws Exception{ // 이때 sql로 전송이 된다.
		
		MemberBean mdata = null; // 준게 없어서 null
		
	try {
		
		String sql ="";
			sql = "select * from member where id=?"; //id 조건이니깐 id만 가지고 오면 된다 !!! 
			pstmt=con.prepareStatement(sql);
			// sql문장 중에서 select를 쓸 때 (executeQuery())
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				mdata= new MemberBean();
				mdata.setId(rs.getString("id"));
				mdata.setPassword(rs.getString("password"));
				mdata.setName(rs.getString("name"));
				mdata.setBirth(rs.getString("birth"));
				mdata.setEmail(rs.getString("email"));
				mdata.setPhone(rs.getString("phone"));
				
			}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(con!=null) con.close();
		if(pstmt!=null) pstmt.close();
		if(rs!=null) rs.close();
	}
		
		
		return mdata;
	}
}

