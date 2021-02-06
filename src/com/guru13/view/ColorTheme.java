package com.guru13.view;

/**
 * @author Aliaksei Huryanchyk
 */
public enum ColorTheme {
    LIGHT,
    DEFAULT,
    DARK;

    public static String getCssPath(ColorTheme colorTheme) {
        switch (colorTheme) {
            case DARK:
                return "css/themeDark.css";
            case LIGHT:
                return "css/themeLight.css";
            case DEFAULT:
                return "css/themeDefault.css";
            default:
                return null;
        }
    }
}
