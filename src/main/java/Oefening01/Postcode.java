package Oefening01;

import java.util.Objects;

public class Postcode implements Comparable<Postcode> {
    private int postcode;

    Postcode(int postcode){
        this.postcode = postcode;
    }

    public int getPostcode(){
        return postcode;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Postcode postcode1)) return false;
        return postcode == postcode1.postcode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postcode);
    }

    @Override
    public int compareTo(Postcode other) {
        //Modern alternative **(returns an int -- NOT a boolean!!)
        // return (Integer.compare(this.postcode, other.postcode);

        // Beter because:
        // shorter + avoids risks with very big numbers.
        // BUT. Use ifs - until you feel like you can dream the return value logic

        if (this.postcode - other.postcode > 0){
            return 1;
        }
        if (this.postcode - other.postcode < 0){
            return -1;
        }
        return 0;
    }
}
