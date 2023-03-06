public class Espada extends ArmaAtaque implements Arma {
    float porcentajeAtque;

    public Espada() {
        this.porcentajeAtque = 0.4f;
    }

    public void equiparPersonaje(Personaje personaje) {
        personaje.puntosAtaque += personaje.puntosAtaque * porcentajeAtque;
    }

    public void activarAtaque(Personaje personaje) {
        personaje.ataqueMelee = true;
    }
}
