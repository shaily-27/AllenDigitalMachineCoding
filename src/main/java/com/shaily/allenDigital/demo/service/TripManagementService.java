package com.shaily.allenDigital.demo.service;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.entity.Trip;
import org.springframework.stereotype.Component;

@Component
public interface TripManagementService {

    String addTrip(Trip trip, Driver driver);
}
