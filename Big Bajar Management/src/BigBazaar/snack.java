package BigBazaar;

public class snack {
		int snid,snprice;
		String snname;
		snack(int snid,String snname,int snprice){
			this.snid=snid;
			this.snname=snname;
			this.snprice=snprice;
		}
		int getsnid() {
			return snid;
		}
		int getsnprice() {
			return snprice;
		}
		String getsnname() {
			return snname;
		}
		void setsnid(int snid) {
			this.snid=snid;
		}
		void setsnprice(int snprice) {
			this.snprice=snprice;
		}
		void setsnname(String snname) {
			this.snname=snname;
		}
	}

