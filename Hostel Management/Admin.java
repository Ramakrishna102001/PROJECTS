package MainClass;

public class Admin {
 String Name,Password;
 Admin(String Name,String Password){
	 this.Name=Name;
	 this.Password=Password;
 }
 String getName() {
	 return Name;
 }
 String getPassword() {
	 return Password;
 }
 void setName(String Name) {
	 this.Name=Name;
 }
 void setPassword(String Password) {
	 this.Password=Password;
 }
}
