package constructor;

class Product
{
	int id;
	String Product_name;
	
	void print()
	{
		System.out.println(id + " " +Product_name);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod =new Product();
		prod.print();

	}

}
