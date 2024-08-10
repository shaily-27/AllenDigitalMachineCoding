package com.shaily.allenDigital.demo.service;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.entity.Vehicle;
import org.springframework.stereotype.Component;

@Component
public interface MappingService {

    void MapDriverToVehicle(Driver driver, Vehicle vehicle);
}
