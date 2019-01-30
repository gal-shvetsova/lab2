package lab2;


import java.io.FileReader;
import java.util.Scanner;

public class Calculator {
    public void calculate(String configPath, String inPath, String outPath) throws Exception {
        OperationFactory factory = OperationFactory.getInstance(configPath);
        CalculatorContext context = new CalculatorContext();
        FileReader in = new FileReader(inPath);
        Scanner scanner = new Scanner(in);
        String buffer;
        while (scanner.hasNextLine()) {
            buffer = scanner.nextLine();
            context.putToList(buffer);
            factory.findOperation(context.getOperation()).operate(context);
        }
    }

}
