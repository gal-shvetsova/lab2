package lab2.Operations;

import lab2.CalculatorContext;

public class Pop implements Operation{
    @Override
    public void operate(CalculatorContext context) throws Exception{
        context.popArg();
    }
}
