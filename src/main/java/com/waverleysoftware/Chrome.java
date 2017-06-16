package com.waverleysoftware;

public class Chrome implements Browser {

    private final String name;

    public Chrome() {
        this.name = "chrome";
    }

    public void click(String elementPath) {
        System.out.println(String.format("Clicking %s in a %s browser.", elementPath, getName()));
    }

    public String getName() {
        return name;
    }
}
