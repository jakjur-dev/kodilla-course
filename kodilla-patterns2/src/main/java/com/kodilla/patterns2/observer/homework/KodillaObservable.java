package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface KodillaObservable {

    void registerMentor(KodillaObserver observer);
    void notifyObservers();
}
