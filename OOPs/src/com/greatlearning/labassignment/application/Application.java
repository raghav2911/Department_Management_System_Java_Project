package com.greatlearning.labassignment.application;
import java.util.*;
import com.greatlearning.labassignment.model.Employee;
import com.greatlearning.labassignment.service.CredentialService;

public class Application {
	
	public static void main (String[]arg) {
		
		Employee emp = new Employee ("Raghav", "Verma");
		CredentialService cs= new CredentialService();
		String generatedEmail;
		char[] generatedpassword;
		
		System.out.println("print enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		
		int  input = sc.nextInt();
		
		switch(input){
			
			case 1:{
				generatedEmail= cs.generateEmailAddress(emp.getFirstName(),emp.getLastName() ,"tech");
			generatedpassword = cs.generatePassword();
			cs.showCredentials(emp,generatedEmail,generatedpassword);
			break;
		}
		
			case 2: {
				generatedEmail= cs.generateEmailAddress(emp.getFirstName(),emp.getLastName() ,"Adm");
				generatedpassword = cs.generatePassword();
				cs.showCredentials(emp,generatedEmail,generatedpassword);
				break;
				
			}
			case 3: {
				generatedEmail= cs.generateEmailAddress(emp.getFirstName(),emp.getLastName() ,"HR");
				generatedpassword = cs.generatePassword();
				cs.showCredentials(emp,generatedEmail,generatedpassword);
				break;
			}
			case 4: {
				generatedEmail= cs.generateEmailAddress(emp.getFirstName(),emp.getLastName() ,"Legal");
				generatedpassword = cs.generatePassword();
				cs.showCredentials(emp,generatedEmail,generatedpassword);
				break;
				
			}
			
					
			
				
			
		}
		
		
		
		
		
		
		
	}


}
