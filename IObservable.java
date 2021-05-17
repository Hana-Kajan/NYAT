package com.B191210556;

public interface IObservable {
    void addObserve(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}