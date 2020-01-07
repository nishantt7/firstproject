package lesson1;
public class Callbyvalue 
{
	public static void main(String args[])
	{
		Callbyvalue ga =new Callbyvalue();
		int a=30;
		int b=45;
		ga.swap(a,b);
		System.out.println("after swap");
		System.out.println("value of a" + a);
		System.out.println("value of b" + b);
	}
	public void swap(int a,int b)
	{
	    int c;
	    c=b;
	    b=a;
	    a=c;
        System.out.println("value of a" + a);
		System.out.println("value of b" + b);
	}
}
