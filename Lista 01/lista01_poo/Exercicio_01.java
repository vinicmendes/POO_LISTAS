package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = scan.nextInt();
        if(anoNascimento > anoAtual){
            System.out.println("Digite datas validas ao executar novamente!");
        }else{
            int total = anoAtual - anoNascimento;
            System.out.println("Sua idade é = "+total);
        }
        
    }
    
}
