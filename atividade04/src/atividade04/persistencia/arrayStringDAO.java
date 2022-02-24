
package atividade04.persistencia;

import atividade04.modelo.arrayString;

/**
 *
 * @author vinicius
 */
public class arrayStringDAO {
    final private arrayString arrayBits;
    
    public arrayStringDAO(int tamanho){
        arrayBits = new arrayString(tamanho);
    }
    
    public void inserirPosicao(int posicao,String valor){
        arrayBits.setPosicao(posicao, valor);
    }
    
    public String[] getArray(){
        return arrayBits.getVet();
    }
    
    public String recuperarBit(int posicao){
        return arrayBits.getPosicao(posicao);
    }
    
    public String listarBits(){
        return arrayBits.toString();
    }
    
    public int tamanho(){
        return arrayBits.tamanho();
    }
}
