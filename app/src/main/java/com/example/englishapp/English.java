package com.example.englishapp;

public class English {
    private int id;
    private String nameLesson;

    public English() {
    }

    public English(int id, String nameLesson) {
        this.id = id;
        this.nameLesson = nameLesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }
}
