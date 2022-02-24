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
    final private controleVetInt bit;

    public telaArray(int tamanho) {
        in = new Scanner(System.in);
        this.bit = new controleVetInt(tamanho);
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
                            telaInserirBit();
                            break;
                        case 2:
                            telaAcessarBit();
                            break;
                        case 3:
                            telaPrintArray();
                            break;
                        case 4:
                            telaArrayIgual();
                            break;
                        case 5:
                            telaOperaçãoNOT();
                            break;
                        case 6:
                            System.out.println("\n");
                            System.out.println("----------------------------------------------------------");
                            System.out.println("O array base é inicializado com 0 em todas as posições.\n"
                                    + "Caso ainda não o alterou, favor utilizar a opção Inserir Bit para preencher"
                                    + " suas respectivas posições");
                            System.out.println("----------------------------------------------------------\n");
                            System.out.println("\n");
                            telaOperaçãoOR();
                            break;
                        case 7:
                            System.out.println("\n");
                            System.out.println("----------------------------------------------------------");
                            System.out.println("O array base é inicializado com 0 em todas as posições.\n"
                                    + "Caso ainda não o alterou, favor utilizar a opção Inserir Bit para preencher"
                                    + " suas respectivas posições");
                            System.out.println("----------------------------------------------------------\n");
                            System.out.println("\n");
                            telaOperaçãoAND();
                            break;
                        case 8:
                            System.exit(0);
                        default:
                            System.err.println("Digite uma opção válida");
                    }
                    continuar = false;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continuar);
        }
    }
    public void telaInserirBit() {
        int posicao, valor;
        boolean continueLoop = true;
        
        do {
            try {
                System.out.print("Posição: ");
                posicao = in.nextInt();
                System.out.print("Valor: ");
                valor = in.nextInt();
                try {
                    if (valor < 0 || valor > 1) {
                        System.err.println("Apenas 0's e 1's são válidos");
                    } else {
                        bit.inserePosicao(posicao, valor);
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.err.println("Digite uma posição válida!");
                }

                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Insira um valor inteiro");
                in.nextLine();
            }
        } while (continueLoop);
    }

    public void telaPrintArray() {
        System.out.println(bit.imprimirPosicoes());
    }

    public void telaAcessarBit() {
        boolean continueLoop = true;
        int posicao;

        do {
            try {
                System.out.print("Digite a posição-> ");
                posicao = in.nextInt();

                if (posicao < 0 || posicao > bit.tamanho()) {
                    System.err.println("Posição inválida");

                } else {
                    System.out.println("A posição "
                            + posicao + " está preenchida com -> "
                            + bit.recuperaPosicao(posicao));
                }

                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Insira um valor inteiro");
                in.nextLine();
            }
        } while (continueLoop);
    }

    public void telaArrayIgual() {
        int[] vet = new int[bit.tamanho()];
        boolean continueLoop = true;
        int valor;

        for (int i = 0; i < bit.tamanho(); i++) {

            do {
                try {
                    System.out.print("Posição " + i + "-> ");
                    valor = in.nextInt();

                    if (valor < 0 || valor > 1) {
                        System.err.println("Apenas 0's e 1's são válidos");

                    } else {
                        vet[i] = valor;
                    }

                    continueLoop = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop);
            continueLoop = true;
        }

        System.out.println("Base -> " + Arrays.toString(bit.getVetor()));
        System.out.println("Passado como parâmetro->" + Arrays.toString(vet));

        if (bit.equals(vet)) {
            System.out.println("São iguais");
        } else {
            System.err.println("São diferentes");
        }
    }
    
    public void telaOperaçãoNOT() {
        int[] res = bit.not();

        System.out.println("Base -> " + Arrays.toString(bit.getVetor()) + "\n"
                + "Resultado -> " + Arrays.toString(res));

    }
    
    public void telaOperaçãoAND() {
        int valor;
        boolean continueLoop1 = true;
        int[] arr = new int[bit.tamanho()];
        int[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < bit.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = in.nextInt();

                    if (valor > 1 || valor < 0) {
                        System.err.println("Digite 0 ou 1!");

                    } else {
                        arr[i] = valor;
                    }

                    continueLoop1 = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }

        res = bit.and(arr);
        System.out.println("Base -> " + Arrays.toString(bit.getVetor()) + "\n"
                          + "Passado como parâmetro -> " + Arrays.toString(arr) + "\n"
                          + "Resultado -> " + Arrays.toString(res));
    }

    public void telaOperaçãoOR() {
        int valor;
        boolean continueLoop1 = true;
        int[] arr = new int[bit.tamanho()];
        int[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < bit.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = in.nextInt();

                    if (valor > 1 || valor < 0) {
                        System.err.println("Apenas 0's e 1's são válidos");
                    } else {
                        arr[i] = valor;
                    }
                    continueLoop1 = false;
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    in.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }
        res = bit.or(arr);
        System.out.println("Base ->  " + Arrays.toString(bit.getVetor()) + "\n"
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
