package com.suatkeskin.creationalpatterns.abstractfactory;

import com.suatkeskin.creationalpatterns.abstractfactory.app.Application;
import com.suatkeskin.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.suatkeskin.creationalpatterns.abstractfactory.factories.MacOSFactory;
import com.suatkeskin.creationalpatterns.abstractfactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
