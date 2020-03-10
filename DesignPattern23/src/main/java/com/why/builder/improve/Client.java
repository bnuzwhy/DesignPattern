package com.why.builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);

        HighHouse highHouse = new HighHouse();
        houseDirector = new HouseDirector(highHouse);
        houseDirector.constructHouse();

    }
}
