package com.shaily.allenDigital.demo.database;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.request.OnBoardDriverRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Log4j2
public class DriverRepository {

    private List<Driver> drivers;

    public DriverRepository() {
        this.drivers = new ArrayList<>();
    }

    public List<Driver> getAllDrivers() {
        return this.drivers;
    }

    public Driver getDriverDetailsByDriverName(String driverName) {
        for(Driver driver : drivers) {
            if(driver.getName().equals(driverName)) {
                return driver;
            } else {
                log.debug("Driver with name : " + driverName + " does not exist in the database!!");
            }
        }
        return null;
    }

    public String addDriver(OnBoardDriverRequest driver) {
        String response = "";
        try {
            this.drivers.add(driver.getDriver());
            response = "Driver added successfully!!";
        } catch(Exception e) {
            response = "Caught exception adding driver : " + e.getMessage();
        }
        return response;
    }
}
