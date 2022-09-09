package com.ademyildiz.factories;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.WindowsButton;
import com.ademyildiz.checkboxes.Checkbox;
import com.ademyildiz.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
