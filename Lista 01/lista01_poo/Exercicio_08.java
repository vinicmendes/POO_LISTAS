package lista01_poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String valor = "";
        
        List<Integer> numeros = new ArrayList<>();
        
        do {            
            System.out.print("Digite um valor: ");
            valor = scan.next();
            
            if(valor.equals("fim")){
                break;
            }
            else{
                numeros.add(Integer.parseInt(valor));
            }
            
        } while ((!valor.equals("fim")));
        
        
        int[] Num = new int[numeros.size()];
        
        for (int i = 0; i < numeros.size(); i++) {
            Num[i] =   numeros.get(i);
        }
        
        for (int i = 0; i < Num.length; i++) {  
            for (int j = i + 1; j < Num.length; j++) {  
                int temp = 0;

                if (Num[i] > Num[j]){  
                    temp = Num[i];  
                    Num[i] = Num[j];  
                    Num[j] = temp;  
                }
            }
        }  
        
        System.out.println("Números ordenados: "+Arrays.toString(Num));
        scan.close();
    }
}
