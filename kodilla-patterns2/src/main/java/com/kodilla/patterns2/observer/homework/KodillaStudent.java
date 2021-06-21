package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaStudent implements KodillaObservable{

        private KodillaObserver mentor;
        private final List<String> exercise;
        private final String name;
        private final String surname;
        
    public KodillaStudent(String name, String surname) {
        exercise = new ArrayList<>();
        this.name = name;
        this.surname = surname;
    }

    public void addExcersize(String post) {
            exercise.add(post);
            notifyObservers();
        }

    public String getName() {
        return name + " " + surname;
    }

    public List<String> getExercises() {
        return exercise;
    }

    @Override
    public void registerMentor(KodillaObserver observer) {
        this.mentor = observer;
    }

    @Override
    public void notifyObservers() {
        mentor.update(this);
    }
}
