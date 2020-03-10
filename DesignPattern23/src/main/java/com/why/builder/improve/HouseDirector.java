package com.why.builder.improve;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //1.通过构造器传入houseBuilder

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //2.或者通过setter传入houseBuilder
    public HouseDirector(){}
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
