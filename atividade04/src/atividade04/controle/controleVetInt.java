
package atividade04.controle;
import atividade04.persistencia.arrayIntDAO;
import java.util.Arrays;

/**
 *
 * @author vinicius
 */
public class controleVetInt {
    arrayIntDAO vet;
    
    
    public controleVetInt (int tamanho){
        
        vet = new arrayIntDAO(tamanho);
    }
    
    
    public void inserePosicao(int posicao, int valor) {
        vet.inserirBit(posicao, valor);
        
    }
    
    public int[] getVetor() {
        return vet.getArray();
    }

    public int recuperaPosicao(int posicao) {
         return vet.recuperarBit(posicao);
    }

    public String imprimirPosicoes() {
        
        return vet.listarBits();
    }

    public int tamanho() {
        
        
        return vet.tamanho();
    }

    public boolean equals(int[] arr) {
        return Arrays.equals(arr, vet.getArray());
        
    }
    
    public int[] not() {
        
        int[] resposta = new int[vet.tamanho()];
        for (int i = 0; i < vet.tamanho(); i++) {
            
            resposta[i] = vet.getArray()[i] == 1 ? 0 : 1;
        }
        return resposta;
    }
    
    public int[] or(int[] arr) {
        int[] resposta = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            
            resposta[i] = vet.getArray()[i] | arr[i];
        }
        return resposta;
    }
    
    public int[] and(int[] arr) {
        int[] resposta = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            
            resposta[i] = vet.getArray()[i] & arr[i];
        }
        return resposta;
    }

    

    
}
