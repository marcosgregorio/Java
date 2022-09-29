import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class questao9 {
    public static void main(String[] args){
        int[] vetor = new int[100];
        int media = 0;
        for(int i=0; i<vetor.length; i++){
           vetor[i] = 1 + (int)(Math.random()*100);
            media+=vetor[i];
        }
        media = media /100;
        System.out.println("A media é: "+media);
        System.out.println(" ");
        System.out.println("Números abaixo da média: ");
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] < media)
                System.out.print(vetor[i]+" ");
            }
        // System.out.println(Arrays.toString(vetor));
    }
    
}