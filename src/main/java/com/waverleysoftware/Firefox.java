package com.waverleysoftware;

public class Firefox implements Browser {

    private final String name;

    public Firefox() {
        this.name = "firefox";
    }

    public void click(String elementPath) {
        System.out.println(String.format("Clicking %s in a %s browser.", elementPath, getName()));
    }

    public String getName() {
        return name;
    }
}
