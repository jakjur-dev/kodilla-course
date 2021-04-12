package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testReadFileWithName() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3 , 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0 , 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5 , 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1))
        );
    }
}
