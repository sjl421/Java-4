import java.util.*;


class Date
{
	int year = 1970;
	int month = 1;
	int day = 1;
	
}


class Account
{

	//数据域
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;//当前利率
	Date dateCreated;
	
	//构造方法
	Account()
	{
		
	}
	Account(int id,double balance)
	{
		this.id = id;
		this.balance = balance;
	}

	//访问器和修改器
	
	//访问器
	int getId()
	{
		return this.id;
	}
	
	double getBalance()
	{
		return this.balance;
	}
	double getAnnualInterestRate()
	{
		return this.annualInterestRate;
	}
	
	//修改器
	void setId(int id)
	{
		this.id = id;
	}
	void setBalance(double balance)
	{
		this.balance = balance;
	}
	void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	//返回月利率
	double getMonthlyInterest()
	{
		return this.annualInterestRate * 30;
	}
	
	//取款
	void withDraw(double money)
	{
		
		this.balance -= money;
	}
	//存款
	void deposit(double money)
	{
		
		this.balance += money;
	}
	
}




public class ex4 {

	public static void main(String[] args) {

		//初始化账户
		Account[] accounts = new  Account[11];
		for(int i = 0;i < accounts.length;i++)
		{
			accounts[i] = new Account(i,100);
		}
		
		Scanner input = new Scanner(System.in);
		//显示菜单
		while(true)
		{
			System.out.println("Enter a id");
			int id = input.nextInt();
			if(id < 0 || id > 9)
			{
				System.out.println("请输入正确的id");
				continue;
			}
			
			while(true)
			{
				System.out.println();
				System.out.println("Main menu");
				System.out.println("1.check balance");
				System.out.println("2.withdraw");
				System.out.println("3.deposit");
				System.out.println("4.exist");
				System.out.println("Enter a choice");
				
				int choice = input.nextInt();
				if(choice == 4)
				{
					break;
				}
				Choice(choice,accounts[id]);
			}
		}
		
		
	}
	
	public static void Choice(int choice,Account account)
	{
		Scanner input = new Scanner(System.in);
		switch(choice)
		{
		case 1:
			System.out.println("The balance is " + account.getBalance());
			break;
		case 2:
			System.out.println("Enter a amount to withdraw");
			account.withDraw(input.nextDouble());
			break;
		case 3:
			System.out.println("Enter a amount to deposit");
			account.deposit(input.nextDouble());
			break;
		default:
			break;
		}
		
		
	}
	

}
