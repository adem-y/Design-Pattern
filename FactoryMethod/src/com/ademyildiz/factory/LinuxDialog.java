package com.ademyildiz.factory;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.LinuxButton;

public class LinuxDialog extends Dialog{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

}
