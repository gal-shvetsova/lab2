package lab2.Operations;

import lab2.CalculatorContext;

public class Print implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception {
        System.out.println(context.peekArg());
    }
}
