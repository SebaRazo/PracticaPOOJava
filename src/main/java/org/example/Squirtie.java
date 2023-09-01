package org.example;

public class Squirtie extends Pokemon implements IAgua{
    public Squirtie() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Squirtie, placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Squirtie, araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Squirtie, mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola Squirtie, hidrobomba por interfaz");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola Squirtie, burbuja por interfaz");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola Squirtie, pistola de agua por interfaz");
    }
}
