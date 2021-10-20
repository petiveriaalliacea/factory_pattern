package com.company;

public class AdidasSneakersFactory implements SneakersFactory{
    @Override
    public Sneakers createSneakers() {
        return new Adidas();
    }
}
