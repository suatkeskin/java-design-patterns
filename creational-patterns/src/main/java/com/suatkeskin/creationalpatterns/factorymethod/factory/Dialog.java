package com.suatkeskin.creationalpatterns.factorymethod.factory;

import com.suatkeskin.creationalpatterns.factorymethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
