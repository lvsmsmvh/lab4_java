package com.company;

public class Student {
    private int id;
    private static int nextId;
    private String name;
    private String surname;
    private String group;
    private com.company.Subject[] subjects = new com.company.Subject[5];
    public static String[] nameSubjects = {"Maths", "English", "Physics", "Biology", "Literature"};

    public Student() {
        this.id = nextId;
        nextId++;
        addSubjects();
    }
    public Student(String name, String surname, String group) {
        this.id = nextId;
        nextId++;
        addSubjects();
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    void addSubjects(){
        for(int i = 0; i < nameSubjects.length; i++){
            subjects[i] = new Subject();
            subjects[i].setNameSubject(nameSubjects[i]);
        }
    }

    public float getAverageMark(){
        float avg = 0;
        for(Subject a: subjects) {
            avg += a.getMark();
        }
        avg = avg / 5;
        avg = (float) Subject.roundAvoid((double) avg, 1);
        return avg;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public com.company.Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(com.company.Subject[] subjects) {
        this.subjects = subjects;
    }
}