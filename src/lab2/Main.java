package lab2;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
	    try {
            calculator.calculate("/home/galya/ru/nsu/ccfit/shvetsova/lab2/src/lab2/Resources/config.properties",
                    "/home/galya/ru/nsu/ccfit/shvetsova/lab2/src/lab2/Resources/in.txt",
                    "/home/galya/ru/nsu/ccfit/shvetsova/lab2/src/lab2/Resources/out.txt");
        } catch (Exception ex) {
	        System.out.println(ex);
        }
    }
}
