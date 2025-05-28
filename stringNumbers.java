public class Kata {
    public static String expandedForm(int num) {
        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        
        int length = numStr.length();
        
        for (int i = 0; i < length; i++) {
            char digit = numStr.charAt(i);
            if (digit != '0') {
                if (result.length() > 0) {
                    result.append(" + ");
                }
                result.append(digit);
                for (int j = i + 1; j < length; j++) {
                    result.append("0");
                }
            }
        }
        
        return result.toString();
    }
}
