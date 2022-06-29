package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPows, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPows;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String s = "";
        if (hasFur && numberOfPaws > 1) {
            s = String.format("This animal is mostly %s. It has %d paws and a fur.", color, numberOfPaws);
        } else if (hasFur && numberOfPaws == 1) {
            s = String.format("This animal is mostly %s. It has %d paw and a fur.", color, numberOfPaws);
        } else if (!hasFur && numberOfPaws > 1) {
            s = String.format("This animal is mostly %s. It has %d paws and no fur.", color, numberOfPaws);
        } else if (!hasFur && numberOfPaws == 1) {
            s = String.format("This animal is mostly %s. It has %d paw and no fur.", color, numberOfPaws);
        }
        return s;
    }
}
