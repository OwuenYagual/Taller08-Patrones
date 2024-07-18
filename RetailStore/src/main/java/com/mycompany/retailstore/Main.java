package com.mycompany.retailstore;

import ChangeOfResponsability.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Configurar la cadena de responsabilidad
        Approver autoApprovalHandler = new AutoApprovalHandler();
        Approver supervisorHandler = new SupervisorApprovalHandler();
        Approver subManagerHandler = new SubManagerApprovalHandler();
        Approver managerHandler = new ManagerApprovalHandler();

        autoApprovalHandler.setNextApprover(supervisorHandler);
        supervisorHandler.setNextApprover(subManagerHandler);
        subManagerHandler.setNextApprover(managerHandler);

        // Configurar el cliente y la estrategia de notificación
        Customer customer = new Customer("cliente@mail.com");
        
        // Implementar estrategia de notificacion
//        customer.setNotificationStrategy(new WhatsappNotificationStrategy());

        // Simulación de una solicitud de compra
        PurchaseRequest request = new PurchaseRequest(1500, customer);
        autoApprovalHandler.approve(request);
        
        
    }
    
}
