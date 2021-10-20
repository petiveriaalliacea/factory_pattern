package com.company;

public class NikeSneakersFactory implements SneakersFactory{
    @Override
    public Sneakers createSneakers() {
        return new Nike();
    }
}
