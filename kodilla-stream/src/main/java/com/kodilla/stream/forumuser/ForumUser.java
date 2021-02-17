package com.kodilla.stream.forumuser;

import java.time.*;


public class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int id, final String name, final char sex, final LocalDate dateOfBirth,
                     final int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
