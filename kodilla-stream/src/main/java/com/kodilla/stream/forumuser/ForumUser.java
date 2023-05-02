package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String username;
    private final char gender;


    private final LocalDate date;
    private final int publicatedPosts;

    public ForumUser(int userId, String username, char gender, int year, int month, int day, int publicatedPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.date = LocalDate.of(year,month,day);
        this.publicatedPosts = publicatedPosts;
    }

    public char getGender() {
        return gender;
    }

    public int getPublicatedPosts() {
        return publicatedPosts;
    }

    public int getDate(){
        return date.getYear();
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
