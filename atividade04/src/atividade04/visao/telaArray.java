
package atividade04.visao;
import atividade04.controle.controleVetInt;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class telaArray {
    final Scanner in;
    
    final private controleVetInt pos;

    public telaArray(int tamanho) {
        in = new Scanner(System.in);
        this.pos = new controleVetInt(tamanho);
    }

    
    public void telaInicial() {
        int op;
        boolean continuar = true;
        while (true) {
            menu();
            do {
                try {
                    op = in.nextInt();
                    switch (op) {
                        case 1:
                            telaInserir();
                            
                            break;
                        case 2:
                            telaAcessar();
                            break;
                        case 3:
                            telaImprimir();
                            break;
                        case 4:
                            telaComparacao();
                            break;
                        case 5:
                            
                            telaNot();
                            break;
                        case 6:
                            System.out.println("----------------------------------------------------------");
                            System.out.println("O array base é inicializado com 0 em todas as posições.\n"
                                    + "Caso ainda não o alterou, favor utilizar a opção Inserir Bit para preencher"
                                    + " suas respectivas posições");
                            System.out.println("----------------------------------------------------------\n");
                            telaOr();
                            
                            break;
                        case 7:
                            
                            System.out.println("----------------------------------------------------------");
                            System.out.println("O array base é inicializado com 0 em todas as posições.\n"
                                    + "Caso ainda não o alterou, favor utilizar a opção Inserir Bit para preencher"
                                    + " suas respectivas posições");
                            System.out.println("----------------------------------------------------------\n");
                            telaAnd();
                            break;
                            
                            
                        case 8:
                            System.exit(0);
                        default:
                            System.err.println("ERRO! Digite uma opção válida");
                    }
                    continuar = false;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("ERRO! Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continuar);
        }
    }
    public void telaInserir() {
        int posicao, valor;
        boolean continuar = true;
        
        do {
            
            
            try {
                System.out.print("Posição: ");
                posicao = in.nextInt();
                System.out.print("Valor: ");
                valor = in.nextInt();
                try {
                    if (valor >= 0 && valor <= 1) {
                        pos.inserePosicao(posicao, valor);
                    } else {
                        System.err.println("ERRO! Apenas 0's e 1's são válidos");
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.err.println("ERRO! Digite uma posição válida!");
                }
              
                continuar = false;
                

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("ERRO! Insira um valor inteiro");
                in.nextLine();
                
                
            }
        } while (continuar);
    }

    public void telaImprimir() {
        System.out.println(pos.imprimirPosicoes());
    }

    public void telaAcessar() {
        boolean continueLoop = true;
        
        int posicao;

        do {
            try {
                System.out.print("Digite a posição-> ");
                posicao = in.nextInt();

                if (posicao >= 0 && posicao <= pos.tamanho()) {
                    System.out.println("A posição "
                            + posicao + " está preenchida com -> "
                            + pos.recuperaPosicao(posicao));
                } else {
                    System.err.println("ERRO! Posição inválida");
                    
                    
                }

                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("ERRO! Insira um valor inteiro");
                in.nextLine();
                
            }
        } while (continueLoop);
       
        
    }

    
   
    
    public void telaComparacao() {
        int[] vet = new int[pos.tamanho()];
        boolean continueLoop = true;
        int valor;

        for (int i = 0; i < pos.tamanho(); i++) {

            do {
                try {
                    System.out.print("Posição " + i + "-> ");
                    valor = in.nextInt();

                    if (valor >= 0 && valor <= 1) {
                        vet[i] = valor;
                    } else {
                        System.err.println("ERRO! Apenas 0's e 1's são válidos");
                        
                    }

                    continueLoop = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("ERRO! Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop);
            continueLoop = true;
        }

        System.out.println("Base -> " + Arrays.toString(pos.getVetor()));
        System.out.println("Passado como parâmetro->" + Arrays.toString(vet));

        if (pos.equals(vet)) {
            System.out.println("São iguais");
        } else {
            System.err.println("São diferentes");
        }
    }
    
    public void telaNot() {
        
        int[] res = pos.not();

        System.out.println("Base -> " + Arrays.toString(pos.getVetor()) + "\n"
                + "Resultado -> " + Arrays.toString(res));

    }
    
    public void telaAnd() {
        int valor;
        boolean continueLoop1 = true;
        int[] arr = new int[pos.tamanho()];
        
        
        int[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < pos.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = in.nextInt();

                    if (valor <= 1 && valor >= 0) {
                        arr[i] = valor;
                    } else {
                        System.err.println("ERRO! Digite 0 ou 1!");
                        
                    }

                    continueLoop1 = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("ERRO! Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }

        res = pos.and(arr);
        System.out.println("Base -> " + Arrays.toString(pos.getVetor()) + "\n"
                          + "Passado como parâmetro -> " + Arrays.toString(arr) + "\n"
                          + "Resultado -> " + Arrays.toString(res));
    }

    public void telaOr() {
        int valor;
        boolean continueLoop1 = true;
        int[] arr = new int[pos.tamanho()];
        int[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < pos.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = in.nextInt();

                    if (valor <= 1 && valor >= 0) {
                        arr[i] = valor;
                    } else {
                        System.err.println("Apenas 0's e 1's são válidos");
                    }
                    continueLoop1 = false;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("ERRO! Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }
        res = pos.or(arr);
        System.out.println("Base ->  " + Arrays.toString(pos.getVetor()) + "\n"
                         + "Passado como parâmetro -> " + Arrays.toString(arr)+ "\n"
                         + "Resultado -> " + Arrays.toString(res));
    }
    public void menu() {
                            System.out.println("\n");
        System.out.println("      1-> Inserir Bit          " + "\n"
                        +  "      2-> Acessar um Bit       " + "\n"
                        +  "   3-> Mostrar lista de Bits   " + "\n"
                        +  "     4-> Comparar Arrays       " + "\n"
                        +  "           5-> Not             " + "\n"
                        +  "           6-> Or              " + "\n"
                        +  "           7-> And             " + "\n"
                        +  "           8-> Sair            ");
        
                            System.out.println("\n");
    }
}
