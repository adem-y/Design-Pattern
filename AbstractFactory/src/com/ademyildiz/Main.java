package com.ademyildiz;

import com.ademyildiz.app.Application;
import com.ademyildiz.factories.GUIFactory;
import com.ademyildiz.factories.LinuxFactory;
import com.ademyildiz.factories.MacOSFactory;
import com.ademyildiz.factories.WindowsFactory;

import java.util.Locale;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("linux")){
            factory = new LinuxFactory();
        }else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
