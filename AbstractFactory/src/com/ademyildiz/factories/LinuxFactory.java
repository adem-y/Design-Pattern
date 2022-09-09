package com.ademyildiz.factories;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.LinuxButton;
import com.ademyildiz.checkboxes.Checkbox;
import com.ademyildiz.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
