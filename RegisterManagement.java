package FullStack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class RegisterManagement {
private static String yes;


public static void main(String arg[]) throws Exception  {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Sowmiya23");
	Statement st=con.createStatement();
	
	
	Scanner sc=new Scanner(System.in);
	System.err.println("          ______________________________________________________________");
	System.out.println("\n          \"WELCOME TO REGISTRATION PAGE OF SRN COLLEGE OF ENGINEERING\"");
	System.err.println("          ______________________________________________________________");
	System.out.println("\n1 . USER                            2 . ADMIN");
	int choose = sc.nextInt();
	if(choose==1) {
	System.out.println("\nCheck Details of the department according to your percentage");
	System.err.println("(DEPARTMENT AVALIABLE ACCORDING TO YOUR PERCENTAGE)");
	System.out.println("\nENTER YOUR 12th PERCENTAGE:");
	
	int pr=sc.nextInt();
	System.out.println("_____________");
//	System.err.println("DEPARTMENT AVALIABLE TO YOUR PERCENTAGE");
	if(pr>=90 && pr<=100) {
		System.out.println("Department:Computer Science and Engineering");
		System.out.println("Fees Structure:90,000");
		System.out.println("Timing:10.00am to 3.00pm");
	}
	else if(pr>=80 && pr<=90) {
		System.out.println("Department:Marine Engineering");
		System.out.println("Fees Structure:1,00,000");
		System.out.println("Timing:9.00am to 3.00pm");
	
	}
	else if(pr>=70 && pr<=80) {
		System.out.println("Department:Environmental Engineering");
		System.out.println("Fees Structure:80,000");
		System.out.println("Timing:11.00am to 4.00pm");
	
	}
	else if(pr>=60 && pr<=70) {
		System.out.println("Department:Automotive Engineering");
		System.out.println("Fees Structure:70,000");
		System.out.println("Timing:9.00am to 3.00pm");
	
	}
	else if(pr>=50 && pr<=60) {
		System.out.println("Department:Electronic engineering");
		System.out.println("Fees Structure:90,000");
		System.out.println("Timing:10.00am to 3.00pm");
	
	}
	else {
		System.out.println("You are out of our eligible criteria and not eligible for registration process");
	}
	String str="yes";
	System.out.println("\nIf you want continue your registration process(YES or NO)");
	String y=sc.next();
	System.out.println("_____________");
//	String str="yes";
	if(str.equals(y)) {
		   System.out.print("Your registration form is on processing...");
		   for(int k=1;k<=10;k++) {
			   System.out.print(".");
			   Thread.sleep(1000);
		   }
//		   System.err.println("\n          _________________________________");
			System.err.println("\n          \"WELCOME TO REGISTRATION FORM\"");
//			System.err.println(" \n         _________________________________");
			
			System.out.println("ENTER THE FIRSTNAME:");
			String name=sc.next();
			System.out.println("ENTER THE LASTNAME:");
			String name2=sc.next();
			System.out.println("ENTER THE AGE:");
			int age=sc.nextInt();
			System.out.println("ENTER THE DOB:");
			String dob=sc.next();
			System.out.println("ENTER THE ADDRESS");
			String add=sc.nextLine();
			System.out.println("DOORNO:");
			String doorno=sc.nextLine();
			System.out.println("NAGAR");
			String nagar=sc.nextLine();
			System.out.println("LOCATION");
			String location=sc.nextLine();
			System.out.println("ENTER YOUR EMAIL-ID:");
			String email=sc.nextLine();
			System.out.println("ENTER YOUR NUMBER:");
			Long num=sc.nextLong();
			System.out.println("ENTER ALTERNATE NUMBER");
			 long almono=sc.nextLong();
			 System.out.println(("ENTER YOUR 10TH PERCENTAGE"));
			 int pi=sc. nextInt();
			 System.out.println(("ENTER YOUR 12TH PERCENTAGE"));
			 int pi2=sc. nextInt();
//			 String use="insert into student(name,name2,age,dob,doorno,nagar,location,email,num,almono,pi,pi2)value('"+name+"','"+name2+"','"+age+"','"+dob+"','"+doorno+"','"+nagar+"','"+location+"','"+email+"','"+num+"','"+almono+"','"+pi+"','"+pi2+"')";
//			   int i=st.executeUpdate(use);
			 if(pi2==pr) {
				 System.out.println("FIRSTNAME:"+name);
				 System.out.println("LASTNAME:"+name2);
				 System.out.println("AGE:"+age);
				 System.out.println("DOB:"+dob);
				 System.out.println("DOORNO:"+doorno);
				 System.out.println("NAGAR:"+nagar);
				 System.out.println("LOCATION:"+location);
				 System.out.println("EMAIL-ID:"+email);
				 System.out.println("MOBILENUMBER:"+num);
				 System.out.println("ALTER MOBILENUMBER:"+almono);
				 System.out.println("10th PERCENTAGE"+pi);
				 System.out.println("12th PERCENTAGE"+pi2);
//				 System.err.println("\n             _______________________________");
					System.err.println("           \"REGISTERED SUCCESSFULLY\"");
//					System.err.println(" \n         ______________________________");
			 }
			 String use="insert into student(name,name2,age,dob,doorno,nagar,location,email,num,almono,pi,pi2)value('"+name+"','"+name2+"','"+age+"','"+dob+"','"+doorno+"','"+nagar+"','"+location+"','"+email+"','"+num+"','"+almono+"','"+pi+"','"+pi2+"')";
			 int i=st.executeUpdate(use);
	}
	
	
	else {
		System.out.println("Thank You");
	}
	}
	Scanner sc2=new Scanner(System.in);
	 if(choose == 2) {
		 
		System.out.println("USER NAME :");
		String userna=sc.next();
		String check="1234";
		System.out.println("PASSWORD  :");
		String pass=sc.next();
		System.out.println("______________");
		
		if (pass.equals(check)) {
			System.out.println("                  CHOOSE YOUR PERFORMANCE\n");
			System.out.println("1 . SELECT PERSON                    2 . ALL DETAILS");
			System.out.println("3 . BLOCK PERSON                     4 . UPDATE PERSON");
			int ch=sc.nextInt();
			System.out.println("_____________\n");
			
			switch(ch) {
			case 1:{
			
				System.out.println("ENTER YOUR FIRST NAME :");
				String fname=sc.next();
//				ResultSet rs=st.executeQuery("Select * From customer where name='"+fname+"'");
//				System.out.println("ENTER YOUR LAST NAME:");
//				String lname=sc.next();
				ResultSet rs=st.executeQuery("Select * From student where name='"+fname+"'");
//				 rs=st.executeQuery("Select * From student where name='"+lname+"'");
				while(rs.next()) {
					String pri = rs.getString(2);
//					String pri1 = rs.getString(3);
					if(fname.equalsIgnoreCase(pri)) {
//					 if(lname.equalsIgnoreCase(pri1))
//					{
					   System.out.println("ID :"+rs.getInt(1)+"\t"+" FIRST NAME :"+rs.getString(2)+"\t"+" LAST NAME :"+rs.getString(3)+"\t"+"AGE :"+rs.getInt(4)+"\t"+" DOB :"+rs.getString(5)+"\t"+"DOOR NO :"+rs.getString(6)+"\t"+"NAGAR :"+rs.getString(7)+"\t"+"LOCATION :"+rs.getString(8)+"\t"+"EMAIL-ID :"+rs.getString(9)+"\t"+"NUMBER :"+rs.getLong(10)+"\t"+"ALTER NO :"+rs.getLong(11)+"\t"+"10th PERCENTAGE :"+rs.getString(12)+"\t"+"12th PERCENTAGE :"+rs.getString(13));
					}else {
						System.out.println("Result Couldnt Found");
					}
//					}
				}
			break;
			
			}
			case 2:{
				String rs1="select * from student";
				ResultSet rs=st.executeQuery(rs1);
				while(rs.next()) {
					System.out.println("ID :"+rs.getInt(1)+"\t"+" FIRST NAME :"+rs.getString(2)+"\t"+" LAST NAME :"+rs.getString(3)+"\t"+"AGE :"+rs.getInt(4)+"\t"+" DOB :"+rs.getString(5)+"\t"+"DOOR NO :"+rs.getString(6)+"\t"+"NAGAR :"+rs.getString(7)+"\t"+"LOCATION :"+rs.getString(8)+"\t"+"EMAIL-ID :"+rs.getString(9)+"\t"+"NUMBER :"+rs.getLong(10)+"\t"+"ALTER NO :"+rs.getLong(11)+"\t"+"10th PERCENTAGE :"+rs.getString(12)+"\t"+"12th PERCENTAGE :"+rs.getString(13));
					}
			
				System.out.println("");
				
				break;
			}
			case 3:{

				
				System.out.println("Enter The Name :");
				String namee=sc2.nextLine();
				ResultSet rs=st.executeQuery("Select * From student where name='"+namee+"'");
				while(rs.next()) {
					String pri = rs.getString(2);
					if(namee.equalsIgnoreCase(pri)) {
						System.out.println("ID :"+rs.getInt(1)+"\t"+" FIRST NAME :"+rs.getString(2)+"\t"+" LAST NAME :"+rs.getString(3)+"\t"+"AGE :"+rs.getInt(4)+"\t"+" DOB :"+rs.getString(5)+"\t"+"DOOR NO :"+rs.getString(6)+"\t"+"NAGAR :"+rs.getString(7)+"\t"+"LOCATION :"+rs.getString(8)+"\t"+"EMAIL-ID :"+rs.getString(9)+"\t"+"NUMBER :"+rs.getLong(10)+"\t"+"ALTER NO :"+rs.getLong(11)+"\t"+"10th PERCENTAGE :"+rs.getString(12)+"\t"+"12th PERCENTAGE :"+rs.getString(13));
					}else {
						System.out.println("Result Couldnt Found");
					}
					}
			break;
			
			
			}
			case 4:{
				
				break;
			}
			}
			System.out.println("_____________");
			System.out.println("GO TO USER PAGE.......");
			
			
		}
		
		else {
			System.err.println("INVALID DATA");
			System.out.println("GO TO USER PAGE.......");
		}

	
	
	
	
	
}
}
}