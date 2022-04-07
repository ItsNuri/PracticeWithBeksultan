package com.company.Services;

import com.company.Pepositories.DriverRepositories;
import com.company.Pepositories.Models.Driver;

import java.util.List;

public class DiverService {

    private DriverRepositories driverRepositories = new DriverRepositories();

    public List<Driver> findAllDrivers() {
        return driverRepositories.getAllDrivers();
    }
}
