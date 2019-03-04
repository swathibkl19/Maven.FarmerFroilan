package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    private List<Crop> crops;

    public CropRow(){
        crops = new ArrayList<>();
    }

    public CropRow(List<Crop> crops) {
        this.crops = crops;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public void addCrop(Crop crop){
        crops.add(crop);
    }

    public Crop getCrop(int index){
        return crops.get(index);
    }
}