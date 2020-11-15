package com.Ajit.factory;

import com.Ajit.service.SalesService;
import com.Ajit.service.TransactionService;

public class ObjectFactory {
    public static SalesService getSalesServiceInstance() {
        return SalesService.getInstance(TransactionService.getInstance());
    }
}
