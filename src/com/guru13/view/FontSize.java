package com.guru13.view;

/**
 * @author Aliaksei Huryanchyk
 */
public enum FontSize {
    SMALL,
    MEDIUM,
    BIG;

    public static String getCssPath(FontSize fontSize) {
        switch (fontSize) {
            case BIG:
                return "css/fontBig.css";
            case MEDIUM:
                return "css/fontMedium.css";
            case SMALL:
                return "css/fontSmall.css";
            default:
                return null;
        }
    }
}
