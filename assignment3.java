public class assignment3{
    public static void main(String args[]){
         EncapsAssign3 obj = new EncapsAssign3();
         obj.setEmpName("Russell Limcangco");
         obj.setEmpAge(43);
         obj.setEmpSSN(1234567890);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}