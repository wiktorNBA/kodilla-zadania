package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
public class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(1, "a", 'M', 2020, 3, 12, 5 ));
        theUserList.add(new ForumUser(2, "b", 'F', 2000, 1, 19, 1 ));
        theUserList.add(new ForumUser(3, "c", 'M', 1999, 10, 28, 13 ));
        theUserList.add(new ForumUser(4, "d", 'F', 2007, 9, 1, 3 ));
        theUserList.add(new ForumUser(5, "e", 'M', 2023, 1, 30, 17 ));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);
    }
}

