package com.cal109.pomodoroapp;

public class WorkTimeCounter {
    private String backgroundColor;

    public String setBackgroundColor(boolean b) {
        backgroundColor = "Red";
        return backgroundColor;
    }

    public String setTextviewStringToStop() {
        return "Stop";
    }

    public String setTextviewStringToStart() {
        return "Start";
    }
}
