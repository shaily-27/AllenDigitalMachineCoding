package com.shaily.allenDigital.demo.database;

import com.shaily.allenDigital.demo.entity.Trip;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TripRepository {

    private List<Trip> trips;

    public TripRepository() {
        this.trips = new ArrayList<>();
    }

    public List<Trip> getAllTrips() {
        return this.trips;
    }

}
