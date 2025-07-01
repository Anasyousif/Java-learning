public class Grades {
    public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // TODO: Check pass or fail
        if (score >= 50){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        // TODO: Determine grade based on score
        
        if (grade >= 90) {
            System.out.println(grade);
        }
        else if (grade < 89 && grade >= 75 ) {
            System.out.println("Grade: "+grade);
        }
        else if (grade < 74 && grade >= 60 ) {
            System.out.println("Grade: "+grade);
        }
        else   {
            System.out.println("Grade: "+grade);
        }
        
       
   }
    
}
