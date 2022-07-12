package SimpleClassesAndObjects;

import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private String groupNumber;
    private int[] markList;

    public Student(String name, String surname, String groupNumber, int[] markList) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.markList = markList;

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

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getmarkList() {
        return markList;
    }

    public void setmarkList(int[] markList) {
        this.markList = markList;
    }

    @Override
    public String toString() {
        return "Student{"
                + "Name = " + name
                + ", Surname = " + surname
                + ", Group Number = " + groupNumber
                + ", Marks = " + Arrays.toString(markList)
                + '}';
    }

}