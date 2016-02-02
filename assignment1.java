import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class assignment1 
{

	
   public static void main(String args[]) throws Exception {
      int ara[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      
	  System.out.print("in right order  "); 
	  for(int i=0 ; i<10 ; i++)
	  {
		  
		  System.out.print(ara[i] + "  ");  
		  
	  }
	 System.out.println();
	 System.out.print("in right reverse order  "); 
	  for(int i=9 ; i>-1 ; i--)
	  {
		  
		  System.out.print(ara[i] + "  ");  
		  
	  }
   
  
   }

}