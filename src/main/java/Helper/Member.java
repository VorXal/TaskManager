package main.java.Helper;

public class Member{
    private String name;
    private String surname;
    private String position;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMemberInfo(){
        return "Surname - " + getSurname() +
                ", Name - " + getName() +
                ", Position - " + getPosition() +";";
    }
}
