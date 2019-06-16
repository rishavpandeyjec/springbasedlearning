package com.gfg.rishavpandey.StringRestDemo.model;

public class User
{
     long userid;
     String firstname;
     String lastname;
    public User(){

     }
    public User(long userid, String firstname, String lastname) {
        this.userid = userid;
        this.firstname=firstname;
        this.lastname=lastname;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
