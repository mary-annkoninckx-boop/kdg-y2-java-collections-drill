package Oefening02;

import java.util.Comparator;

public class CompareSalary implements Comparator<Werknemer> {

    @Override
    public int compare(Werknemer me, Werknemer other) {

        //Modern
        return Double.compare(me.getSalary(), other.getSalary());

        //Logic
/*        if (me.getSalary() > other.getSalary()){
            return 1; //ezelbrug  me > other == Number 1
        }

        if (me.getSalary() < other.getSalary()){
            return -1; // *POIN POoin pooooii..n* ~*~ [SAD TROMBONE]
        }
        return 0; //same return 0*/
    }
}
