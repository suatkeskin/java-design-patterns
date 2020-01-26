package com.suatkeskin.creationalpatterns.factorymethod;

import com.suatkeskin.creationalpatterns.factorymethod.factory.Dialog;
import com.suatkeskin.creationalpatterns.factorymethod.factory.HtmlDialog;
import com.suatkeskin.creationalpatterns.factorymethod.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").startsWith("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
