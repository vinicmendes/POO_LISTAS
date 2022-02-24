
package atividade04.visao;
import atividade04.controle.controleVetString;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class telaArrayString {
    final Scanner scan;
    final private controleVetString bits;

    public telaArrayString(int size) {
        this.scan = new Scanner(System.in);
        this.bits = new controleVetString(size);
    }

    public void telaInicial() {
        int op;
        boolean continuar = true;

        while (true) {
            menu();
            do {
                try {
                    op = scan.nextInt();
                    switch (op) {
                        case 1:
                            telaInserirBit();
                            break;
                        case 2:
                            telaPrintArray();
                            break;
                        case 3:
                            telaAcessarBit();
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
                    scan.nextLine();
                }
            } while (continuar);
        }
    }

    public void telaInserirBit() {
        int posicao;
        String valor;

        boolean continueLoop = true;

        do {
            try {
                System.out.print("Digite a posição: ");
                posicao = scan.nextInt();
                System.out.print("Digite a valor: ");
                valor = scan.next();
                try {
                    if ("0".equals(valor) || "1".equals(valor)) {
                        bits.insereBit(posicao, valor);
                    } else {
                        System.err.println("Apenas 0's e 1's são válidos");
                    }
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.err.println("Digite uma posição válida!");
                }

                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Insira um valor inteiro");
                scan.nextLine();
            }
        } while (continueLoop);
    }

    public void telaPrintArray() {
        System.out.println(bits.listarBits());
    }

    public void telaAcessarBit() {
        boolean continuar = true;
        int posicao;

        do {
            try {
                System.out.print("Digite a posição: ");
                posicao = scan.nextInt();

                if (posicao < 0 || posicao > bits.tamanho()) {
                    System.err.println("Posição inválida!");
                } else {
                    System.out.println("A posição "
                            + posicao + " está preenchida com ->  "
                            + bits.recuperarPos(posicao));
                }
                continuar = false;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Insira um valor inteiro");
                scan.nextLine();
            }
        } while (continuar);
    }

    public void telaArrayIgual() {
        String[] arr = new String[bits.tamanho()];
        boolean continueLoop = true;
        String valor;

        for (int i = 0; i < bits.tamanho(); i++) {

            do {
                try {
                    System.out.print("Posição " + i + "-> ");
                    valor = scan.next();

                    if (!"0".equals(valor) && !"1".equals(valor)) {
                        System.err.println("Apenas 0's e 1's são válidos");
                    } else {
                        arr[i] = valor;
                    }
                    continueLoop = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    scan.nextLine();
                }
            } while (continueLoop);
            continueLoop = true;
        }

        System.out.println("Base ->  " + Arrays.toString(bits.getVetor()));
        System.out.println("Passado como parâmetro->  " + Arrays.toString(arr));

        if (bits.equalsStrings(arr)) {
            System.out.println("São iguais!");
        } else {
            System.err.println("São diferentes!");
        }
    }

    public void telaOperaçãoNOT() {
        String[] res = bits.not();
        System.out.println("Base -> " + Arrays.toString(bits.getVetor()) + "\n"
                + "Resultado -> " + Arrays.toString(res));

    }
    
    public void telaOperaçãoAND() {
        String valor;
        boolean continueLoop1 = true;
        String[] arr = new String[bits.tamanho()];
        String[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < bits.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = scan.next();

                    if ("1".equals(valor) || "0".equals(valor)) {
                        arr[i] = valor;

                    } else {
                        System.err.println("Apenas 0's e 1's são válidos");
                    }

                    continueLoop1 = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    scan.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }

        res = bits.and(arr);
        System.out.println("Base ->  " + Arrays.toString(bits.getVetor()) + "\n"
                + "Passado como parâmetro ->" + Arrays.toString(arr) + "\n"
                        + "Resultado -> " + Arrays.toString(res));
    }

    public void telaOperaçãoOR() {
        String valor;
        boolean continueLoop1 = true;
        String[] arr = new String[bits.tamanho()];
        String[] res;

        System.out.println("Insira o array ->");
        for (int i = 0; i < bits.tamanho(); i++) {
            do {
                try {
                    System.out.print("Posição " + i + ": ");
                    valor = scan.next();

                    if ("1".equals(valor) || "0".equals(valor)) {
                        arr[i] = valor;

                    } else {
                        System.err.println("Apenas 0's e 1's são válidos");
                    }

                    continueLoop1 = false;

                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("Insira um valor inteiro");
                    scan.nextLine();
                }
            } while (continueLoop1);
            continueLoop1 = true;
        }

        res = bits.or(arr);
        System.out.println("Base ->  " + Arrays.toString(bits.getVetor()) + "\n"
                        + "Passado como parâmetro -> "+ Arrays.toString(arr) + "\n"
                        + "Resultado -> "+ Arrays.toString(res));
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
