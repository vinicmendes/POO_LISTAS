package lista02_poo;

import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.configurarFuncionario();
    }
    
    void configurarFuncionario(){
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Inserir nome do funcionario: ");
        
        try{
            String nome = input.nextLine();
            System.out.print("Inserir data de nascimento do funcionario: ");
            String nascimento = input.nextLine();
        
            Funcionario f1 = new Funcionario(nome,nascimento);
            System.out.print("Qual o tipo de contrato do cliente? (1) efetivo (2) horista: ");
            int contrato = scan.nextInt();
            boolean tipo;
            tipo = contrato == 1;
            System.out.print("Digite o salario do funcionario: ");
            float salario = scan.nextFloat();
            System.out.print("Digite o numero de filhos menor de idade: ");
            int filhos = scan.nextInt();
            System.out.print("Digite a data de admissao: ");
            String admissao = input.nextLine();
        
        
            f1.contratar(tipo, salario, filhos, admissao);

            System.out.print("Quantas horas o funcionario trabalhou? ");
            float horasTrabalhadas = scan.nextFloat();

            f1.salarioBruto(horasTrabalhadas);
            f1.folhaPagamento();
            
        }catch(Exception e){
            System.out.println("ERRO, EXECUTE NOVAMENTE!");
        }
        
        
        
        
    }

  
    
    
    
    
}
