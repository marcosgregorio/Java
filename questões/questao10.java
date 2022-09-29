import java.util.Arrays;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++)
                matriz[i][j] = scanner.nextInt();
        }
        for(int i=1; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.printf("%d",matriz[i][j]);
                    soma += matriz[i][j];
            }
            System.out.printf("%n");
        }
        System.out.println("SOMA DAS DIAGONAIS: "+soma);
    }
}
