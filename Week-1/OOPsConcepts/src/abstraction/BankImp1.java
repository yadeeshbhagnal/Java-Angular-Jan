package abstraction;

public abstract class BankImp1 implements IBank {

	@Override
	public void deposit() {
		System.out.println("deposit successful...");
		
	}
	public abstract void withdraw();
}
