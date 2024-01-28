package com.hexaware.patientjdbc;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.patientjdbc.config.AppConfig;
import com.hexaware.patientjdbc.entity.Patient;
import com.hexaware.patientjdbc.service.IPatientService;
import com.hexaware.patientjdbc.service.PatientServiceImp;



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
			System.out.println("2. Select by name");
			System.out.println("3. Select all");
			System.out.println("4. Exit");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			
			case 1:
				
				Patient patient  =readData();
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
				System.out.println("Enter patient name ");
				String pname = scanner.nextLine();
				List <Patient> list1 = service.selectByName(pname);
				if(list1 != null)
				{
					for(Patient patient1: list1)
					{
						System.out.println(patient1);
					}
				}
				break;
				
			case 3:
				List <Patient> list = service.SelectAllPatient();
				
				for(Patient patien:list)
				{
					System.out.println(patien);
				}
				break;
				
			case 4:
				flag =false;
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
