package com.company;

import java.util.Random;

public class Subject {
    private String nameSubject;
    private float mark;
    private boolean passed = false;

    public Subject(){
        calcMark();
        checkIfPassed();
    }

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    private void checkIfPassed(){
        if (mark > 2) passed = true;
    }

    private void calcMark(){
        mark = (float) (Math.random() * 3 + 2);
        mark = (float)roundAvoid((double) mark, 1);
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
