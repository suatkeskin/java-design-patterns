package com.suatkeskin.creationalpatterns.abstractfactory.factories;

import com.suatkeskin.creationalpatterns.abstractfactory.buttons.Button;
import com.suatkeskin.creationalpatterns.abstractfactory.buttons.MacOSButton;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
