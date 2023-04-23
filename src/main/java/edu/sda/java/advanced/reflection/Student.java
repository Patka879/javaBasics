package edu.sda.java.advanced.reflection;

public class Student extends Person{
    private String university;
    protected String faculty;
    String specialization;
    public int year;

    public Student() {
        super("Janek");
    }

    public Student(String name, String faculty, String university) {
        super(name);
        this.faculty = faculty;
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
    private String info() {
        return "";
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
