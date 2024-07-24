package Logica;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println(" Ataque Squirtle placaje " );

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Ataque Squirtle Aralazo " );

    }

    @Override
    protected void atacarMordisco() {
        System.out.println(" Ataque Squirtle Mordisco " );

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(" Ataque Squirtle Hidrobomba " );

    }

    @Override
    public void atacarBurbuja() {
        System.out.println(" Ataque Squirtle Burbuja " );

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(" Ataque Squirtle Pistola Agua " );

    }
}
