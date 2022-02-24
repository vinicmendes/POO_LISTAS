
package atividade04.persistencia;

import atividade04.modelo.arrayInt;

/**
 *
 * @author vinicius
 */
public class arrayIntDAO {
    final private arrayInt vet;
    
    public arrayIntDAO(int tamanho){
        vet = new arrayInt(tamanho);
    }
    
    public int tamanho(){
        return vet.tamanho();
    }
    
    public void inserirBit(int posicao,int valor){
        vet.setPosicao(posicao, valor);
    }
    
    public int recuperarBit(int posicao){
        return vet.getPosicao(posicao);
    }
    
    public int[] getArray(){
        return vet.getVet();
    }    
    public String listarBits(){
        return vet.toString();
    }
    
    
}
