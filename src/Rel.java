
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Rel {

    int ListSize = 5;
    Integer[] OgLIST = new Integer[ListSize];

    public void set(int ListSize, int number, int ind) {

        OgLIST[ListSize] = number;
        System.out.println(OgLIST[ind]);

    }

    public void remove(int ind) {

        OgLIST[ind] = null;
        System.out.println(OgLIST[ind]);
    }

    public void get(int ind) {

        System.out.println(OgLIST[ind]);

    }

    public void size() {

        System.out.println(ListSize);

    }

    public void add(int a, int ind) {
        if (OgLIST[ind] != null) {
            System.out.println("Неправиьный индекс");
            System.exit(0);
        }
        OgLIST[ind] = a;
        System.out.println(OgLIST[ind]);

    }

    public void clear(int ind) {
        for (int i = 0; i < OgLIST.length - 1; i++) {
            OgLIST[i] = null;
            System.out.println(OgLIST[i]);
        }
    }
}

