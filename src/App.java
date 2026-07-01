import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.Persona;
import controllers.PersonaController;

public class App {
    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<>(Arrays.asList(
            new Persona("Luis Torres", 15),
            new Persona("Luis Jimenez", 17), 
            new Persona("Sofia Vargas", 12),
            new Persona("Pedro Alvarado", 17),
            new Persona("Pedro Alvarado", 17), 
            new Persona("Valentina Cruz", 9),


            new Persona("Carlos Ruiz", 18), 
            new Persona("carlos ruiz", 18), 
            new Persona("Ana Gomez", 25),
            new Persona("Ana Silva", 25), 
            new Persona("Juan Perez", 30),
            new Persona("JUAN PEREZ", 30), 
            new Persona("Diego Suarez", 25),
            new Persona("Diego Suarez", 40), 
            new Persona("Lucia Nunez", 18),
            new Persona("lucia nunez", 19), 
            new Persona("Mateo Rojas", 64), 
            new Persona("Mateo Rojas", 64), 
            new Persona("Andres Molina", 35),
            new Persona("andres molina", 35),


            new Persona("Maria Silva", 65), 
            new Persona("Maria Lopez", 70), 
            new Persona("Elena Castro", 80),
            new Persona("Jorge Vargas", 66),
            new Persona("jorge perez", 66)  
        ));


        PersonaController controller = new PersonaController();


        System.out.println("=== PRUEBA MÉTODO 1: FILTRAR Y ORDENAR (>= 18) ===");

        Set<Persona> ordenadas = controller.filtrarYOrdenar(personas, 18);
        
        for (Persona p : ordenadas) {
            System.out.println("Edad: " + p.getEdad() + " | Nombre: " + p.getNombre());
        }

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("=== PRUEBA MÉTODO 2: AGRUPAR POR RANGO ETARIO ===");
        Map<String, Set<String>> agrupadas = controller.agruparPorRangoEdad(personas);
        
        for (Map.Entry<String, Set<String>> entry : agrupadas.entrySet()) {
            System.out.println("Grupo " + entry.getKey() + ": " + entry.getValue());
        }
    }
}