package oops;

class Notification
{
	String message = "default Notification";
}

class PushNotification extends Notification
{
	String message = "push Notification from wtsup";
	void showNotification()
	{
		System.out.println("child message : " + message);
		System.out.println("parent message :" + super.message);
	}
}

public class superkeywordeg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PushNotification pn = new PushNotification();
		pn.showNotification();
	}


}
