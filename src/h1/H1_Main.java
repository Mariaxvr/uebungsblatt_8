package h1;

public class H1_Main {
    public static void main(String[] args) {

        Bruch b1 = new Bruch(25,5);
        Bruch b2 = new Bruch(15,9);
        Bruch b3 = new Bruch(5,3);

        b1.shorten();
        System.out.println(b1.zaehler + "/" + b1.nenner);

        System.out.println(b2.hasSameValueAs(b3));
    }
}
