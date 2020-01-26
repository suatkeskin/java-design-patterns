package com.suatkeskin.creationalpatterns.abstractfactory.factories;

import com.suatkeskin.creationalpatterns.abstractfactory.buttons.Button;
import com.suatkeskin.creationalpatterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
