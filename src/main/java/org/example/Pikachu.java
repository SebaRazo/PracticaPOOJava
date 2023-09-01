package org.example;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Pikachu, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Pikachu, araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Pikachu, mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola Pikachu, trueno por interfaz");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola Pikachu, punio de trueno por interfaz");
    }
}
