package com.ademyildiz.factory;

import com.ademyildiz.buttons.Button;
import com.ademyildiz.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    // concrete creator

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
