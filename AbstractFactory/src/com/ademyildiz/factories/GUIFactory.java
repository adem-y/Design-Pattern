package com.ademyildiz.factories;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
