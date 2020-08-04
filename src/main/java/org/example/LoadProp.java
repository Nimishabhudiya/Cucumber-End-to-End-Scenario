package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static Properties Prop;
    static FileInputStream input;

    public String getProperty(String key) {
        Prop = new Properties();
        try {
            input = new FileInputStream("src\\Resources\\TestData\\TestDataconfig.properties");
            Prop.load(input);
            input.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return Prop.getProperty(key);
    }
}


