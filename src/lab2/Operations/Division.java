package lab2.Operations;

import lab2.CalculatorContext;

public class Division implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception {
        double divider = context.popArg();
        double dividend = context.popArg();
        if (divider == 0) {
            throw new Exception("err"); //TODO division by zero exception
        }
        context.pushArg(dividend / divider);
    }
}
