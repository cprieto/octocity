package com.cprieto.octocity.common;

public final class Util {
    private Util() {}

    public static boolean IsNullOrWitespace(String input) {
        return input == null || input.trim().length() == 0;
    }
}
