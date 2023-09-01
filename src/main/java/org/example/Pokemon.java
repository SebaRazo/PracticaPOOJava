package org.example;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    //metodos abstractos
    protected  abstract void atacarPlacaje();
    protected  abstract void atacarAraniazo();
    protected  abstract void atacarMordisco();

}
