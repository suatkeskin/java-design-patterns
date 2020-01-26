package com.suatkeskin.creationalpatterns.abstractfactory.app;

import com.suatkeskin.creationalpatterns.abstractfactory.buttons.Button;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import com.suatkeskin.creationalpatterns.abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
