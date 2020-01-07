package lesson1;
import java.util.Set;
import java.util.HashSet;

public class Prcatice {
	
	String localvar="global varaible";
	
	public static void main(String[] args) 
	{
		//reverse an integer
		String localvar="Local variable";
		int a=12345;
        int b=Integer.toString(a).length();
	    System.out.println(b);
	    int rev=0;
	    for (int i=b;i<=b&&i>0;i--)
	    {
	    	rev=rev*10+a%10;
	    	a=a/10;
	    }
		System.out.println(rev);
		
		// find duplicate
        String c[]= {"java","C","C"};
        Set<String> abc=new HashSet<String>();
        for(String var : c) {
        	if(abc.add(var)==false)
        		System.out.println("duplicate is" +var);
        }
        
        //reverse a string
        //String s="selenium";
      String s="Hello World";
        System.out.println(s.length());
        String rev1="";
        for(int i=s.length()-1;i>=0;i--)
        {
        	rev1=rev1+s.charAt(i);
        }
        System.out.println(rev1);
        
        //reverse a string using stringbuffer
        StringBuffer buff=new StringBuffer(s);
        System.out.println(buff.reverse());
        
        //remove special characters
        String st="&&^^%%$$Nishant(())((";
        System.out.println(st.replaceAll("[^a-zA-Z0-9]",""));
        
        //largest and smallest
        int arr[]={1,2,3,4,5};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]>largest)
        		largest=arr[i];
        	else if (arr[i]<smallest)
        		smallest=arr[i];
	    }
        System.out.println(largest);
        System.out.println(smallest);
        
        //second occurrence of a character
        String string="one two thtree";
        System.out.println(string.indexOf('t', string.indexOf('t')+1));   ////indexof(int ch,intfromindex)
        
        		
        //swap two string without using third variable
        String a1 ="Hi";
        String b1="there";
        a1=a1+b1;
        b1=a1.substring(0, a1.length()-b1.length());
        a1=a1.substring(b1.length());
        System.out.println(a1);
        System.out.println(b1);
        
        System.out.println("****************");
        
        //Substring
        String hhjj="hello world i am here";
        String jj=hhjj.substring(3);  //starting index inclusive
        System.out.println(jj);
        String j1=hhjj.substring(3,6); //starting index till end index 
        System.out.println(j1);
        
        System.out.println("((((((((((((");
        
        //swap two integers without using third variable
        int x=10;
        int y=11;
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println(x +" "+y);
        main(4); //main method overloading
        
        String as="ABC";
        String ag="ABC";
        //as="GHI"; this statement has not changes the value of as but created a new object in string constant pool
        System.out.println(as + " " + ag);
        System.out.println(as.hashCode());
        System.out.println(ag.hashCode());
        
        String g="Hello";
        String h="World";
        int gh=10;
        int hj=10;
        System.out.print(g+h+gh+hj);
        System.out.println(gh+hj+g+h);
        System.out.println(g+h+(gh+hj));
        
	//post pre increment and decrement
	int a11=67;
	int b11=++a11;
	int c11=a11++;
	int df=--a11;
	int dg=a11--;
	System.out.println("a is" +a11 +" " +"value of b is" +b11+" "+"value of c" +c11 +"value of df"+df+ " "+ "value of dg" +dg);
	
	//++a increments and then uses the variable.
	//a++ uses and then increments the variable.
	
	///https://beginnersbook.com/2013/12/java-string-split-method-example/
	
	
	int a111 = 5;
	int i11=++a111 + ++a111 + a111++;
	//i=6 + 7 + 7; (a=8)

	int a123 = 5;
	int i22=a123++ + ++a123 + ++a123;
	//i=5 + 7 + 8; (a=8)

	
	
	
	///global and local variable
	System.out.println("value of local variable" +localvar);
	Prcatice obj=new Prcatice();
	System.out.println("value of global variable" +obj.localvar);
	obj.sum();
	}
        public static void main(int a)
        {
        	System.out.println("main overload");
        }
        public void sum()
        {
        	String localvar="localvar2";
        	System.out.println("Value is" +localvar);
        	System.out.println("Value is" +5);
        }
}

