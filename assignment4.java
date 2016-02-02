
public class assignment4 {
   public static void main(String args[]) 
   {
     String store="abcdefghijklmnopqrstuvwxyz";
	  
	  
	  
	  assignment4 st= new assignment4();
	  System.out.println("original string "+store);
	  System.out.println("reversed string "+st.reverse(store));
	  
	  
   }
   
   
   public static String reverse(String str) {
    int i, len = str.length();
    StringBuilder nu = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        nu.append(str.charAt(i));
    }

    return nu.toString();
}
      
   
}
