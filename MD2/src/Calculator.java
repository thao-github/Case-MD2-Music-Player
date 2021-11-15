public class Calculator {
        public static int calculate(int firstOperand, int b, char o) {
            switch (o) {
                case '+':
                    return firstOperand + b;
                case '-':
                    return firstOperand - b;
                case '*':
                    return firstOperand * b;
                case '/':
                    if (b != 0)
                        return firstOperand / b;
                    else
                        throw new RuntimeException("Can not divide by 0");
                default:
                    throw new RuntimeException("Unsupported operation");
            }
        }
    }

