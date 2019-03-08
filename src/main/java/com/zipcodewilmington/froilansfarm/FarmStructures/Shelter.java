package com.zipcodewilmington.froilansfarm.FarmStructures;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter<T> {

    private List<T> inhabitants;

    public Shelter(){
        inhabitants = new ArrayList<>();
    }

    public Shelter(List<T> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void add(T inhabitant){
        inhabitants.add(inhabitant);
    }

    public void addAll(List<T> list){
        inhabitants.addAll(list);
    }

    public List<T> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<T> inhabitants) {
        this.inhabitants = inhabitants;
    }
}