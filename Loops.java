public class Loops {
     public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for (int i = 1; i <=5; i++) 
        {
          System.out.print(i + " ");
        }
        
        System.out.println();
        
        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop: ");
        int i = 1;
        while (i <=5){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // TODO: Print numbers 1 to 5 using do-while loop
        
        System.out.print("Do-While Loop: ");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        }
        
        while(c <=5);
    }
    
}
