package com.shaily.allenDigital.demo.service.impl;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.service.BillingService;
import com.shaily.allenDigital.demo.strategy.DistanceBasedBillingStrategy;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class BillingServiceImpl implements BillingService {

    private DistanceBasedBillingStrategy distanceBasedBillingStrategy;

    @Autowired
    public BillingServiceImpl(DistanceBasedBillingStrategy distanceBasedBillingStrategy) {
        this.distanceBasedBillingStrategy = distanceBasedBillingStrategy;
    }

    @Override
    public Double getBill(Driver driver) {
        if(driver==null) {
            return 0.0;
        }
        return distanceBasedBillingStrategy.getDriverBill(driver.getName());
    }
}
