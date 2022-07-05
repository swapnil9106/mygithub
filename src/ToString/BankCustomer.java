package ToString;

public class BankCustomer {
	int accountNumber;
	String customerName;
	double balance;
	
	BankCustomer(int accountNumber,String customerName,double balanc)
	{
		this.accountNumber= accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}
	public String toString()
	{
		return accountNumber+" "+customerName+ " "+balance;
	}
	public static void main(String[] args) {
		BankCustomer bank=new BankCustomer(102,"JAY",10098.67);
		System.out.println(bank.toString());
	}
	

}
