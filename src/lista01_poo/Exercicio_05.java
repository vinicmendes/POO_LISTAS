
package lista01_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia de seu aniversario: ");
        int diaAniversario = scan.nextInt();
        System.out.println("Digite o mes de seu aniversario: ");
        int mesAniversario = scan.nextInt();
        
        switch (mesAniversario){
            case 1:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Janeiro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
                
            case 2:
                System.out.println("O ano é bissexto? Digite 1 para sim e 0 para não.");
                int bissexto = scan.nextInt();
                if(bissexto == 1 && diaAniversario <= 29){
                    System.out.println("Data válida. Fevereiro");
                    break;
                }if(bissexto == 0 && diaAniversario <=28){
                    System.out.println("Data válida. Fevereiro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 3:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Março");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 4:
                if(diaAniversario <= 30){
                    System.out.println("Data válida. Abril");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 5:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Maio");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 6:
                if(diaAniversario <= 30){
                    System.out.println("Data válida. Junho");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 7:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Julho");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 8:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Agosto");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 9:
                if(diaAniversario <= 30){
                    System.out.println("Data válida. Setembro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 10:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Outubro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 11:
                if(diaAniversario <= 30){
                    System.out.println("Data válida. Novembro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
            case 12:
                if(diaAniversario <= 31){
                    System.out.println("Data válida. Dezembro");
                    break;
                }else{
                    System.out.println("Insira um dia valido");
                    break;
                }
        }
    }
}
