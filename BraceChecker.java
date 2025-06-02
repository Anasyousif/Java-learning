import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : braces.toCharArray()) {
            // If it's an opening brace, push it to the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If it's a closing brace, check if it matches the most recent opening brace
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing brace without an opening brace
                }
                
                char last = stack.pop();
                if ((c == ')' && last != '(') || 
                    (c == ']' && last != '[') || 
                    (c == '}' && last != '{')) {
                    return false; // Mismatched braces
                }
            }
        }

        // If the stack is empty, all braces are matched
        return stack.isEmpty();
    }
}
