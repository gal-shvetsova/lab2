package lab2.Operations;

import lab2.CalculatorContext;

public class DoingNothing implements Operation {
    @Override
    public void operate(CalculatorContext context) {
        return;
    }
}
