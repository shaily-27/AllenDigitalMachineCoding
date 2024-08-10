package com.shaily.allenDigital.demo.entity;

import com.shaily.allenDigital.demo.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Map;

@Data
@Builder
@EntityScan
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    private VehicleType type;
    private String id;
    private Map<String, String> vehicleDetails;
    private Driver driverAssigned;

    public Vehicle(String vehicleId, Map<String, String> vehicleDetails, VehicleType vehicleType) {
        this.id=vehicleId;
        this.vehicleDetails=vehicleDetails;
        this.type=vehicleType;
    }

    public Vehicle(String vehicleId) {
        Vehicle vehicle = new VehicleBuilder().id(vehicleId).build();
    }
}
