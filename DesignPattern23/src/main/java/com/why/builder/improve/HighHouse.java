package com.why.builder.improve;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼-打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼-砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼-盖房顶 ");
    }
}
