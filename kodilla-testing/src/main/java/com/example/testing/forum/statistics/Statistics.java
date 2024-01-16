package com.example.testing.forum.statistics;

import com.example.testing.forum.ForumUser;

import java.util.List;

public interface Statistics {

    List<String> usersNames();

    int postsCount();

    int commentsCount();
}