package com.mycompany.invoise.controler;

import com.mycompany.invoise.entity.Invoise;
import com.mycompany.invoise.service.InvoiseServiceInterface;

public class InvoiceControllerDouchette implements InvoiceControlerInterface {

    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }
    @Override
    public void createVoice() {
        System.out.println("Usage of a scanner");
        Invoise invoise= new Invoise();
        invoise.setCustomerName("Virgin Galactic");
        invoiseService.createInvoise(invoise);

    }
}
