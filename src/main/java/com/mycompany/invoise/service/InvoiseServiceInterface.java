package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoise;
import com.mycompany.invoise.repository.InvoiseRepositoryInterface;

public interface InvoiseServiceInterface {
    void createInvoise(Invoise invoise);
    void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository);
}
