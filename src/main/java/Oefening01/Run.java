package Oefening01;

import java.util.*;

public class Run {


    public static void main(String[] args){

        List<Integer> postcodes = List.of(2000, 9000, 1000, 2000, 3000, 1000, 9000);

        //solution part 1 (Any Set removes doubles)
        Set<Postcode> postcodeSet = new HashSet<>();
        for (Integer postcode : postcodes) {
            postcodeSet.add(new Postcode(postcode));
        }

        for (Iterator<Postcode> iterator = postcodeSet.iterator(); iterator.hasNext(); ) { //not ideal here; for each is more readable. Included only for practice alt notation.
            System.out.println(iterator.next().getPostcode());
        }

        //solution part 2 (TreeSet orders automatically; but requires Postcode to be Comparable<Postcode>)
        Set<Postcode> postcodeTree = new TreeSet<Postcode>();
        for (Integer postcode : postcodes) {
            postcodeTree.add(new Postcode(postcode));
        }

        for (Postcode postcode : postcodeTree) {
            System.out.println(postcode.getPostcode());

        }

    }
}
