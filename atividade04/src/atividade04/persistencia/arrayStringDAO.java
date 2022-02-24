
package atividade04.persistencia;
import atividade04.modelo.arrayString;

/**
 *
 * @author vinicius
 */
public class arrayStringDAO {
    final private arrayString vet;
    
    public arrayStringDAO(int tamanho){
        vet = new arrayString(tamanho);
    }
    public int tamanho(){
        return vet.tamanho();
    }
    public void inserirPosicao(int posicao,String valor){
        vet.setPosicao(posicao, valor);
    }
    
    public String recuperarBit(int posicao){
        return vet.getPosicao(posicao);
    }
    
    
    public String[] getArray(){
        return vet.getVet();
    }
    
    
    public String listarBits(){
        return vet.toString();
    }
    
    
}
