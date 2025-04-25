class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        // Check for null or empty operation and throw the appropriate exceptions
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result;
        String operationSymbol;

        try {
            // Perform the operation based on the operation string
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    operationSymbol = " + ";
                    break;
                case "*":
                    result = operand1 * operand2;
                    operationSymbol = " * ";
                    break;
                case "/":
                    result = operand1 / operand2; // This may throw ArithmeticException (e.g., division by zero)
                    operationSymbol = " / ";
                    break;
                default:
                    // Throw IllegalOperationException for unsupported operations
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            // If division by zero occurs, throw IllegalOperationException with the message
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

        // Return the result in the format "operand1 operation operand2 = result"
        return operand1 + operationSymbol + operand2 + " = " + result;
    }
}


