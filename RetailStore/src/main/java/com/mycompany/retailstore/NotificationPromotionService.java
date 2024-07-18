package com.mycompany.retailstore;

import java.util.ArrayList;
import java.util.List;

public class NotificationPromotionService implements Observable{
    private List<Observer> observers;
    public String promotionMessage;

    public NotificationPromotionService() {
        this.observers = new ArrayList<>();
    }
    
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(promotionMessage);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    public void setPromotionMessage(String promotionMessage) {
        this.promotionMessage = promotionMessage;
        notifyObservers();
    }
    
}
