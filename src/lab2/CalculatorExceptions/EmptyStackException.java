package lab2.CalculatorExceptions;

public class EmptyStackException extends calcExceptions{
    @Override
    public String what() {
        return "No operands";
    }
}
