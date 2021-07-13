package com.mycompany.invoise.controler;

import com.mycompany.invoise.entity.Invoise;
import com.mycompany.invoise.service.InvoiseServiceInterface;


public class InvoiceControlerWeb implements InvoiceControlerInterface {

    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    public void createVoice(){


        String customerName = "Tesla";
        Invoise invoise = new Invoise();
        invoise.setCustomerName(customerName);


        invoiseService.createInvoise(invoise);
    }
}
