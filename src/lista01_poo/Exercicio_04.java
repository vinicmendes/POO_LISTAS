
package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de um mes (Exemplo: Janeiro): ");
        String mes = scan.nextLine();
        
        switch (mes){
            case "Janeiro":
                System.out.println("Numero equivalente: 1");
                break;
            case "Fevereiro":
                System.out.println("Numero equivalente: 2");
                break;
            case "Março":
                System.out.println("Numero equivalente: 3");
                break;
            case "Abril":
                System.out.println("Numero equivalente: 4");
                break;
            case "Maio":
                System.out.println("Numero equivalente: 5");
                break;
            case "Junho":
                System.out.println("Numero equivalente: 6");
                break;
            case "Julho":
                System.out.println("Numero equivalente: 7");
                break;
            case "Agosto":
                System.out.println("Numero equivalente: 8");
                break;
            case "Setembro":
                System.out.println("Numero equivalente: 9");
                break;
            case "Outubro":
                System.out.println("Numero equivalente: 10");
                break;
            case "Novembro":
                System.out.println("Numero equivalente: 11");
                break;
            case "Dezembro":
                System.out.println("Numero equivalente: 12");
                break;
        }
    }
}
