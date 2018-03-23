
public class Book {

	int id;
	float price;
	static String name;
	
	public Book(){
		id = 1;
		System.out.println("执行了构造函数");
	}
	{
		price = 25.54f;
		System.out.println("执行了类中非静态代码块");
	}
	static {
		name = "老人与海";
		System.out.println("执行了类中的静态代码块");
	}
	
	public void show(){
		System.out.println("id:" + id + " price:" + price + " name:" + name);
	}
}
