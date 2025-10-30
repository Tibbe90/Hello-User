package com.Hello_User.Hello_User;

import java.util.UUID;

public class Member {

    private UUID id;
    private String name;
    private int age;
    private String clubRole;
    private String currentlyDrives;
    private Boolean paidMember;
    
        public Member(String name, int age, String clubRole, String currentlyDrives, Boolean paidMember) {
            this.id = UUID.randomUUID();
            this.name = name;
            this.age = age;
            this.clubRole = clubRole;
            this.currentlyDrives = currentlyDrives;
            this.paidMember = paidMember;
        }

    public UUID getId() {
            return id;
        }

    public Boolean getPaidMember() {
        return paidMember;
    }

    public void setPaidMember(Boolean paidMember) {
        this.paidMember = paidMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
