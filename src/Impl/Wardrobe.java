package Impl;

import Interfaces.IFurniture;
import Interfaces.IStoreStrategy;

public class Wardrobe implements IFurniture {
    IStoreStrategy storeStrategy;

    public Wardrobe(IStoreStrategy storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    @Override
    public void giveName() {
        System.out.println("Created Wardrobe");
        storeStrategy.store();
    }
}
