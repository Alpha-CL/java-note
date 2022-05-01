package class_case.tomcat.server.server;

import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class ServerFileReader {

    private static HashMap<String, String> map = new HashMap<String, String>();

    static {

        try {

            Properties properties = new Properties();
            properties.load(new FileReader("src/class_case/tomcat/server.properties"));

            Enumeration<?> enumeration = properties.propertyNames();

            while (enumeration.hasMoreElements()) {

                String key = (String) enumeration.nextElement();
                String value = properties.getProperty(key);
                map.put(key, value);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return map.get(key);
    }
}
