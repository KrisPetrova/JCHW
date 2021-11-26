package lesson5;

import java.io.Serializable;

public class Student implements Serializable {
    private String nameOfStudent;
    private String surname;
    private int age;
    private transient String bankCard = "1233 2342 1233 2342";
    private String girlFriendName;

    public Student(String nameOfStudent, String surname, int age, String bankCard, String girlFriendName) {
        this.nameOfStudent = nameOfStudent;
        this.surname = surname;
        this.age = age;
        this.bankCard = bankCard;
        this.girlFriendName = girlFriendName;
    }

    public Student(String nameOfStudent, String surname, int age) {
        this.nameOfStudent = nameOfStudent;
        this.surname = surname;
        this.age = age;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return nameOfStudent + " " + surname + " " + age;
    }
}
