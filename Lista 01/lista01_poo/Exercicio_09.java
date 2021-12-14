
package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_09 {
    public static int soma(int a, int b) {
        return a + b;
    }  
    public static int subtracao(int a, int b){
        return a - b;
    }  
    public static int divisao(int a,int b){
        return a / b;
    }  
    public static int multiplicacao(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Operação : ");
        String operacao = scan.nextLine();
        operacao = operacao.toLowerCase();
        
        String[] separacao = operacao.split(" ");
        
        int result = 0;
        int numero1 = Integer.parseInt(separacao[1]);
        int numero2 = Integer.parseInt(separacao[3]);
        
        switch (separacao[0]){
            case "soma":
                result = soma(numero1,numero2);
                break;
            case "multiplica":
                result = multiplicacao(numero1,numero2);
                break;
            case "divide":
                result = divisao(numero1,numero2);
                break;
            case "subtrai":
                result = subtracao(numero1,numero2);
                break;
        }
        
        System.out.println("O resultado é = "+result);
        scan.close();
    }
}
