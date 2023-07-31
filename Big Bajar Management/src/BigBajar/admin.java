package BigBajar;

public class admin {
	String name,password;
	admin(String name,String password){
		this.name=name;
		this.password=password;
	}
	String getname() {
		return name;
	}
	String getpassword() {
		return password;
	}
	void setname(String name) {
		this.name=name;
	}
	void setpassword(String password) {
		this.password=password;
	}
}
