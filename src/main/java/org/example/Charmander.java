package org.example;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Charmander, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Charmander, araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Charmander, mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola Charmander, punio de fuego por interfaz");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola Charmander, lanza llamas por interfaz");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola Charmander, ascuas por interfaz");
    }
}
