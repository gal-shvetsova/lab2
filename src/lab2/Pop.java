package lab2;

public class Pop implements Operation{
    @Override
    public void operate(CalculatorContext context) throws Exception{
        context.popArg();
    }
}
