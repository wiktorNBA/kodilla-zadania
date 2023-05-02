package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.stream.Collectors;

import java.util.Map;

public class StreamMain {

    public static void main(String[] args) {

    Forum forum = new Forum();

    Map<Integer, String> theResultMapOfUsers = forum.getUserList().stream()
            .filter(user->user.getGender()== 'M')
            .filter(user->user.getDate()<=2003)
            .filter(user->user.getPublicatedPosts()>=1)
            .collect(Collectors.toMap(ForumUser::getUserId, user -> user.getUsername()));

    theResultMapOfUsers.entrySet().stream()
            .map(entry -> entry.getKey() + ": " + entry.getValue())
            .forEach(System.out::println);



    }
}