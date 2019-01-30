package lab2;

import lab2.Operations.Operation;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;


public class OperationFactory {
    private static HashMap<String, String> mapOperations;

    private OperationFactory() {
    }

    private static void addBasic() {
        mapOperations.put("+", "lab2.Operations.Add");
        mapOperations.put("-", "/lab2.Operations.Subtraction");
        mapOperations.put("DEFINE", "lab2.Operations.Define");
        mapOperations.put("/", "lab2.Operations.Division");
        mapOperations.put("*", "lab2.Operations.Multiplication");
        mapOperations.put("POP", "lab2.Operations.Pop");
        mapOperations.put("PUSH", "lab2.Operations.Push");
        mapOperations.put("PRINT", "lab2.Operations.Print");
        mapOperations.put("#", "lab2.Operations.DoingNothing");
    //    mapOperations.put("SQRT", "lab2.Operations.Sqrt");
    }

    public static OperationFactory getInstance(String filePath) throws Exception {
      //  if (!mapOperations.isEmpty())
       //     throw new Exception("err");  //TODO exceptions if exist or just not creating
      //  mapOperations = new HashMap<>();
        OperationFactory operationFactory = new OperationFactory();
      //  operationFactory.mapOperations = FactoryLoader.makeMap(filePath);
            Properties properties = new Properties();
            InputStream in = OperationFactory.class.getClassLoader().getResourceAsStream(filePath);
            properties.load(in);
            in.close();
            for(HashMap.Entry<Object, Object> entry: properties.entrySet()) {
                mapOperations.put((String) entry.getKey(), (String) entry.getValue());
            }
        addBasic();
        return operationFactory;
    }

    public Operation findOperation(String operation) throws Exception {
        Class opClass = Class.forName(mapOperations.get(operation));
        Operation op = (Operation) opClass.newInstance();  //TODO check
        return op;
    }

    public static boolean isOperation(String operation){
        return mapOperations.containsKey(operation);
    }
}
