package com.designPatterns.creational.prototype;

import com.designPatterns.creational.prototype.color.BlackColor;
import com.designPatterns.creational.prototype.color.BlueColor;
import com.designPatterns.creational.prototype.color.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}
