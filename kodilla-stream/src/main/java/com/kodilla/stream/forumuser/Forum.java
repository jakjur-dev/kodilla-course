package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1254, "Dylan Murphy", 'M',
                LocalDate.of(1998, 5, 8), 1));
        forumUsersList.add(new ForumUser(1546, "Morgan Walsh", 'M',
                LocalDate.of(2003, 12, 19), 1));
        forumUsersList.add(new ForumUser(4654, "Ryan Talley", 'M',
                LocalDate.of(2000, 12, 15), 2));
        forumUsersList.add(new ForumUser(4864, "Giancarlo Guerrero", 'M',
                LocalDate.of(2001, 5, 30), 0));
        forumUsersList.add(new ForumUser(5461, "Phoebe Pearson", 'F',
                LocalDate.of(2001, 1, 8), 5));
        forumUsersList.add(new ForumUser(9865, "Aimee Murphy", 'F',
                LocalDate.of(1999, 3, 4), 0));
        forumUsersList.add(new ForumUser(1346, "Madelynn Carson", 'F',
                LocalDate.of(1997, 6, 4), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }
}
