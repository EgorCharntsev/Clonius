package ru.kpfu.itis.charntsev.model;

import java.io.Serializable;

public class Chip implements Serializable {

    private ChipColor color;
    private ChipPoint point;

    public Chip(ChipColor color, ChipPoint point) {
        this.color = color;
        this.point = point;
    }

    public ChipColor getColor() {
        return color;
    }

    public void setColor(ChipColor color) {
        this.color = color;
    }

    public ChipPoint getPoint() {
        return point;
    }

    public void setPoint(ChipPoint point) {
        this.point = point;
    }
}
