package com.company.Pepositories;

import com.company.Exceptions.JsonFileNotFoundException;
import com.company.Pepositories.Models.Driver;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverRepositories {

    private static Map<Integer, Driver> driverMap = new HashMap<>();

    static {
        Gson gson = new Gson();
        JsonReader jsonReader = null;

        try {
            jsonReader = new JsonReader(
                    new FileReader("recources/drivers.json"));
        } catch (FileNotFoundException e) {
            throw new JsonFileNotFoundException(
                    "drivers.json does not exists");
        }

        Driver[] drivers = gson.fromJson(jsonReader, Driver[].class);
        for (Driver driver : drivers) {
            driverMap.put(driver.getId(), driver);
        }
    }

    public List<Driver> getAllDrivers() {
        return driverMap.values().stream().toList();
    }


}


//        try {
//            JsonReader jsonReader = new JsonReader(new FileReader("src/drivers.json"));
//            gson.fromJson(jsonReader,Driver[].class);
//        } catch (FileNotFoundException e) {
//            System.err.println("file drivers.json does not exists");
//        }
//file degen zherge fail zhazabyz
//gson.fromJson(file,Driver[].class);