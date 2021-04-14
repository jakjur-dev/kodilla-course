package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User michael = new ZGeneration("Michael Rowe");

        //When
        String stevenPublishes = steven.sharePost();
        System.out.println("Steven published: " + stevenPublishes);
        String johnPublishes = john.sharePost();
        System.out.println("John published: " + johnPublishes);
        String michaelPublishes = michael.sharePost();
        System.out.println("Michael published: " + michaelPublishes);

        //Then
        assertEquals("[Facebook Publisher] Post on Facebook", stevenPublishes);
        assertEquals("[Twitter Publisher] Tweet on Twitter", johnPublishes);
        assertEquals("[Snapchat Publisher] Photo on Snapchat", michaelPublishes);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPublishes = steven.sharePost();
        System.out.println("Steven published: " + stevenPublishes);
        steven.setSocialPlatform(new TwitterPublisher());
        stevenPublishes = steven.sharePost();
        System.out.println("Steven now published: " + stevenPublishes);

        //Then
        assertEquals("[Twitter Publisher] Tweet on Twitter", stevenPublishes);
    }
}
