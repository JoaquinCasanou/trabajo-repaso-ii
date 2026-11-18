public class Main {
    public static void main(String[] args) {
        // ---------- Ejercicio 1: Jugador ----------
        System.out.println("=== Ejercicio 1: Jugador ===");
        Jugador j1 = new Jugador("Lucas");
        Jugador j2 = new Jugador("Marta");

        mostrarJugador(j1);
        mostrarJugador(j2);

        j1.ganarPuntos(50);
        j2.ganarPuntos(120);
        System.out.println("\nDespués de sumar puntos:");
        mostrarJugador(j1);
        mostrarJugador(j2);

        System.out.println("\nProbando validaciones:");
        j1.ganarPuntos(-10);   // debe rechazarse
        j1.subirNivel();       // sube de a uno
        mostrarJugador(j1);
        mostrarJugador(j2);

        // ---------- Ejercicio 2: Persona, Docente, Preceptor ----------
        System.out.println("\n=== Ejercicio 2: Persona / Docente / Preceptor ===");
        Docente docente = new Docente("Ana Pérez", 40, "Matemática");
        Preceptor preceptor = new Preceptor("Carlos Gómez", 35, "5° 3°");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        System.out.println("\nModificando la edad del docente con el setter:");
        docente.setEdad(41);
        docente.mostrarInformacion();

        System.out.println("\nProbando validación de edad negativa:");
        docente.setEdad(-5);
        docente.mostrarInformacion();
    }

    private static void mostrarJugador(Jugador j) {
        System.out.println("Jugador: " + j.getNombre() + " | Nivel: " + j.getNivel() + " | Puntos: " + j.getPuntos());
    }
}
