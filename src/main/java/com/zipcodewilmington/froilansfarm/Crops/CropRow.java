package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

public class CropRow   {
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    private boolean hasBeenFertilized;

    private List<Crop> crops;

    public CropRow(){
        crops = new ArrayList<>();
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void addCrop(Crop crop){
        crops.add(crop);
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public void removeCrops(Crop crop){

        crops.remove(crop);
    }
    public void removeCroprow(List<Crop> crops){

        crops.clear();
    }


}


