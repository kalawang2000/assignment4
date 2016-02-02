import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;


public class assignment2 {
   public static void main(String args[]) throws Exception {
      int ar[] = { 5, 8, 2, 4, 1, 15, 12, 0, 3, 6 };
      prArray("Not Sorted", ar);
	  Arrays.sort(ar);
      prArray("Sorted array", ar);
	  
	  assignment2 num= new assignment2();
	  
	  ar[5]=num.enternum();
	  prArray("inserted a number at array[5]", ar);
	  
	  Arrays.sort(ar);
	  prArray("Sorted array with the inserted number", ar);
	  
   }
   
   private static void prArray(String message, int ar[]) {
      System.out.println(message
      + ": [length: " + ar.length + "]");
	  System.out.print(ar[0]);  
      for (int i = 1; i < ar.length; i++) {
         
         System.out.print(" , "+ar[i]);                     
      }
      System.out.println();
   }
   
   
   private int enternum() {	
	
	boolean bError=true;
	int num1=0;
	Scanner in = new Scanner(System.in); 	       
		do {
			try {
				System.out.print("Please enter a positive or a negative number: ");
				num1 = in.nextInt();
				bError = false;
				
				} 
			catch (InputMismatchException e) {
				System.out.print("(Wrong input) ");
				}
				in.nextLine(); 
		} while (bError);
		return(num1);

    }
   
   
   
}
