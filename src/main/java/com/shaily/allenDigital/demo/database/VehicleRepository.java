package com.shaily.allenDigital.demo.database;

import com.shaily.allenDigital.demo.entity.Vehicle;
import com.shaily.allenDigital.demo.request.OnBoardVehicleRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    private List<Vehicle> vehicles;

    public VehicleRepository() {
        this.vehicles = new ArrayList<>();
    }

    public List<Vehicle> getAllVehicles() {
        return this.vehicles;
    }

    public List<Vehicle> getAllBars() {
        //update the logic to filter all cabs
        return this.vehicles;
    }

    public String addVehicle(OnBoardVehicleRequest vehicleRequest) {
        String response = "";
        try {
            this.vehicles.add(vehicleRequest.getVehicle());
            response = "Vehicle added successfully!!";
        } catch(Exception e) {
            response = "Caught exception adding vehicle : " + e.getMessage();
        }
        return response;
    }
}
