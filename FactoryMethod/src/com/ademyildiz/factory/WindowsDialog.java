package com.ademyildiz.factory;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    // one more concrete creator
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
