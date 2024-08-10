package com.shaily.allenDigital.demo.strategy;

import com.shaily.allenDigital.demo.database.DriverRepository;
import com.shaily.allenDigital.demo.entity.Driver;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class DistanceBasedBillingStrategy implements BillingStrategy{

    private DriverRepository driverRepository;

    @Autowired
    public DistanceBasedBillingStrategy(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public Double getTotalCancellationAmount(String driverName) {
        Driver driver = driverRepository.getDriverDetailsByDriverName(driverName);
        Double cancellationFee = 10.0;
        System.out.println("cancellationFee : " + ((-1)*driver.getDriverCancelledTrips() + driver.getCustomerCancelledTrips())*cancellationFee);
        return ((-1)*driver.getDriverCancelledTrips() + driver.getCustomerCancelledTrips())*cancellationFee;
    }

    public Double getDriverBill(String driverName) {
        Driver driver = driverRepository.getDriverDetailsByDriverName(driverName);
        Double totalCancellationAmount = getTotalCancellationAmount(driverName);
        Double basePayPerKm = 0.0;
        switch (driver.getVehicleAssigned().getType()) {
            case ECONOMY :
                basePayPerKm=5.0;
                break;

            case PREMIUM :
                basePayPerKm=12.0;
                break;

            case LUXURY :
                basePayPerKm=15.0;
        }
        System.out.println("basePayPerKm : " + basePayPerKm);
        Double totalPayForDistanceDrive = basePayPerKm*driver.getDistanceDriven() + totalCancellationAmount;

        System.out.println(" totalPayForDistanceDrive : " + totalPayForDistanceDrive);
        return totalPayForDistanceDrive;
    }
}
