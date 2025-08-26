package polymorphism;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}
//subclass hema

class UpiPayment extends  Payment
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}
//sumanth
class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using Credit/debit card");
	}
}

//nikitha

class Walletpayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using Digital Wallet");
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment;//reference of parent class
		
		payment=new UpiPayment();
		payment.makePayment();
		
		payment =new CardPayment();
		payment.makePayment();
		
		payment=new Walletpayment();
		payment.makePayment();

	}

}
