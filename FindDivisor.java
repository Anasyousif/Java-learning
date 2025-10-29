public class FindDivisor {
    
public long numberOfDivisors(int n) {

long count = 0;

    if (n <= 0) {
        return 0;
    }


for (int i = 1; i * i <= n; i++) {

if (n % i == 0) {

 if (i * i == n) {
count++;
 } 
            // Otherwise, 'i' and 'n/i' (the quotient) are two distinct divisors.
            // We count both of them by adding 2.
            else {
count += 2;
}
}
}return count;}
}
