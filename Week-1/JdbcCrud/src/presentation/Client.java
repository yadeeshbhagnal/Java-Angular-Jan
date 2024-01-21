package presentation;

import entity.Department;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;

public class Client {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		IDeptDao dao = new DeptDaoImp();
		
		boolean flag= true;
		
		while(flag)
		{
			System.out.println("*****WELCOME*****");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select by id");
			System.out.println("5. Select all");
			System.out.println("6. Exit");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				Department dept = readData();
				dao.insertDept(dept);
				break;
			
			case 2:
				Department dept1 = readData();
				dao.updateDept(dept1);
				break;
				
			case 3:
				System.out.println("Enter dept no. ");
				int dno = scanner.nextInt();
				dao.deleteOneDept(dno);
				break;
				
			case 4:
				System.out.println("Enter dept no.");
				int dno1 = scanner.nextInt();
				dao.selectOneDept(dno1);
	
				
				break;
			
			case 5:
				List<Department> list = dao.selectAllDept();
				/*
				 * for (Department department : list) { System.out.println(department);
				 *  //using for each loop }
				 */
				
				list.stream().forEach(System.out::println); // printing using stream api
				break;
			case 6:
				flag=false;
				break;
			default:
				break;
			}
		}
				

	}
	
	public static Department readData()
	{
		System.out.println("Enter Dept no.");
		int dno = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter Dept name");
		String dname = scanner.nextLine();
		
		System.out.println("Enter Location");
		String location = scanner.nextLine();
		
		Department dept = new Department(dno,dname,location);
		
		return dept;
	}

}
