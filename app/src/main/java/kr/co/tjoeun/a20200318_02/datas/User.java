package kr.co.tjoeun.a20200318_02.datas;

public class User {

    private String name;
    private int birthYear;

    public User(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
}
