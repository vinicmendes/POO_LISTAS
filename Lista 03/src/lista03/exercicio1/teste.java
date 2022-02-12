
package lista03.exercicio1;
import java.util.Scanner;
/**
 *
 * @author vinicius
 */
public class teste {
    public static void main(String[] args) {
       calculadoraCientifica calculadora = new calculadoraCientifica();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Operação : ");
            String operacao = scan.nextLine();
            operacao = operacao.toLowerCase();
            
            double result = 0;
            System.out.println("Primeiro número");
            int numero1 = scan.nextInt();
            if(!"raiz".equals(operacao)){
                System.out.println("Segundo número");
                int numero2 = scan.nextInt();
                
                switch (operacao){
                    case "soma":
                        result = calculadora.soma(numero1,numero2);
                        break;
                    case "multiplica":
                        result = calculadora.multiplica(numero1,numero2);
                        break;
                    case "divide":
                        result = calculadora.divide(numero1,numero2);
                        break;
                    case "subtrai":
                        result = calculadora.subtrai(numero1,numero2);
                        break;
                    case "potencia":
                        result = calculadora.potencia(numero1,numero2);
                        break;
                }
            }else{
                result = calculadora.raiz(numero1);
            }
            
            
            System.out.println("O resultado é = "+result);
        }
    }
}
