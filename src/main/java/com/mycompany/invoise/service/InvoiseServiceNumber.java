package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoise;

import com.mycompany.invoise.repository.InvoiseRepositoryInterface;


public class InvoiseServiceNumber implements InvoiseServiceInterface{

    private static long lastNumber=0L;

    private InvoiseRepositoryInterface invoiseRepository ;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public void createInvoise(Invoise invoise) {
        invoise.setNumber(toString().valueOf(++lastNumber));
        invoiseRepository.create(invoise);



    }
}
