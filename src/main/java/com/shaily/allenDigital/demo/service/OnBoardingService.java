package com.shaily.allenDigital.demo.service;

import com.shaily.allenDigital.demo.request.OnBoardDriverRequest;
import com.shaily.allenDigital.demo.request.OnBoardVehicleRequest;
import org.springframework.stereotype.Component;

@Component
public interface OnBoardingService {

    String onBoardDriver(OnBoardDriverRequest request);
    String onBoardVehicle(OnBoardVehicleRequest request);
}
