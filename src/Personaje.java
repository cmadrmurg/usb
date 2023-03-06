import java.util.ArrayList;
import java.util.Scanner;

public class Personaje {
    String nombre;
    float puntosVida;
    float puntosAtaque;
    boolean proteccionArco;
    boolean proteccionMelee;
    boolean ataqueArco;
    boolean ataqueMelee;
    ArrayList<Arma> armas;

    public Personaje(String nombre, float puntosVida, float puntosAtaque) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        // poner boolean en false
        this.armas = new ArrayList<>();
    }

    public void equipar(Personaje personaje) {
        if (armas.isEmpty()) {
            System.out.println("no hay armas");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Que arma quieres equipar:");
            String armaEquipar = sc.nextLine();
            // TODO terminar
            for (Arma arma : armas) {
                arma.equiparPersonaje(personaje);
            }
        }
    }

    public void altaArma() {
        if (armas.size() < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==== Seleccione tipo de Arma ==== ");
            System.out.println("[1] Arco");
            System.out.println("[2] Espada");
            System.out.println("[3] Armadura");
            System.out.println("[4] Escudo");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    Arco arco = new Arco();
                    armas.add(arco);
                }
                case 2 -> {
                    Espada espada = new Espada();
                    armas.add(espada);
                }
                case 3 -> {
                    Armadura armadura = new Armadura();
                    armas.add(armadura);
                }
                case 4 -> {
                    Escudo escudo = new Escudo();
                    armas.add(escudo);
                }
                default -> System.out.println("opcion incorrecta");
            }
        }
    }

    public void quitarArma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que arma quieres eliminar:");
        String armaElimniar = sc.nextLine();
        boolean encontrado = false;

        for (Arma arma : armas) {
            if (arma.getClass().getSimpleName().equalsIgnoreCase(armaElimniar)) {
                this.armas.remove(arma);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Arma eliminada exitosamente");
        } else {
            System.out.println("Arma no encontrada");
        }
    }


}
