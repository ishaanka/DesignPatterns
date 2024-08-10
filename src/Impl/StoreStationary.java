package Impl;

import Interfaces.IStoreStrategy;

public class StoreStationary implements IStoreStrategy {

    @Override
    public void store() {
        System.out.println("Storing Stationary");
    }
}
