package inheritance;

public class Child extends Parent {
	int cid = 99;
	
	public Child()
	{
		super();
		System.out.println("Child object is created");
	}
	public Child(int cid)
	{
		this.cid=cid;
		System.out.println();
	}
	public void m2()
	{
		System.out.println("m2() called from child class...");
	}
	
	@Override
	public void m1()    // method overriding
	{
		System.out.println("m1() from child class");
	}
	
	@Override
	public String toString()
	{
		return "Child object present here";
	}
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c); //hashcode of object
		Child c2 = new Child(101);
		System.out.println(c2.cid);
		//Parent p = new Parent();
		Parent p = new Child();   //calls child class object
	}
}
