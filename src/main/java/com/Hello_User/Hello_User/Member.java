package com.Hello_User.Hello_User;

public class Member {

    private String name;
    private String age;
    private String clubRole;
    private String currentlyDrives;
    private Boolean paidMember;

    public Boolean getPaidMember() {
        return paidMember;
    }

    public void setPaidMember(Boolean paidMember) {
        this.paidMember = paidMember;
    }

    public Member(String name, String age, String clubRole, String currentlyDrives, Boolean paidMember) {
        this.name = name;
        this.age = age;
        this.clubRole = clubRole;
        this.currentlyDrives = currentlyDrives;
        this.paidMember = paidMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClubRole() {
        return clubRole;
    }

    public void setClubRole(String clubRole) {
        this.clubRole = clubRole;
    }

    public String getCurrentlyDrives() {
        return currentlyDrives;
    }

    public void setCurrentlyDrives(String currentlyDrives) {
        this.currentlyDrives = currentlyDrives;
    }

}
