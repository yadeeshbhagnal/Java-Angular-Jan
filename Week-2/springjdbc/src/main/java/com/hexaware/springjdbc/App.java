package com.hexaware.springjdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.entity.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

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
    	
    	IProductService service =  context.getBean(ProductServiceImp.class);
    	
        boolean flag = true;
        
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
				
				Product product  =readData();
				boolean isInserted = service.createProduct(product);
				
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
				Product product1 = readData();
				boolean isUpdated = service.updateProduct(product1);
				if(isUpdated)
				{
					System.out.println("Record updated successfully !!");
				}
				else
				{
					System.err.println("update failed");
				}
				
			case 3:
				//boolean isDeleted = service.deleteProductById(choice)
				
			case 4:
				System.out.println("Enter product id");
				int pid1 = scanner.nextInt();
				Product selectProduct = service.selectProductById(pid1);
				if(selectProduct != null)
				{
					System.out.println(selectProduct);
				}
				else
				{
					//throw excep.
					
				}
				break;
			case 6:
				flag =false;
				break;
			
			}
       }
     }
    
    public static Product readData()
    {
    	Product product= new Product();
    	System.out.println("Enter product id");
    	product.setProductId(scanner.nextInt());
    	scanner.nextLine();
    	
    	System.out.println("Enter product name");
    	product.setProductName(scanner.nextLine());
    	
    	System.out.println("Enter product price");
    	product.setPrice(scanner.nextDouble());
    	
    	return product;
    }
}