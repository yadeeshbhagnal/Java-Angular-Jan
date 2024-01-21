package multithread;

public class MyMultiThread extends Thread {

	public static void main(String[] args) {
		
		MyMultiThread t1 = new MyMultiThread();
		t1.setPriority(MAX_PRIORITY);
		t1.setName("Child 1");
		System.out.println(t1);
		
		MyMultiThread t2 = new MyMultiThread();
		t2.setPriority(8);
		t2.setName("Child 2");
		System.out.println(t2);
		
		t1.start();
		t2.start();
	}
	
	
		public void run() {
			
			for(int i =0;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		}
	

}
