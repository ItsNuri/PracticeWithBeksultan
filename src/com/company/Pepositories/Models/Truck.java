package com.company.Pepositories.Models;

import com.company.Enums.State;

public class Truck {
    private Integer id;
    private String name;
    private Driver driver;
    private State state;

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (state.equals("on_the_base")) {
            this.state = State.ON_BASE;
        }else if (state.equals("on_the_road")) {
            this.state = State.ON_THE_ROAD;
        }else if (state.equals("on_the_repair")) {
            this.state = State.ON_THE_REPAIR;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver=" + driver +
                ", state=" + state +
                '}';
    }
}
