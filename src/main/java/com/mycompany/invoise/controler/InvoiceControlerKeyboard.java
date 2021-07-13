package com.mycompany.invoise.controler;

import com.mycompany.invoise.entity.Invoise;
import com.mycompany.invoise.service.InvoiseServiceInterface;

import java.util.Scanner;

public class InvoiceControlerKeyboard implements InvoiceControlerInterface{

    private InvoiseServiceInterface invoiseService;

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    public void createVoice (){

        System.out.println( "What is the customer name?" );

        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoise invoise = new Invoise();
        invoise.setCustomerName(customerName);
        invoiseService.createInvoise(invoise);
    }
}
