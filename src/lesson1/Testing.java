package lesson1;

public class Testing {
	
	static int a=10;
	int c=20;
	public static void doer()
	{
		System.out.println("print");
	}
	public void method1()
	    {
		int y=10;
		System.out.println("value of y"+y);
		System.out.println("value of y"+a);
	    }
	public static void main (String[] args) {
		//Testing obj=new Testing();
		System.out.println("value of a is" +a);
		//System.out.println("value of a is" +c);
		doer();
		int b=40;
		System.out.println("value of b is" +b);
		//method1();
	}
}
