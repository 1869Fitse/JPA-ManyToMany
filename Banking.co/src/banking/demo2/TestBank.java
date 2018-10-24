package banking.demo2;

public class TestBank {
	
	public static void main(String[] args) {
		
		
		ICICIBank ic= new ICICIBank();
		ic.carLoan();
		ic.carLoan();
		ic.credit();
		ic.debit();
		ic.educationLoan();
		ic.homeLoan();
		ic.insurance();
		ic.mutualFund();
		System.out.println(ETHBank.min_bal);
		
		ETHBank et = new ICICIBank();
		et.carLoan();
		et.educationLoan();
		et.homeLoan();
		
	
	}
	

}
