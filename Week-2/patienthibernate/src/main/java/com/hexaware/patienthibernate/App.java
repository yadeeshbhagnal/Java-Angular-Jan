package com.hexaware.patienthibernate;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.patienthibernate.config.AppConfig;
import com.hexaware.patienthibernate.service.IPatientService;
import com.hexaware.patienthibernate.service.PatientServiceImp;
import com.hexaware.patienthibernate.entity.Patient;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner scanner = new Scanner(System.in);
	
    public static void main( String[] args )
    {
        ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	IPatientService service = context.getBean(PatientServiceImp.class);
    	
    	boolean flag = true;
    	
    	while(flag)
    	{
    		System.out.println("*****WELCOME*****");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Select by name");
			System.out.println("4. Select all");
			System.out.println("5. Exit");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			
			case 1:
				Patient patient = readData();
				boolean isInserted = service.insertPatient(patient);
				
				if(isInserted)
				{
					System.out.println("Record inserted successfully !!");
				}
				else
				{
					System.err.println("Insert failed");
				}
				break;
				
			case 2:
				System.out.println("Enter patient id");
				int pid = scanner.nextInt();
				boolean isDeleted = service.deletePatient(pid);
				if(isDeleted)
				{
					System.out.println("Record deleted successfully !!");
				}
				else
				{
					System.err.println("delete failed");
				}
				break;
				
			case 3:
				System.out.println("Enter patient name ");
				String pname = scanner.nextLine();
				List <Patient>  list  =service.selectByName(pname);
				if(list != null)
				{
					for(Patient patient1: list)
					{
						System.out.println(patient1);
					}
				}
				break;
				
			case 4:
				List <Patient> list1 = service.selectAll();
				
				for(Patient patien:list1)
				{
					System.out.println(patien);
				}
				break;
				
			case 5:
				flag = false;
				break;
			}
    		
    	}
    }
    
    public static Patient readData()
    {
    	Patient patient= new Patient();
    	System.out.println("Enter patient id");
    	patient.setPatientId(scanner.nextInt());
    	scanner.nextLine();
    	
    	System.out.println("Enter patient name");
    	patient.setPatientName(scanner.nextLine());
    	
    	System.out.println("Enter patient age");
    	patient.setAge(scanner.nextInt());
    	scanner.nextLine();
    	
    	System.out.println("Enter date in YYYY-MM-DD format");
    	String inputDate= scanner.nextLine();
    	Date date = Date.valueOf(inputDate);
    	patient.setDate(date);
    	
    	System.out.println("Enter gender");
    	patient.setGender(scanner.nextLine());
    	
    	return patient;
    }
}
