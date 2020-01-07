package lesson1;

public class Test2
{
  public static void main(String args[])
  {
	  int arr1[][]=new int[4][4];
	  int n=0;
	  for(int m=0;m<4;m++) 
	  {  
		  for (int l=0;l<4;l++)
		  {
			  arr1[m][l]=n;
	          n++;
		  }
	  }  
	  for(int m=0;m<4;m++)
	  {
		  for (int l=0;l<4;l++) {
			System.out.print(arr1[m][l]+" ");
		  }
		  System.out.println("");
	  }
  }
}
