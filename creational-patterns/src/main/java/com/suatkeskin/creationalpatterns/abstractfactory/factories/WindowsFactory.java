package com.suatkeskin.creationalpatterns.abstractfactory.factories;

import com.suatkeskin.creationalpatterns.abstractfactory.buttons.Button;
import com.suatkeskin.creationalpatterns.abstractfactory.buttons.WindowsButton;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
