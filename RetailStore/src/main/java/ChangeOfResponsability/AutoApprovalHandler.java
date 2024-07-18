/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfResponsability;

/**
 *
 * @author JAVIER
 */
public class AutoApprovalHandler implements Approver{
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approve(PurchaseRequest request) {
        if (request.getAmount() < 500) {
            System.out.println("Approved automatically.");
            request.getCustomer().notifyCustomer("Approved automatically.");
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        }
    }
}
