package com.ademyildiz.factory;

import com.ademyildiz.buttons.Button;

public abstract class Dialog {
    // base creator

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
