package observerPattern;

import java.util.*;

class Grade implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String studentName;
    private double score;

    public Grade(String studentName, double score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setScore(double score) {
        this.score = score;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(studentName, score);
        }
    }
}
