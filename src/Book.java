
public class Book {

	int id;
	float price;
	static String name;
	
	public Book(){
		id = 1;
		System.out.println("ִ���˹��캯��");
	}
	{
		price = 25.54f;
		System.out.println("ִ�������зǾ�̬�����");
	}
	static {
		name = "�����뺣";
		System.out.println("ִ�������еľ�̬�����");
	}
	
	public void show(){
		System.out.println("id:" + id + " price:" + price + " name:" + name);
	}
}
