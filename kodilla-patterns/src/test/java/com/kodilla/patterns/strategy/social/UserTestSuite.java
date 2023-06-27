package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");

        //When
        String user1net = user1.sharePost();
        String user2net = user2.sharePost();
        String user3net = user3.sharePost();
        System.out.println("User1 is using " + user1net);
        System.out.println("User2 is using " + user2net);
        System.out.println("User3 is using " + user3net);

        //Then
        Assertions.assertEquals("Facebook", user1net);
        Assertions.assertEquals("Twitter", user2net);
        Assertions.assertEquals("Snapchat", user3net);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user4 = new Millenials("User4");

        //When
        String user4net = user4.sharePost();
        System.out.println("User4 is using " + user4net);
        user4.setSocialNetwork(new SnapchatPublisher());
        user4net = user4.sharePost();
        System.out.println("User4 is using " + user4net);

        //Then
        Assertions.assertEquals("Snapchat", user4net);
    }
}
