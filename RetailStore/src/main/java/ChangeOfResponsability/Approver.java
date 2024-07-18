/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChangeOfResponsability;

/**
 *
 * @author JAVIER
 */
public interface Approver {
    void setNextApprover(Approver approver);
    void approve(PurchaseRequest request);
    
}
