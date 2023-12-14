package ru.kpfu.itis.charntsev.model;

import java.awt.*;
import java.io.Serializable;

public enum ChipColor implements Serializable {
    RED(new int[] {
            new Color(255, 51, 51).getRGB(),
            new Color(255,255,255).getRGB()
    }),
    BLUE(new int[] {
            new Color(51, 153, 255).getRGB(),
            new Color(255,255,255).getRGB()
    }),
    GREEN(new int[] {
            new Color(51, 255, 51).getRGB(),
            new Color(255,255,255).getRGB()
    }),
    YELLOW(new int[] {
            new Color(255, 255, 51).getRGB(),
            new Color(255,255,255).getRGB()
    }),
    GREY(new int[] {
            new Color(160, 160, 160).getRGB(),
            new Color(96, 96, 96).getRGB()
    });


    private final int[] colors;

    ChipColor(int[] colors) {
        this.colors = colors;
    }


    public int[] getColors(){
        return colors;
    }
}
