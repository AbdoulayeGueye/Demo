package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoise;

import java.util.ArrayList;
import java.util.List;

public class InvoiseRepositoryMemory implements InvoiseRepositoryInterface {

    public static List<Invoise> invoices = new ArrayList<>();
    public void create(Invoise invoise){
        invoices.add(invoise);
        System.out.println("Invoise added with number" +invoise.getNumber()+ " for "+invoise.getCustomerName());
    }
}
