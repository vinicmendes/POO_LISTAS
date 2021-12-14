
package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu salario (Sem o R$): ");
        float salario = scan.nextFloat();
        System.out.println("Digite o valor do emprestimo (Sem o R$): ");
        float emprestimo = scan.nextFloat();
        if(emprestimo <= (0.3*salario)){
            System.out.println("Emprestimo aprovado!");
        }else{
            System.out.println("Emprestimo negado! Procure um emprestimo com menor valor.");
        }
    }
}
