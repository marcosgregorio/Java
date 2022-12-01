package ExercícioComparavel;

public class Conjunto implements Comparavel {
    // public static void main(String[] args) {
    //     String data1 = "22/04/2003";
    //     String data2 = "22/06/2003";
    //     int valor = data1.compareTo(data2);
    //     System.out.println("asdsad "+ valor);
    // }
    private int elemento1;
    private int elemento2;

    Conjunto(int a, int b) {
        this.elemento1 = a;
        this.elemento2 = b;
    }

    public int soma() {
        return this.elemento1 + this.elemento2;
    }

    public boolean maior(Comparavel obj) {
        Conjunto num = (Conjunto) obj;
        if(this.soma() > num.soma())
            return true;
        return false;
    }

    public boolean menor(Comparavel obj) {
        Conjunto num = (Conjunto) obj;
        if(this.soma() < num.soma())
            return true;
        return false;
    }

    public boolean igual(Comparavel obj) {
        Conjunto num = (Conjunto) obj;
        if(this.soma() == num.soma())
            return true;
        return false;
    }

}
