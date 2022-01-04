package sample;

public class Friend {
    private int age;
    public int phoneNumber;
    public String name;

    //friend constructor
    Friend (String name, int age, int phoneNumber){
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String toString(){
        return name;
    }
}
