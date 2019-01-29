package lab2;

public class Add implements Operation {
    @Override
    public void operate(CalculatorContext context) throws Exception{
            context.pushArg(context.popArg() + context.popArg());
    }
}
