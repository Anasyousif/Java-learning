public class ASum {
    public static long findNb(long m) {
       
        long totalVolume = 0;
        long n = 0;

       
        while (totalVolume < m) {
            n++;
            
            long cubeVolume = n * n * n;
            
         
            totalVolume += cubeVolume;
        }

        
        if (totalVolume == m) {
          
            return n;
        } else {
          
            return -1;
        }
    }
}