package Logica;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Pikachu Placaje" );

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Ataque Pikachu Arañazo" );

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque Pikachu Mordisco" );

    }

    @Override
    public void atacarImpatrueno() {
        System.out.println("Ataque Pikachu Impatrueno" );

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Ataque Pikachu Puño Trueño" );

    }
}
