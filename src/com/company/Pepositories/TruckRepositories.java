package com.company.Pepositories;

import com.company.Exceptions.JsonFileNotFoundException;
import com.company.Pepositories.Models.Truck;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TruckRepositories {

    Map<Integer, Truck> truckMap = new HashMap<>();

    public List<Truck> TruckRepositories() throws FileNotFoundException {
        Gson gson = new Gson();

        JsonReader jsonReader = null;

        try {
            jsonReader = new JsonReader(
                    new FileReader("recources/trucks.json"));
        } catch (FileNotFoundException e) {
            throw new JsonFileNotFoundException(
                    "trucks.json does not exists");
        }

        Truck[] trucks = gson.fromJson(jsonReader, Truck[].class);
        for (Truck truck : trucks) {
            truckMap.put(truck.getId(), truck);
        }

        public List<Truck> getAllTrucks
        () {
            return truckMap.values().stream().toList();
        }

    }
}
