package com.example.planetapp;

public class Planet {
    private String planetName, noOfMoons;
    private int planetImg;

    //Constructor
    public Planet(String planetName, String noOfMoons, int planetImg){
        this.planetName = planetName;
        this.noOfMoons = noOfMoons;
        this.planetImg = planetImg;
    }

    //Getters & Setters

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setNoOfMoons() {
        this.noOfMoons = noOfMoons;
    }

    public void setPlanetImg(int planetImg) {
        this.planetImg = planetImg;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getNoOfMoons() {
        return noOfMoons;
    }

    public int getPlanetImg() {
        return planetImg;
    }
}
