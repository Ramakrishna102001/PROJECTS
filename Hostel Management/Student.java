package MainClass;

public class Student {
	int stid,rmno;
	String stname;
	Student(int stid,int rmno,String stname){
		this.stid=stid;
		this.rmno=rmno;
		this.stname=stname;
	}
	int getstid() {
		return stid;
	}
	int getrmno() {
		return rmno;
	}
	String getstname() {
		return stname;
	}
	void setstid(int stid) {
		this.stid=stid;
	}
	void setrmno(int rmno) {
		this.rmno=rmno;
	}
	void setstname(String stname) {
		this.stname=stname;
	}
}
