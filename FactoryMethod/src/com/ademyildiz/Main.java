package com.ademyildiz;

import com.ademyildiz.factory.Dialog;
import com.ademyildiz.factory.HtmlDialog;
import com.ademyildiz.factory.LinuxDialog;
import com.ademyildiz.factory.WindowsDialog;

public class Main {
    
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

    static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }
        else if (System.getProperty("os.name").equals("Linux")) {
            dialog = new LinuxDialog();
        }else {
            dialog = new HtmlDialog();
        }
    }
}
