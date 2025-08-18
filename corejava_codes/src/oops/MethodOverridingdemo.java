package oops;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method ");
	}
}

class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using UPI ");
	}
}

class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using Debit card ");
	}
}

class Walletpayment extends Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using Walletpayment ");
	}
}

public class MethodOverridingdemo {
	
	public static void main(String[] args) {
		Payment payment;//reference of parent class
		
		payment = new UpiPayment();
		payment.makePayment();
		
		payment = new CardPayment();
		payment.makePayment();
		
		payment = new Walletpayment();
		payment.makePayment();
		
	}

}
