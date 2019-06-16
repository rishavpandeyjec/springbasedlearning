package com.gfg.rishavpandey.StringRestDemo.model;

import java.util.HashMap;

public class UserData {
    public static HashMap<Long,User> userMap = new HashMap<>();
    static{
        User u1 = new User();
        u1.setUserid(1L);
        u1.setFirstname("varun");
        u1.setLastname("kosdjjfs");
        userMap.put(u1.getUserid(),u1);
        User u2 = new User();
        u2.setUserid(2L);
        u2.setFirstname("dnfjdidn");
        u2.setLastname("fjfnj");
        userMap.put(u2.getUserid(),u2);
    }
}
