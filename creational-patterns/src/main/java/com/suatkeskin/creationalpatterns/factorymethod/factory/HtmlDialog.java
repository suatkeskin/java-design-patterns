package com.suatkeskin.creationalpatterns.factorymethod.factory;

import com.suatkeskin.creationalpatterns.factorymethod.buttons.Button;
import com.suatkeskin.creationalpatterns.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}