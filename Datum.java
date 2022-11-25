import java.util.Arrays;

public class Datum implements Comparable<Datum>{
    int den;
    int mesic;
    int rok;

    public Datum(int den, int mesic, int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return den + ". " + mesic + ". " + rok;
    }

    @Override
    public int compareTo(Datum o) {
        if(rok<o.rok){
            return -1;
        }
        if(rok>o.rok){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Datum[] arr = {
                new Datum(25,11,2022),
                new Datum(31,12,2005),
                new Datum(14,2,2022),
                new Datum(18,3,2005),
                new Datum(6,5,1977)
        };

        Arrays.sort(arr);
        for (Datum d:arr){
            System.out.println(d);
        }
    }

}
