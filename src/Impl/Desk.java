package Impl;

import Interfaces.IFurniture;
import Interfaces.IStoreStrategy;

public class Desk implements IFurniture {
    IStoreStrategy storeStrategy;

    public Desk(IStoreStrategy storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    @Override
    public void giveName() {
        System.out.println("Created Desk");
        storeStrategy.store();
    }
}
