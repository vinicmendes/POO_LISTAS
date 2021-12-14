
package lista01_poo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_10 {
    public static void main(String[] args) {
        int numeroObjetivo = new Random().nextInt(99) + 1;
        System.out.println("Num random = "+numeroObjetivo);
        System.out.print("Digite um numero: ");
        Scanner scan = new Scanner(System.in);
        int numeroUsuario = scan.nextInt();
        int novoPalpite;
        while(numeroUsuario != numeroObjetivo){
            if(numeroUsuario > numeroObjetivo){
                System.out.println("Tente um numero menor!");
                System.out.print("Digite um novo numero: ");
                novoPalpite = scan.nextInt();
                numeroUsuario = novoPalpite;
            }if(numeroUsuario < numeroObjetivo){
                System.out.println("Tente um numero Maior!");
                System.out.print("Digite um novo numero: ");
                novoPalpite = scan.nextInt();
                numeroUsuario = novoPalpite;
            }
        }
        if(numeroUsuario == numeroObjetivo){
                System.out.println("Parabens, voce acertou!!");
            }
        

    }
}
