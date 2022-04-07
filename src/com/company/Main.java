package com.company;

import com.company.Pepositories.DriverRepositories;
import com.company.Services.DiverService;
import com.company.Services.TruckService;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        final DiverService driverService = new DiverService();
        driverService.findAllDrivers().forEach(System.out::println);
        final TruckService truckService = new TruckService();

        truckService.findAllTruck().forEach(System.out::println);

    }
}
