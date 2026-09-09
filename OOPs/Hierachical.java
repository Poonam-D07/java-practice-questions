class Account{
	
	int accNum;
	double balance;
	Account(int accNum, double balance){
		this.accNum = accNum;
		this.balance = balance;
		
	}
	void deposit(double amount){
		
		balance = balance+amount;
		System.out.println("Deposit : " + amount);
	}
      void showBalance(){
		  System.out.println("Balance : " +balance);
	  }	
}
class SavingAcc extends Account{
	
	double interestRate = 5.0;
	SavingAcc(int accNO, double bal){
		
		super(accNO, bal);
	}
	void addInterest(){
		
		double interest = (balance*interestRate)/100;
		balance = balance+interest;
	     System.out.println("Interest added : " +interest);

	}
}
class CurrentAcc extends Account{
	double overdraftLimit = 100000;
	CurrentAcc(int accNO, double bal){
		super(accNO, bal);
	}
	void withdraw(double amount){
		if(balance+overdraftLimit>=amount){
			
			balance = balance-amount;
			 System.out.println("Withdrewn : " +amount);
		}else{
				System.out.println("over draft Limit Exceeded ! : ");
		}
	}
}
class Hierachical{
	public static void main(String [] args){
		SavingAcc sc = new SavingAcc(111,500);
		sc.deposit(1000);
		sc.addInterest();
		sc.showBalance();
		 System.out.println("______________________________________" );
		 
		 CurrentAcc  ca = new CurrentAcc(112,2000);
		 ca.deposit(500);
		ca.addInterest(3000);
		ca.showBalance();
		 
	}
	
}