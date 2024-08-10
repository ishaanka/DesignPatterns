package Impl;

import Interfaces.IFurniture;

public class Wardrobe implements IFurniture {

    @Override
    public void giveName() {
        System.out.println("Created Wardrobe");
    }
}
