package com.ademyildiz.app;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.checkboxes.Checkbox;
import com.ademyildiz.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
