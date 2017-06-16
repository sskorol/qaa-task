package com.waverleysoftware;

import java.util.List;

import static java.util.Arrays.asList;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class EntryPoint {

    private static final String VIRTUAL_KEY = "//button[@class='key' and text()='%s']";
    private static final List<String> MOBILE_OPERATORS = asList("097", "050", "066", "096");

    public static void main(String[] args) {
        for (Browser browser : asList(new Firefox(), new Chrome())) {
            for (String number : generatePhoneNumber().split("")) {
                browser.click(String.format(VIRTUAL_KEY, number));
            }
        }
    }

    private static String generatePhoneNumber() {
        return "38" + MOBILE_OPERATORS.get(nextInt(0, MOBILE_OPERATORS.size())) + randomNumeric(7);
    }
}
