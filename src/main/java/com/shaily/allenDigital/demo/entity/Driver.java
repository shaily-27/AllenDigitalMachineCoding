package com.shaily.allenDigital.demo.entity;

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
public class Driver {

    private String name;
    private String id;
    private Map<String, String> contactDetails;
    private Boolean ownsVehicle;
    private String vehicleAssigned;
    private Double distanceDriven;
    private Integer driverCancelledTrips;
    private Integer customerCancelledTrips;

    public  Driver(String name, Map<String, String> contactDetails, String vehicle) {
        Driver driver = new Driver.DriverBuilder().name(name).contactDetails(contactDetails).vehicleAssigned(vehicle).build();
    }

}
