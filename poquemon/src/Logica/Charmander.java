package Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(" Ataque Charmander Placaje ");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Ataque Charmander Arañazo ");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println(" Ataque Charmander Mordiszo ");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(" Ataque Charmander Puño Fuego ");

    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(" Ataque Charmander Lanza llamas ");

    }

    @Override
    public void atacarAscuas() {
        System.out.println(" Ataque Charmander Ascuas ");

    }
}
