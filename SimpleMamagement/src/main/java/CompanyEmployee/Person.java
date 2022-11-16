package CompanyEmployee;

import java.util.Objects;

public class Person {
    private String fName, lName, phoneNumber;
    private int age, joinDate;

    public Person() {}

    public Person(String fName, String lName, String phoneNumber, int age, int joinDate) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.joinDate = joinDate;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }
    
    
}
