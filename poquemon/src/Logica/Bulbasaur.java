package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque Bulbasaur Placaje " );
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println(" Ataque Bulbasaur Arañazo" );

    }

    @Override
    protected void atacarMordisco() {
        System.out.println(" Ataque Bulbasaur Mordisco" );

    }

    @Override
    public void atacarDrenaje() {
        System.out.println(" Ataque Bulbasaur Drenaje" );

    }

    @Override
    public void atacarParalizar() {
        System.out.println(" Ataque Bulbasaur Paralizar" );

    }
}
