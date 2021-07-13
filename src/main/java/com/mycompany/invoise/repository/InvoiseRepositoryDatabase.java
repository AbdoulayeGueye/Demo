package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoise;

import java.util.ArrayList;
import java.util.List;

public class InvoiseRepositoryDatabase implements InvoiseRepositoryInterface {


    public void create(Invoise invoise){
       /* invoices.add(invoise);*/
        System.out.println("Database: Invoise added with number" +invoise.getNumber()+ " for "+invoise.getCustomerName());
    }
}
