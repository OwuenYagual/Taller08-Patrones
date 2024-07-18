/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfResponsability;

import com.mycompany.retailstore.Customer;

/**
 *
 * @author JAVIER
 */
public class PurchaseRequest {
    private double amount;
    private Customer customer;

    public PurchaseRequest(double amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    
}
