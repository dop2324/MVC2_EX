package member;

//이 자바 클래스를 모델이라고 부른다.
public class MemberBean {    
	private String id;
	private String password;
	private String name;
	private String birth;
	private String email;
	private int age;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//확인을 하기 위한 source에서 toString()
	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", email="
				+ email + ", age=" + age + ", phone=" + phone + "]";
	}

	
	
}
