package Camp;

import java.util.Scanner;

public class Teste {
    public static Acampamento[] vetor = new Acampamento[10];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Insira um nome: ");
            String nome = s.next();
            System.out.println("Insira uma idade: ");
            int idade = s.nextInt();
            s.nextLine();
            vetor[i] = new Acampamento(nome, idade);
            vetor[i].definirEquipe();
            System.out.println(vetor[i].toString());
        }
        s.close();
    }
}
