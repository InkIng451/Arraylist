import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList OgLIST = new ArrayList();

        System.out.println(" ");
        System.out.println(OgLIST.size());

        OgLIST.add(0, 1);
        OgLIST.add(1, 2);
        OgLIST.add(2, 3);
        OgLIST.add(3, 4);
        OgLIST.add(4, 5);

        System.out.println(" ");
        System.out.println(OgLIST.size());

        System.out.println(" ");
        System.out.println(OgLIST.get(4));

        OgLIST.remove(1);

        System.out.println(" ");
        System.out.println(OgLIST.get(1));

        OgLIST.set(3,5);
        OgLIST.clear();

        System.out.println(" ");
        System.out.println(OgLIST.size());
    }
}

