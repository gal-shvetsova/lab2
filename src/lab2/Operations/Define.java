package lab2.Operations;

import lab2.CalculatorContext;

public class Define implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception {
        String name = context.getArg();
        Double variable = Double.parseDouble(context.getArg());
        context.addVal(name, variable);
    }
}
