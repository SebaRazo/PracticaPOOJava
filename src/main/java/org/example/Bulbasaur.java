package org.example;

public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Bulbasaur, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Bulbasaur, araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Bulbasaur, mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola Bulbasaur, drenaje por interfaz");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola Bulbasaur, paralizar por interfaz");
    }
}
