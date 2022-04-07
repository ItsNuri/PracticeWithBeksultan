package com.company.dto.Truck;

import com.company.Enums.State;
import com.company.Pepositories.Models.Driver;

public class dto {
    private Integer id;
    private String name;
    private Driver driver;
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "dto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver=" + driver +
                ", state='" + state + '\'' +
                '}';
    }
}
