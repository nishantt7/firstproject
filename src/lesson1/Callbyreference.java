package lesson1;
public class Callbyreference {
	int i;
	
	public static void main (String args[])
	{
		Callbyreference a=new Callbyreference();
		a.i=10;
		a.modify(a);
		System.out.println(a.i);
	}
	public void modify(Callbyreference t)
	{
		t.i=70;
		System.out.println(t.i);
	}
}
