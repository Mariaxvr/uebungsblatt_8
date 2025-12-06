package h1;

public class Bruch {
    int zaehler;
    int nenner;

    Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    private static int ggT(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        while (y!=0) {
            int rest = x % y;
            x = y;
            y = rest;
        }
        return x;
    }
    public void shorten(){
        int g = ggT(zaehler, nenner);
        if (g==0)
            return;
        this.zaehler = this.zaehler / g;
        this.nenner = this.nenner / g;
    }
    public boolean hasSameValueAs(Bruch b){
        return this.zaehler * b.nenner == this.nenner * b.zaehler;
    }
}
