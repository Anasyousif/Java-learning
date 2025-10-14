public class Rentals {
     public static int rentalCarCost(int d) {
    
    int totalCost = d * 40;
   
  
    if (d >= 7) {
     
      totalCost -= 50;
    } else if (d >= 3) {

      totalCost -= 20;
    }
    
    
    return totalCost;
  }
}
