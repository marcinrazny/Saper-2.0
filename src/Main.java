package com.nazwiemypozniej;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyJFrame window = new MyJFrame();
            }
        });
    }
}