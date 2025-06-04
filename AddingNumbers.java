public class Kata {
    public static String add(String a, String b) {
        // Ensure a is the longer string
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        // StringBuilder to hold the result
        StringBuilder result = new StringBuilder();

        // Start adding from the end (rightmost digits)
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop through both strings, adding corresponding digits
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0; // Convert char to int
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0; // Convert char to int
            int sum = digitA + digitB + carry;
            
            carry = sum / 10;  // Carry for the next iteration
            result.append(sum % 10);  // Append the current digit of the result

            i--;
            j--;
        }

        // Reverse the result since we added digits from right to left
        result.reverse();

        // Convert StringBuilder to string and remove leading zeros if any
        String finalResult = result.toString().replaceAll("^0+", "");

        // If the result is empty, that means the sum was zero
        return finalResult.isEmpty() ? "0" : finalResult;
    }
}
