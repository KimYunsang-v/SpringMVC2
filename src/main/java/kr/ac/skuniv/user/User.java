package kr.ac.skuniv.user;

import org.springframework.stereotype.Component;

@Component
public class User {

    static String userId;
    static String pw;
    static String name;
    static String email;

    public static void setUserId(String userId) {
        User.userId = userId;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static void setPw(String pw) {
        User.pw = pw;
    }
}
