package com.mycompany.invoise.controler;

import com.mycompany.invoise.service.InvoiseServiceInterface;

public interface InvoiceControlerInterface {
    void createVoice ();
    void setInvoiseService(InvoiseServiceInterface invoiseService);
}
