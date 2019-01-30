package lab2.Operations;

import lab2.CalculatorContext;

public class Sqrt implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception {
        double arg = context.popArg();
        if (arg < 0){
            throw new Exception("err"); //TODO no root exception
        }
        context.pushArg(Math.sqrt(arg));
    }
}
