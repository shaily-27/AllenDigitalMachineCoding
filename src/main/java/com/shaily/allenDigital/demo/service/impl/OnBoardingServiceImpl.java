package com.shaily.allenDigital.demo.service.impl;

import com.shaily.allenDigital.demo.database.DriverRepository;
import com.shaily.allenDigital.demo.database.VehicleRepository;
import com.shaily.allenDigital.demo.request.OnBoardDriverRequest;
import com.shaily.allenDigital.demo.request.OnBoardVehicleRequest;
import com.shaily.allenDigital.demo.service.OnBoardingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class OnBoardingServiceImpl implements OnBoardingService {
    private DriverRepository driverRepository;
    private VehicleRepository vehicleRepository;

    public OnBoardingServiceImpl(DriverRepository driverRepository, VehicleRepository vehicleRepository) {
        this.driverRepository = driverRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public String onBoardDriver(OnBoardDriverRequest request) {
        return driverRepository.addDriver(request);
    }

    @Override
    public String onBoardVehicle(OnBoardVehicleRequest request) {
        return vehicleRepository.addVehicle(request);
    }
}
