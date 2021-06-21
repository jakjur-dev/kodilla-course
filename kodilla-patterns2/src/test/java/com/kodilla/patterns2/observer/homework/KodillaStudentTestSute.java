package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStudentTestSute extends TestCase {

    @Test
    public void testUpdate() {
        // Given
        KodillaStudent kodillaStudent1 = new KodillaStudent("Michał", "Nowak");
        KodillaStudent kodillaStudent2 = new KodillaStudent("Jan", "Kowalski");
        KodillaStudent kodillaStudent3 = new KodillaStudent("Zuzanna ", "Wiśniewska");

        Mentor mentor1 = new Mentor("Filip", "Wójcik ");
        Mentor mentor2= new Mentor("Julia ", "Kowalczyk");

        kodillaStudent1.registerMentor(mentor1);
        kodillaStudent2.registerMentor(mentor2);
        kodillaStudent3.registerMentor(mentor1);

        // When
        kodillaStudent1.addExcersize("Hi everyoe! Could you help me with for loop?");
        kodillaStudent1.addExcersize("Better try to use while loop in this case.");
        kodillaStudent2.addExcersize("Help pls, my MySQL db doesn't want to work :(");
        kodillaStudent3.addExcersize("Why while? Is it better?");
        kodillaStudent3.addExcersize("When I try to log in I got 'bad credentials' message");
        // Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}