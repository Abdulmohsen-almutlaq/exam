package org.example;

public class classicFactory extends abstractFactory{
    @Override
    public build chair() {
        return new classicChairs();
    }

    @Override
    public build Table() {
        return new classicTables();
    }
}
