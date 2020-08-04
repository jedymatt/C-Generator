package main.lib;
//Value setter

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Value {

    private static Properties property;
    private static File userConfig;

    
    static {
        property = new Properties();

        userConfig = new File(System.getProperty("user.home") + "\\userconfig.properties");

        if (userConfig.exists()) {

            try {
                FileInputStream inputStream = new FileInputStream(userConfig);
                property.load(inputStream);
                System.out.println("loaded");
            } catch (Exception ex) {

            }
        } else {
            try {
                property.load(Value.class.getResourceAsStream("/res/default.properties"));
            } catch (Exception ex) {

            }
        }

    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return property.getProperty(key, defaultValue);
    }

    public static void storeUserConfig() {
        try
        {
            property.store(new FileOutputStream(userConfig), null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void storeUserConfig(String comments){
        try{
            property.store(new FileOutputStream(userConfig), comments);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void setProperty(String key, String valueString) {
        property.setProperty(key, valueString);
    }

}
