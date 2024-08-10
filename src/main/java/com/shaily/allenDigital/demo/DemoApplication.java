package com.shaily.allenDigital.demo;

import com.shaily.allenDigital.demo.database.DriverRepository;
import com.shaily.allenDigital.demo.database.VehicleRepository;
import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.entity.Vehicle;
import com.shaily.allenDigital.demo.enums.VehicleType;
import com.shaily.allenDigital.demo.request.OnBoardDriverRequest;
import com.shaily.allenDigital.demo.request.OnBoardVehicleRequest;
import com.shaily.allenDigital.demo.service.OnBoardingService;
import com.shaily.allenDigital.demo.service.impl.BillingServiceImpl;
import com.shaily.allenDigital.demo.service.impl.OnBoardingServiceImpl;
import com.shaily.allenDigital.demo.strategy.DistanceBasedBillingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		System.out.println("Hello world!");
		DriverRepository driverRepo = new DriverRepository();
		VehicleRepository vehicleRepo = new VehicleRepository();
		OnBoardingServiceImpl onBoardingService = new OnBoardingServiceImpl(driverRepo, vehicleRepo);


		//Onboard driver
		Map<String, String> driverDetails = new HashMap<>();
		driverDetails.put("phone", "6387452540");
		Driver driver1 = new Driver("Shaily", driverDetails, "KA-01-2222");
		onBoardingService.onBoardDriver(new OnBoardDriverRequest(driver1));

		//Onboard vehicle
		Map<String, String> vehicleDetails = new HashMap<>();
		vehicleDetails.put("name", "Maruti");
		Vehicle vehicle1 = new Vehicle("KA-01-2222", vehicleDetails, VehicleType.ECONOMY);
		driver1.getVehicleAssigned().setType(VehicleType.ECONOMY);
		driver1.setDistanceDriven(20.0);
		onBoardingService.onBoardVehicle(new OnBoardVehicleRequest(vehicle1));

		//Add driver cancellation count
		driver1.setDriverCancelledTrips(2);
		//Add customer cancellation count
		driver1.setCustomerCancelledTrips(3);
		driver1.setDriverCancelledTrips(20);

		//GetBill
		DistanceBasedBillingStrategy distanceBasedBillingStrategy = new DistanceBasedBillingStrategy(driverRepo);
		BillingServiceImpl billingService = new BillingServiceImpl(distanceBasedBillingStrategy);
		Double bill = billingService.getBill(driver1);
		System.out.println("Bill for driver1 with details : " + driver1 + " is : " + bill);

	}

}
