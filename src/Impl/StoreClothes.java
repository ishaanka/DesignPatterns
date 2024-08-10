package Impl;

import Interfaces.IStoreStrategy;

public class StoreClothes implements IStoreStrategy {

    @Override
    public void store() {
        System.out.println("Storing Clothes");
    }
}
