package Logica;

public abstract class  Pokemon {
    /*las clases abstratas se caracterizan por el que es: atributos que todas las clases hijas van a heredar*/
    protected int numeroPokedex;
    protected String nombre;
    protected   double peso;
    protected String sexo;
    protected int temporada;

    /*Atributos abstratos*/
    protected abstract  void atacarPlacaje();
    protected abstract  void atacarAraniazo();
    protected abstract  void atacarMordisco();


}
