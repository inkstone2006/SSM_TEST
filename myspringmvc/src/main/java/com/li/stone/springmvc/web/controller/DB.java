package com.li.stone.springmvc.web.controller;

import com.li.stone.springmvc.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class DB {
    public static Map<Integer,User> tables = new HashMap<Integer, User>();
    static {
        for (int i = 1 ; i <= 15 ; i ++ ) {
            User u = new User();
            u.setId(i);
            u.setName("tom" + i);
            u.setAge(i % 20);
            tables.put(i,u);
        }
    }

    public static List<User> findAll(){
        return new ArrayList<User>(tables.values());
    }

    public static void delete(Integer uid){
        tables.remove(uid);
    }

    public static User select(Integer uid){
        return tables.get(uid);
    }

    public static void update(User user){
        tables.put(user.getId(),user);
    }

    public static void deleteAll(){
        tables.clear();
    }

}
