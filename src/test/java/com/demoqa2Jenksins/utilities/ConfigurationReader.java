package com.demoqa2Jenksins.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();
        } catch (IOException e) {
            System.err.println("File not found in the ConfigurationReader Class");
        }
    }
    public static String getProperty(String key){
        return  properties.getProperty(key);
    }

}
