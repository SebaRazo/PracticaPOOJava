package org.example;

public class Main {
    public static void main(String[] args) {
        //creacion de pokemones en forma de objetos
        Squirtie squirtie= new Squirtie();
        Charmander charmander= new Charmander();
        Pikachu pikachu= new Pikachu();
        Bulbasaur bulbasaur= new Bulbasaur();

        squirtie.atacarAraniazo();
        squirtie.atacarHidrobomba();
        squirtie.atacarMordisco();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarAraniazo();
        pikachu.atacarImpactrueno();
        pikachu.atacarAraniazo();
        pikachu.atacarPlacaje();

    }
}