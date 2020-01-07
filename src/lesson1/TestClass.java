package lesson1;
public class TestClass
{
  public static void main(String[] args)
  {
    int num;
    num=100;
    if(num==100) {
    System.out.println("The value of num is"+num);}
    num=num*100;
    if(num>600)
    {
    System.out.println("The value of num is" );}
    else
    {
    System.out.println(num);
    }
    for(int i=0;i<5;i++)
    {
    	System.out.println("The value of x is"+" "+i);
    }
    char ch1;
    ch1='X';
    int a;
    a=ch1++;
    System.out.println("the value of is"+a);
    boolean b;
    b=false;
    if(b) {
    	System.out.println("print");}
    else {
    	System.out.println("haha");}
    int arr[]=new int [4];
    for(int j=0;j<4;j++) 
    {
    System.out.println("The value of array is" +arr[j]);
    }
}
}