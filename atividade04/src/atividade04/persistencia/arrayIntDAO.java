
package atividade04.persistencia;

import atividade04.modelo.arrayInt;

/**
 *
 * @author vinicius
 */
public class arrayIntDAO {
    final private arrayInt array;
    
    public arrayIntDAO(int tamanho){
        array = new arrayInt(tamanho);
    }
    
    public void inserirBit(int posicao,int valor){
        array.setPosicao(posicao, valor);
    }
    
    public int[] getArray(){
        return array.getVet();
    }
    
    public int recuperarBit(int posicao){
        return array.getPosicao(posicao);
    }
    
    public String listarBits(){
        return array.toString();
    }
    
    public int tamanho(){
        return array.tamanho();
    }
}
