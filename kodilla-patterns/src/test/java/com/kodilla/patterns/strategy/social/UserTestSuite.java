package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User milenials = new Millenials("Bob");
        User yGen = new YGeneration("Josh");
        User zGen = new ZGeneration("Steve");
        //When
        String facebook = milenials.sharePost();
        String twitter = yGen.sharePost();
        String snap = zGen.sharePost();
        //Then
        Assertions.assertEquals("Facebook",facebook);
        Assertions.assertEquals("Twitter",twitter);
        Assertions.assertEquals("Snapchat",snap);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User yGen = new YGeneration("Josh");
        yGen.setSocialPublisher(new FacebookPublisher());
        //When
        String facebook = yGen.sharePost();
        //Then
        Assertions.assertEquals("Facebook",facebook);
    }
}
