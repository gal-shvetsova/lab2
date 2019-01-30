package lab2.Operations;


import lab2.CalculatorContext;

public class Push implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception{
            String arg = context.getArg();
            if (!Utilities.isString(arg)) {
                context.pushArg(Double.parseDouble(arg));
            }
            else {
                context.pushArg(context.getVal(arg));
            }
    }
}
