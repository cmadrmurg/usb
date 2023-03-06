public class Escudo extends ArmaDefensa implements Arma {
    float porcentajeVida;

    public Escudo() {
        this.porcentajeVida = 0.1f;
    }

    public void equiparPersonaje(Personaje personaje) {
        personaje.puntosVida += personaje.puntosVida * porcentajeVida;
    }

    public void activarProteccion(Personaje personaje) {
        personaje.proteccionArco = true;
    }
}
