import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        Scanner s;
        Apolice obj;
        s = new Scanner(System.in);
        obj = new Apolice();
        System.out.println("Insira o nome: ");
        obj.nomeSegurado = s.next();
        System.out.println("Insira a idade: ");
        obj.idade = s.nextInt();    
        System.out.println("Insira o valor do premio    : ");
        obj.valorPremio = s.nextDouble();
        obj.calcularPremio();
        obj.imprimir();

        System.out.println("Selecione uma cidade: ");
        String cidade = s.next();
        obj.oferecerDesconto(cidade);
        obj.imprimir();
        obj.exibeUltimoNum();

        //Nova apolice
        System.out.println("nova apolice");
        Apolice newObject = new Apolice( "Andressa", 25, 10);
        newObject.calcularPremio();
        newObject.imprimir();

        System.out.println("Selecione uma cidade: ");
        String cidade2 = s.next();
        newObject.oferecerDesconto(cidade2);
        newObject.imprimir();
        newObject.exibeUltimoNum();
    }
}
