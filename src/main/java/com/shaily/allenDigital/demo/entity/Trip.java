package com.shaily.allenDigital.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Builder
@EntityScan
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    private String tripId;
    private Driver driverAssigned;
    private Vehicle vehicleAssigned;
    private Boolean status;
}
