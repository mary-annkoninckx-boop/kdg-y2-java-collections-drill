package Oefening02;

import java.util.*;

public class Run {

/*    👨‍💼 Oefening 2: Externe Sortering op Werknemers (Comparator)
    Doel: Objecten sorteren waarvan je de oorspronkelijke klasse niet mag of kunt aanpassen.

    Casus:
    Gegeven is een klasse Werknemer met naam en salaris. Je wilt een List<Werknemer> sorteren op salaris van laag naar hoog,
    maar de klasse Werknemer mag geen implements Comparable krijgen.

    Vragen:

    Welke interface gebruik je om een externe sorteerder te maken: Comparable of Comparator? Comparator
    Wat moet de methode compare(Werknemer w1, Werknemer w2) teruggeven als w1 minder verdient dan w2 en je van laag naar hoog wilt sorteren?*/


    public static void main(String[] args){

        //SOLUTION
        // 1. Maak een lijst met werknemers aan in willekeurige volgorde
        List<Werknemer> werknemers = new ArrayList<>();
        werknemers.add(new Werknemer("Bart", 4100.0));
        werknemers.add(new Werknemer("Cleo", 2800.50));
        werknemers.add(new Werknemer("An", 3200.0));
        werknemers.add(new Werknemer("Dirk", 2800.0));

        System.out.println("--- Vóór sortering ---");
        for (Werknemer w : werknemers) {
            System.out.println(w.getSalary());
        }

        // 2. Sorteer de lijst met jouw aangepaste Comparator
        // Optie A:
        Collections.sort(werknemers, new CompareSalary());
        // Optie B (modern alternative):
        // werknemers.sort(new CompareSalary());

        System.out.println("\n--- Na sortering (salaris laag -> hoog) ---");
        for (Werknemer w : werknemers) {
            System.out.println(w.getSalary());
        }
    }
}
