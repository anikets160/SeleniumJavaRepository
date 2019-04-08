package comaniket.automation.ecommerce.oops;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		System.out.println(HSBCBank.min_bal);

		HSBCBank h = new HSBCBank();
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		
		//dynamic polymorphism : child class object can be referred by parent interface reference variable
		USBank u =new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
		

	}

}
