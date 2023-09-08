package MainClass;

import java.util.ArrayList;
import java.util.Scanner;
import MainClass.Admin;
import MainClass.Student;

public class HostelManagement {

	public static void main(String[] args) {
		int stid,ch,rmno,ch1;
		String stname;
		String Name="ram";
		String Password="108";
		
		ArrayList<Admin> ad=new ArrayList<Admin>();
		ArrayList<Student> st=new ArrayList<Student>();
		
		
		for(;;) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your choice :");
			System.out.println("\n1.Admin\n2.Student\n3.Exit");
			
			
			try {
				
			ch=s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Admin Name :");
				Name=s.next();
				System.out.println("Enter the Admin Password :");
				Password=s.next();
				if(Name.equals("ram")&&Password.equals("108")) {
					System.out.println("Authentication Successful!");
				
				
				System.out.println("Enter choice");
				System.out.println("\n1.Add Student\n2.Remove Student\n3.View list\n4.Exit");
				
				try {
					
				
				ch1=s.nextInt();
				while(ch1!=0) {
				switch(ch1) {
				case 1:
					System.out.println("Enter the Student id :");
					stid=s.nextInt();
					System.out.println("Enter the student name :");
					stname=s.next();
					System.out.println("Enter the student room number :");
					rmno=s.nextInt();
					Student std=new Student(stid,rmno,stname);
					st.add(std);
					break;
				case 2:
					int flag=0;
					System.out.println("Remove Student");
					stid=s.nextInt();
					for(int i=0;i<st.size();i++) {
						if(stid==st.get(i).stid) {
					st.remove(i);
					System.out.println("Student is removed!");
					flag=1;
					}
						}
					if(flag==0) {
						System.out.println("Invalid student id! ");
					}
					break;
				case 3:
					for(int i=0;i<st.size();i++) {
					System.out.println(st.get(i).stid+" "+st.get(i).stname+" "+st.get(i).rmno);
					}
					break;
				case 4:
					System.out.println("Thank you");
				}
				System.out.println("Enter choice");
				System.out.println("\n1.Add Student\n2.Remove Student\n3.View list\n4.Exit");
				ch1=s.nextInt();
				}
				}
				catch(Exception e) {
					System.out.println("Please enter a valid input!!!!.........."+e);
				}
				}
				else {
					System.out.println("Authentication failed !");
				}
				break;
			case 2:
				System.out.println("Student list :");
				for(int i=0;i<st.size();i++) {
					System.out.println(st.get(i).stid+" "+st.get(i).stname+" "+st.get(i).rmno);
					}
				break;
			case 3:
				System.exit(0);
			}
		}
		catch(Exception e) {
			System.out.println("Please enter a valid input!!!!.........."+e);
			
		
	}

}
}
}