
package atividade04.controle;

import atividade04.persistencia.arrayStringDAO;
import java.util.Arrays;

/**
 *
 * @author vinicius
 */
public class controleVetString {
    arrayStringDAO bit;
    
    public controleVetString(int tamanho) {
        bit = new arrayStringDAO(tamanho);
    }
    
    public void insereBit(int posicao, String valor) {
        bit.inserirPosicao(posicao, valor);
        System.out.println("Inserção realizada com sucesso");
    }
    
    public String[] getVetor() {
        return bit.getArray();
    }
    
    public String recuperarPos(int posicao) {
        return bit.recuperarBit(posicao);
    }
    
    public String listarBits() {
        return bit.listarBits();
    }
    
    public int tamanho() {
        return bit.tamanho();
    }
    
    public boolean equalsStrings(String[] arr) {
        return Arrays.equals(arr, bit.getArray());
    }
    
    public String[] not() {
        String[] resposta = new String[bit.tamanho()];
        for (int i = 0; i < bit.tamanho(); i++) {
            resposta[i] = Integer.parseInt(bit.getArray()[i]) == 1 ? "0" : "1";
        }
        return resposta;
    }
    
    public String[] or(String[] arr) {
        String[] resposta = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int aux = Integer.parseInt(bit.getArray()[i]) | Integer.parseInt(arr[i]);
            resposta[i] = String.valueOf(aux);
        }
        return resposta;
    }
    
    public String[] and(String[] arr) {
        String[] resposta = new String[arr.length];  
        for (int i = 0; i < arr.length; i++) {
            int aux = Integer.parseInt(bit.getArray()[i]) & Integer.parseInt(arr[i]);
            resposta[i] = String.valueOf(aux);
        }  
        return resposta;
    }
    
    
    
    
}
