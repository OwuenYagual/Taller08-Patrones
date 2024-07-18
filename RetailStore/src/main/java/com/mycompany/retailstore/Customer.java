package com.mycompany.retailstore;

public class Customer implements Observer{
    private String email;

    public Customer(String email) {
        this.email = email;
    }
    
    
    @Override
    public void update(String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }

    public void notifyCustomer(String approved_by_manager) {
        
        // LLAMAR AL METODO DE NOTIFICACION
        
    }
    
}
