package lab2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class CalculatorContext {
    private Stack<Double> argStack;
    private Map<String, Double> variables;
    private ArrayList<String> line;

    //work with stack

    public double popArg() throws Exception {
        if (argStack.empty())
            throw new Exception("err"); //TODO void stack exception
        else
            return argStack.pop();
    }

    public void pushArg(double arg) {
        argStack.push(arg);
    }

    public int sizeArg() {
        return argStack.size();
    }

    //work with map

    public double getVal(String name) throws Exception {
        if (variables.isEmpty())
            throw new Exception("err"); //TODO void var exception
        if (variables.get(name) != null)
            return variables.get(name);
        else
            throw new Exception("err"); //TODO no var exception
    }

    public void addVal(String name, double val) {
        variables.put(name, val);
    }

    //work with list

    //TODO make adding string to list

    public String getCommand() throws Exception {
        if (line.isEmpty()) {
            throw new Exception("err"); //TODO void line exception
        }
        if (!Utilities.isString(line.get(0))) {
            throw new Exception("err"); //TODO not a command exception
        }
        String command = line.get(0);
        line.remove(0);
        return command;
    }

    public String getArg() throws Exception {
        if (line.isEmpty()){
            throw new Exception("err"); //TODO void args exception
        }
        String arg = line.get(0);
        line.remove(0);
        return arg;
    }
}

