package com.gfg.rishavpandey.StringRestDemo.model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.gfg.rishavpandey.StringRestDemo.model.UserData.userMap;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getallUsers(){
        List<User> list = new ArrayList<>();
        for(Map.Entry<Long,User> u: userMap.entrySet())
        {
           list.add(u.getValue());
        }
        return list;
    }

    @PutMapping("/user")
    public boolean updateUser(@RequestBody User user)
    {
        if(userMap.containsKey(user.getUserid())){
            userMap.put(user.getUserid(),user);
            return true;
        }
        return false;
    }
    @PostMapping("/user")
    public boolean createUser(@RequestBody User u){
        if(!userMap.containsKey(u.getUserid())){
            userMap.put(u.getUserid(),u);
            return true;
        }
        return false;
    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        if(userMap.containsKey(id)){
            return userMap.get(id);
        }
        return null;
    }
}
