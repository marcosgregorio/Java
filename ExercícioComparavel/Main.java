package ExercícioComparavel;

public class Main {
    public static void main(String[] args) {
       Conjunto conj1 = new Conjunto(2 , 3); 
       Conjunto conj2 = new Conjunto(5 , 4); 
       System.out.println("É maior: "+conj1.maior(conj2));
       System.out.println("É menor: "+conj1.menor(conj2));
       System.out.println("É igual: "+conj1.igual(conj2));
    //    -----------------------------------------------
        System.out.println("Data: ");
        Data data1 = new Data(22, 4, 2003);
        Data data2 = new Data(22, 4, 2002);
        System.out.println("É maior: "+data1.maior(data2));
        System.out.println("É menor: "+data1.menor(data2));
        System.out.println("É igual: "+data1.igual(data2));
    }
}
