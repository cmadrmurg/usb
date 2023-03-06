public class Arco extends ArmaAtaque {
    float porcentajeAtque;

    public Arco() {
        this.porcentajeAtque = 0.15f;
    }

    public void equiparPersonaje(Personaje personaje) {
        personaje.puntosAtaque += personaje.puntosAtaque * porcentajeAtque;
    }

    public void activarAtaque(Personaje personaje) {
        personaje.ataqueArco = true;
    }
}
