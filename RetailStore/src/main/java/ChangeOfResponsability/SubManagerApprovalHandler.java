/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfResponsability;

/**
 *
 * @author JAVIER
 */
public class SubManagerApprovalHandler implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approve(PurchaseRequest request) {
        if (request.getAmount() < 2000) {
            System.out.println("Approved by sub-manager.");
            request.getCustomer().notifyCustomer("Approved by sub-manager.");
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        }
    }
}
