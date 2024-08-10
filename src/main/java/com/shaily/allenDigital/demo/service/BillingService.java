package com.shaily.allenDigital.demo.service;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.enums.ComputationDuration;
import org.springframework.stereotype.Component;

@Component
public interface BillingService {

    Double getBill(Driver driver);
}
