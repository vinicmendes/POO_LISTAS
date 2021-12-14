
package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro horário: ");
        System.out.println("Horas: ");
        int hora1 = scan.nextInt();
        System.out.println("Minutos: ");
        int minuto1 = scan.nextInt();
        System.out.println("Segundos: ");
        int segundo1 = scan.nextInt();
        
        System.out.println("Digite o segundo horário: ");
        System.out.println("Horas: ");
        int hora2 = scan.nextInt();
        System.out.println("Minutos: ");
        int minuto2 = scan.nextInt();
        System.out.println("Segundos: ");
        int segundo2 = scan.nextInt();
       
        int diferencaHora = Math.abs((hora2-hora1)*3600);
        int diferencaMinuto = Math.abs((minuto2-minuto1)*60);
        int diferencaSegundo = Math.abs((segundo2-segundo1));
        
        int total = (diferencaHora+diferencaMinuto+diferencaSegundo);
        System.out.println("Diferença total em segundos= "+total);
        
    }
}
