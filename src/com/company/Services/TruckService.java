package com.company.Services;

import com.company.Pepositories.Models.Truck;
import com.company.Pepositories.TruckRepositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class TruckService {

    private TruckRepositories truckRepositories;

    public TruckService() throws FileNotFoundException {
        truckRepositories = new TruckRepositories();
    }

    public List<Truck> findAllTruck() {
        return truckRepositories.getAllTrucks();
    }
}
