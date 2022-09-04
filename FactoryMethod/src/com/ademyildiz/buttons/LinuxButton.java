package com.ademyildiz.buttons;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("LINUX BUTTON");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Linux button says - 'Hello World!'");
    }
}
