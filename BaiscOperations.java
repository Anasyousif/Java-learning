public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    if (op.equals("+")) {
      return v1 + v2;
    } else if (op.equals("-")) {
      return v1 - v2;
    } else if (op.equals("*")) {
      return v1 * v2;
    } else if (op.equals("/")) {
      // Note: In Java, integer division truncates the result.
      return v1 / v2;
    } else {
      // Handle an invalid operation string
      throw new IllegalArgumentException("Invalid operation: " + op);
    }
  }
}