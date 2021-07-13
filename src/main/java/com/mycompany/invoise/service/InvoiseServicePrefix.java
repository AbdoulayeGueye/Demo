package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoise;
import com.mycompany.invoise.repository.InvoiseRepositoryInterface;

import java.io.File;


public class InvoiseServicePrefix implements InvoiseServiceInterface{

    private long lastNumber;
    private String prefix;

    private InvoiseRepositoryInterface invoiseRepository ;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public void createInvoise(Invoise invoise) {
        invoise.setNumber(toString().valueOf(prefix+(++lastNumber)));
        invoiseRepository.create(invoise);

    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
