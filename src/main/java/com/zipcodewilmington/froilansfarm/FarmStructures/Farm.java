package com.zipcodewilmington.froilansfarm.FarmStructures;


import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private FarmHouse farmHouse;
    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;
    private Field field;
    private List<FarmVehicle> farmVehicles;
    private Silo silo;


    public Farm() {
        farmHouse = new FarmHouse();
        field = new Field();
        chickenCoops = new ArrayList<>();
        stables = new ArrayList<>();
        farmVehicles = new ArrayList<>();
        silo = new Silo();

    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public void setFarmVehicles(List<FarmVehicle> farmVehicles) {
        this.farmVehicles = farmVehicles;
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo silo) {
        this.silo = silo;
    }
}
