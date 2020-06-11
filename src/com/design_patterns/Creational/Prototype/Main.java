package com.design_patterns.Creational.Prototype;

import com.design_patterns.Creational.Singleton.DBConnection;
import com.design_patterns.Creational.Singleton.LazyDBConnection;

public class Main {

    public static void main(String[] args) {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }
}
