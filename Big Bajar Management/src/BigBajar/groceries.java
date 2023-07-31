package BigBajar;

public class groceries {
		int grosid,grprice;
		String grosname;
		groceries(int grosid,String grosname,int grprice){
			this.grosid=grosid;
			this.grosname=grosname;
			this.grprice=grprice;
		}
		int getgrosid() {
			return grosid;
		}
		int getgrprice() {
			return grprice;
		}
		String getgrosname() {
			return grosname;
		}
		void setgrosid(int grosid) {
			this.grosid=grosid;
		}
		void setgrosname(String grosname) {
			this.grosname=grosname;
		}
	}
