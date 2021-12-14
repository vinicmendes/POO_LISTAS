package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_02 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numerador: ");
        float numerador = scan.nextFloat();
        System.out.println("Digite o denominador: ");
        float denominador = scan.nextFloat();
        
        if(denominador == 0){
            System.out.println("Insira um denominador diferente de 0: ");
        }else{
            float total = (numerador / denominador);
            System.out.println("O resultado = "+total);
        }
    }
}
