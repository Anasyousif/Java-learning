public class Logical_Operators {
   public static void main(String[] args){
     
         int a = 20;
         int b = 10;
         
         int add = a + b;
         int subtract =  a - b;
         int multiply = a * b;
         int divide = a/b;
         
         boolean result1 = a > b;
         boolean result2 = a > b && b > 0;
         
         System.out.println("Addition:" + " " +add);
         
         System.out.println("Subtraction:" +" " +subtract);
         
         System.out.println("Multiplication:" + " " +multiply);
         
         System.out.println("Division:" + " " +divide);
         
         System.out.println("Is a greater than b?" + " " +result1);
         
         System.out.println("Is a > b and b > 0?" + " " +result2);
         
    } 
}
