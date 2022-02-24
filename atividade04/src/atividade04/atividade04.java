package atividade04;

import atividade04.visao.telaArray;
import atividade04.visao.telaArrayString;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class atividade04 {
    
    public static void main(String[] args) {
        int tamanho = 0;
        int option;
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        do {
            try {
                System.out.print("Insira o tamanho do array desejado: ");
                tamanho = scan.nextInt();
                continuar = false;

            } catch (InputMismatchException inputMismatchException) {
                System.err.println("Insira um valor inteiro");
                scan.nextLine();
            }
        } while (continuar);

        continuar = true;

        while (true) {
            mostrarMenu();
            do {
                try {
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            telaArray tela = new telaArray(tamanho);
                            tela.telaInicial();
                            break;
                        case 2:
                            telaArrayString telaString = new telaArrayString(tamanho);
                            telaString.telaInicial();
                            break;
                        default:
                            System.err.println("Opção Inválida");
                    }
                    continuar = false;
                } catch (InputMismatchException inputMismatchException) {
                    System.err.println("Insira um valor inteiro");
                    scan.nextLine();
                }
            } while (continuar);
        }
    }
    public static void mostrarMenu() {
        System.out.println("      Escolha uma opção:     " + "\n"
                + "          1: Array           " + "\n"
                + "          2: String          ");
    }
        
}

