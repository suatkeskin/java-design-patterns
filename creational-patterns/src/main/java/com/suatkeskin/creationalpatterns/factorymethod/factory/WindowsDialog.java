package com.suatkeskin.creationalpatterns.factorymethod.factory;

import com.suatkeskin.creationalpatterns.factorymethod.buttons.Button;
import com.suatkeskin.creationalpatterns.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}