package Impl;

import Interfaces.IFurniture;

public class Desk implements IFurniture {

    @Override
    public void giveName() {
        System.out.println("Created Desk");
    }
}
