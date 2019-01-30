package lab2.Operations;


import lab2.CalculatorContext;

public interface Operation {
    public void operate(CalculatorContext context) throws Exception;
}
