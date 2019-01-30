package lab2;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.StringTokenizer;

public class FactoryLoader {
    private FactoryLoader() {
    }

    public static HashMap makeMap(String filePath) throws Exception {
        HashMap<String, String> operations = new HashMap<>();
        Properties properties = new Properties();
      //  InputStream in = OperationFactory.getResourceAsStream(filePath);
     //   properties.load(in);
    //    in.close();
     //   if (in == null){
     //       return operations;
     //   }
        for(HashMap.Entry<Object, Object> entry: properties.entrySet()) {
            operations.put((String) entry.getKey(), (String) entry.getValue());
        }
        return operations;
    }
}