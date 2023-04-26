package com.kodilla.stream.immutable;

public final class ForumUser {
    private static String username;
    private static String realName;

    public ForumUser(){
        this.username=username;
        this.realName=realName;
    }

    public static String getUsername() {
        return username;
    }

    public static String getRealName() {
        return realName;
    }
}
