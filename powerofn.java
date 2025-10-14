public class powerofn {
     public static long[] powersOfTwo(int n){
    // The list will have n + 1 elements, corresponding to exponents 0 through n.
    long[] result = new long[n + 1];
    
    // The power of 2 for exponent 0 is 2^0 = 1.
    // We can calculate each subsequent power by multiplying the previous one by 2.
    long currentPower = 1;
    
    for (int i = 0; i <= n; i++){
      // Store the current power of 2 at index i (which represents the exponent).
      result[i] = currentPower;
      
      // Calculate the next power of 2 for the next iteration: 2^(i+1) = 2^i * 2.
      // We use 'long' for the array and calculation to prevent potential overflow, 
      // as powers of 2 grow quickly.
      currentPower *= 2;
    }
    
    return result;
  }
}
