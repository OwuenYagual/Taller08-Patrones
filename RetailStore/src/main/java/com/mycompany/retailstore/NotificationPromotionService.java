package com.mycompany.retailstore;

import java.util.ArrayList;
import java.util.List;

public class NotificationPromotionService implements Observable{
    private List<Observer> customerSubcribers;
    private String lastedPromotion = "";

    public NotificationPromotionService() {
        this.customerSubcribers = new ArrayList<>();
    }
    
    
    @Override
    public void notifyObservers() {
        for (Observer observer : customerSubcribers) {
            observer.update(this.lastedPromotion);
        }
    }

    @Override
    public void addObserver(Observer o) {
        customerSubcribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customerSubcribers.remove(o);
    }
    
    public void addPromotion(String message) {
        this.lastedPromotion = message;
        notifyObservers();
    }
    
}
