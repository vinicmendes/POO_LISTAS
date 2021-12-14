package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 1000: ");
        int N = scan.nextInt();
        
        if(N < 0 || N > 1000){
            System.out.println("Digite um numero valido ao executar novamente.");
        }else{
            int i;
            int maior = 0;
            int menor = 0;
            int media = 0;
            int pares = 0;
            int impares = 0;
            for(i=0;i< N; i++){
                System.out.print("Insira um numero= ");
                int numerosInt = scan.nextInt();
                if(i == 0){
                    maior = numerosInt;
                    menor = numerosInt;
                }
                if(numerosInt > maior){
                    maior = numerosInt;
                }if(numerosInt < menor){
                    menor = numerosInt;
                }
                media += numerosInt;
                
                if((numerosInt&2) == 0){
                    pares ++;
                }else{
                    impares++;
                }
            }
            media = media/N;
            System.out.println("Maior= "+maior);
            System.out.println("Menor= "+menor);
            System.out.println("Media aritmética= "+media);
            System.out.println("Numeros pares= "+pares);
            System.out.println("Numeros impares= "+impares);
        }
    }
}
