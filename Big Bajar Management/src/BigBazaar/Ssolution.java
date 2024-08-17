
package BigBazaar;
import java.util.*;
import java.util.Scanner;
import BigBazaar.admin;
import BigBazaar.customer;
import BigBazaar.groceries;
import BigBazaar.snack;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Initializing variables
		int ch,n,ch1,sum=0;
		String fr,sn;
		String name="ram";
		String password="108";

		
		
		// Declaring Array Lists
		ArrayList<admin> ad=new ArrayList<admin>();
		ArrayList<Integer> cus=new ArrayList<Integer>();
		ArrayList<groceries> gros=new ArrayList<groceries>();
		ArrayList<snax> snx=new ArrayList<snax>();
		
		
		
		// Creating an infinite Loop
		for(;;) {
//			using scanner
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your choice :");
			System.out.println("\n1.Admin\n2.Customer\n3.Exit");
			
			
			try {
                ch = s.nextInt();
                
                
//			using switch statement     
			switch(ch) {
			
//		    Admin login
			case 1:
				System.out.println("Admin Login");
			System.out.println("Admin Name :");
			name=s.next();
			System.out.println("Admin Password :");
			password=s.next();
			
//			Validating admin name and password
			if(name.equals("ram") && password.equals("108")) {
			System.out.println("Authentication Successful");
			
			System.out.println("Enter the choice :");
			System.out.println("\n1.Add fruits/vegitable\n2.Add snacks\n3.Enter 0 to Exit");
			
			try {
			ch1=s.nextInt();
			
			
			while(ch1!=0) {
			switch(ch1) {
//			Different cases for Admin inputs
//			case 1 for taking groceries inputs
			case 1:
				int grosid,grprice;
			String grosname;
				System.out.println("Add fruits/vegitables :");
			System.out.println("Enter the groceries id :");
			grosid=s.nextInt();
			System.out.println("Enter the gros name :");
			grosname=s.next();
			System.out.println("Enter the price for the items :");
			grprice=s.nextInt();
			groceries gr=new groceries(grosid,grosname,grprice);
			gros.add(gr);
			System.out.println(gr.getgrosid()+" "+gr.getgrosname()+" "+gr.getgrprice());
			break;
			
			
//			case 2 for taking snacks inputs
			case 2:
				int snid,snprice;
			String snname;
				System.out.println("Add snacks");
			System.out.println("Enter the snax id :");
			snid=s.nextInt();
				System.out.println("Add snacks name :");
			snname=s.next();
			System.out.println("Enter the price of snax :");
			snprice=s.nextInt();
			snax sna=new snax(snid,snname,snprice);
			snx.add(sna);
			System.out.println(sna.getsnid()+" "+sna.getsnname()+" "+sna.getsnprice());
			}
			System.out.println("Enter the choice :");
			System.out.println("\n1.add fruits/vegitable\n2.add snacks\n3.Enter 0 to Exit");
			ch1=s.nextInt();
			}
			}
			catch(Exception e) {
				System.out.println("Please enter a valid input!!!!.........."+e);
			}
			}
			else {
				throw new IllegalArgumentException("\n Authentication Failed");
			}
				break;
				
				
//				this case for printing Groceries list and snacks
			case 2:
				int cusid;
			System.out.println("List of groceries :");
			
			for(int i=0;i<gros.size();i++) {
				System.out.println(gros.get(i).grosid+" "+gros.get(i).grosname+" "+gros.get(i).grprice);
			}
			System.out.println("List of snax :");
			for(int i=0;i<snx.size();i++) {
				System.out.println(snx.get(i).snid+" "+snx.get(i).snname+" "+snx.get(i).snprice);
			}
			
//			infinite loop for calculating sum of items
			for(;;) {
			System.out.println("Enter the item id or press 0 to exit :");
			cusid=s.nextInt();
			if(cusid==0) {
			     System.out.println("Thank you for visiting :");
			     break;  
			}
			else
			cus.add(cusid);
			}
//			calculating sum of items
			for(int i=0;i<cus.size();i++) {
				int flag=0;
				for(int j=0;j<gros.size();j++) {
				if(cus.get(i)==gros.get(j).grosid) {
					sum=sum+gros.get(j).grprice;
					flag=1;
				}
			}
					for(int j=0;j<snx.size();j++) {
					if(cus.get(i)==snx.get(j).snid) {
						sum=sum+snx.get(j).snprice;
						flag=1;
					}
					}
					if(flag!=1) {
						System.out.println("Following item in not in the list"+cus.get(i));
					}
			}
			System.out.println("Total price :"+sum);
			
			
//			Case 3 for exiting the infinite loop
			case 3:
				System.exit(0);
				
				
			default:System.out.println("Enter the valid choice!!!");
			}
		}
		catch(Exception e) {
			System.out.println("Please enter a valid input!!!!.........."+e);
			
		}
		}
	}
}
