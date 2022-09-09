package com.ademyildiz.factories;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.MacOSButton;
import com.ademyildiz.checkboxes.Checkbox;
import com.ademyildiz.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
