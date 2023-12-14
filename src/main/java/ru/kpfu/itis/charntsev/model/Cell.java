package ru.kpfu.itis.charntsev.model;

import java.io.Serializable;

import static ru.kpfu.itis.charntsev.constats.GameConstants.MAX_CHIP_POINTS;

public class Cell implements Serializable {

    private Chip chip;
    private int x;
    private int y;
    private int points;
    private boolean isEmpty;

    public Cell(boolean Empty) {
        isEmpty = Empty;
    }

    public Cell(int x, int y) {
        chip = null;
        this.x = x;
        this.y = y;
        points = 0;
        isEmpty = false;
    }

    public Cell(Chip chip, int x, int y) {
        this.chip = chip;
        this.x = x;
        this.y = y;
        isEmpty = false;
        switch (chip.getPoint()) {
            case ONE:
                points = 1;
                break;
            case TWO:
                points = 2;
                break;
            case THREE:
                points = 3;
                break;
        }
    }

    public Cell(Chip chip, int x, int y, boolean Empty) {
        if (!Empty) {
            this.chip = chip;
            this.x = x;
            this.y = y;
            switch (chip.getPoint()) {
                case ONE:
                    points = 1;
                    break;
                case TWO:
                    points = 2;
                    break;
                case THREE:
                    points = 3;
                    break;
            }
        }
        isEmpty = Empty;
    }

    public boolean increasePoints() {
        points++;
        if (points > MAX_CHIP_POINTS) {
            setPoints(0);
            return true;
        }
        setPoints(points);
        return false;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
        switch (points) {
            case 0:
                chip.setPoint(null);
                break;
            case 1:
                chip.setPoint(ChipPoint.ONE);
                break;
            case 2:
                chip.setPoint(ChipPoint.TWO);
                break;
            case 3:
                chip.setPoint(ChipPoint.THREE);
                break;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
