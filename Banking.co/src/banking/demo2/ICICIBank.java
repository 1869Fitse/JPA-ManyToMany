package banking.demo2;

public class ICICIBank implements USBank, ETHBank {

	@Override
	public void educationLoan() {
		// TODO Auto-generated method stub
		System.out.println("icici--education loan");
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("icici --car loan");
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		
		System.out.println("icici---home loan");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("icici-- debit card");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
		System.out.println("icici---credit");
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("icici ---transfer money");
	}

	@Override
	public void trading() {
		// TODO Auto-generated method stub
		System.out.println("icicii---trading");
	}
	
	public void mutualFund() {
		System.out.println("icici--mutual funds");
	}
	
    public void insurance() {
    	System.out.println("icici--inssurance");
    }
}
