package lab2.Operations;

import lab2.CalculatorContext;

public class Add implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception{
            context.pushArg(context.popArg() + context.popArg());
    }
}
