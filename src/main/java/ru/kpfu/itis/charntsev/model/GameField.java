package ru.kpfu.itis.charntsev.model;

import java.io.Serializable;

import static ru.kpfu.itis.charntsev.constats.GameConstants.*;

public class GameField implements Serializable {

    private FieldType fieldType;
    private FieldSize fieldSize;
    private Cell[][] field;

    public GameField(FieldType fieldType, FieldSize fieldSize) {
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
        initField();
    }

    public GameField(FieldType fieldType, FieldSize fieldSize, Cell[][] cells) {
        this.fieldType = fieldType;
        this.fieldSize = fieldSize;
        this.field = cells;
    }

    private void initField() {
        if (fieldType == FieldType.RECTANGLE) {
            switch (fieldSize) {
                case SMALL:
                    field = new Cell[SMALL_FIELD_LENGTH][SMALL_RECTANGLE_FIELD_LENGTH];
                    break;
                case STANDARD:
                    field = new Cell[STANDARD_FIELD_LENGTH][STANDARD_RECTANGLE_FIELD_LENGTH];
                    break;
                case LARGE:
                    field = new Cell[LARGE_FIELD_LENGTH][LARGE_RECTANGLE_FIELD_LENGTH];
                    break;
                case HUGE:
                    field = new Cell[HUGE_FIELD_LENGTH][HUGE_RECTANGLE_FIELD_LENGTH];
                    break;
            }
        } else {
            switch (fieldSize) {
                case SMALL:
                    field = new Cell[SMALL_FIELD_LENGTH][SMALL_FIELD_LENGTH];
                    break;
                case STANDARD:
                    field = new Cell[STANDARD_FIELD_LENGTH][STANDARD_FIELD_LENGTH];
                    break;
                case LARGE:
                    field = new Cell[LARGE_FIELD_LENGTH][LARGE_FIELD_LENGTH];
                    break;
                case HUGE:
                    field = new Cell[HUGE_FIELD_LENGTH][HUGE_FIELD_LENGTH];
                    break;
            }
        }


    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public FieldSize getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(FieldSize fieldSize) {
        this.fieldSize = fieldSize;
    }

    public Cell[][] getField() {
        return field;
    }

    public void setField(Cell[][] cells) {
        this.field = cells;
    }
}
