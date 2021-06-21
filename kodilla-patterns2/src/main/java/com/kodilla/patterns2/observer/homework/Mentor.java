package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements KodillaObserver {

    private final String name;
    private final String surname;
    private int updateCount;

    public Mentor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name + " " + surname;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(KodillaStudent kodillaStudent) {
        System.out.println(name + " " + surname + ": New excercise in queue of " + kodillaStudent.getName() + "\n" +
                " (total: " + kodillaStudent.getExercises().size() + " exercises in student's queue)");
        updateCount++;
    }
}
