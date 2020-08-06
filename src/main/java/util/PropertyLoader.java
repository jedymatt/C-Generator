package main.java.util;

import java.io.FileInputStream;
import java.io.IOException;

public class PropertyLoader extends java.util.Properties {

    public PropertyLoader() {
        try {
            if (getUserConfig().exists()) {
                load(getUserConfig());
            } else {
                load(getDefaultConfig());
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void load(java.io.File f) {
        try {
            FileInputStream inputStream = new FileInputStream(f);
            super.load(inputStream);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public java.io.File getUserConfig() {
        return new java.io.File(System.getProperty("user.home") + "\\cgenerator.properties");
    }

    public java.io.InputStream getDefaultConfig() {
        return PropertyLoader.class.getResourceAsStream("/main/res/default.properties");
    }

    public boolean storeConfig(java.io.File f) {
        try {
            store(new java.io.FileOutputStream(f), null);
            return true;
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }
}
