package org.example;

public class ModernFactory extends abstractFactory{
    @Override
    public build chair() {
        return new ModernChairs();
    }

    @Override
    public build Table() {
        return new ModernTables();
    }
}
