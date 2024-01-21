package sync;

public class Admission implements Runnable {

	int seats  =1;
	
	public static void main(String[] args)
	{
		Runnable admission = new Admission();
		
		Thread t1 = new Thread(admission, "yadeesh");
		Thread t2 = new Thread(admission, "harish");
		
		t1.start();
		t2.start();
		
		
	}

	@Override
	public synchronized void run() {
		System.out.println("no. of seats before: "+seats);
		
		
		if(seats>0)
		{
			System.out.println("Seat allocated to " +Thread.currentThread().getName());
			seats = seats-1;
		}
		else {
			System.out.println("Sorry try next year");
		}
		System.out.println("no. of seats left after "+seats);
		
	}
	
}
