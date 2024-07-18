package com.mycompany.retailstore;

import ec.edu.espol.strategypattern.NotificarStrategy;

public class Customer implements Observer{
    private String email;
    private NotificarStrategy notificationStrategy;

    public Customer(String email) {
        this.email = email;
    }
    public void setNotificationStrategy(NotificarStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
    
    @Override
    public void update(String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }

    public void notifyCustomer(String approved_by_manager) {
        
        // LLAMAR AL METODO DE NOTIFICACION
        
    }
    
}
