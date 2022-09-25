import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class questao8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[10];
        int menor = 100;
        int maior = 100;
        for (int i = 0;i < 10;i++){
            vetor[i] = s.nextInt();
            if(vetor[i] < menor)
                menor = vetor[i];
            if(vetor[i] > maior)
                maior = vetor[i];    
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println("menor: "+menor);
        System.out.println("maior: "+maior);
        s.close();
    }
}
