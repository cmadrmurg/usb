public class Armadura extends ArmaDefensa implements Arma {
    float porcentajeVida = 0.5f;

    public Armadura() {
        this.porcentajeVida = 0.5f;
    }

    public void equiparPersonaje(Personaje personaje) {
        personaje.puntosVida += personaje.puntosVida * porcentajeVida;
    }

    public void activarProteccion(Personaje personaje) {
        personaje.proteccionMelee = true;
    }
}
