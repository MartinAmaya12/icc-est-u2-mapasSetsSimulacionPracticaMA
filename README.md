## Evaluacion 
**Nombre:** Martin Amaya
**Fecha:** 30/06/2026

**Metodo 1:**
Para este metodo se utilizo un TreeSet porque resuelve lo siguiente: evita que se guarden personas repetidas y mantiene los elementos ordenados automaticamente a medida que se van agregando.

```
public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edad){
        Set<Persona> personasFiltradas = new TreeSet<>(
            (p1, p2)-> {
            int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
            if(compEdad != 0){
                return compEdad;
            }
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        });

        for(Persona persona : personas){
            if(persona.getEdad() >= edad){
                personasFiltradas.add(persona);
            }
        }

         return personasFiltradas;
    }

```

**Metodo 2:**

Para implementar el mapa se uso un TreeMap, ya que me garantizaba que las claves se ordenaran alfabeticamente de forma automatica, y para los valores asociados a esas claves, se uso un LinkedHashSet porque permite resolver: guardar nombres unicos (sin duplicados) y respetar el orden exacto en el que fueron ingresados originalmente en cada categoria.
```
public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas){
        Map<String, Set<String>> personasAgrupadas = new TreeMap<>();
        
        personasAgrupadas.put("JOVEN", new LinkedHashSet<String>());
        personasAgrupadas.put("ADULTO", new LinkedHashSet<String>());
        personasAgrupadas.put("MAYOR", new LinkedHashSet<String>());
        
        for(Persona persona : personas){
            int edad = persona.getEdad();
            String primerNombre = persona.getNombre().split(" ")[0]; 
            
            if (edad < 18) {
                personasAgrupadas.get("JOVEN").add(primerNombre);
            } else if (edad < 65) {
                personasAgrupadas.get("ADULTO").add(primerNombre);
            } else {
                personasAgrupadas.get("MAYOR").add(primerNombre);
            }
        }
        
        return personasAgrupadas;
    }

```