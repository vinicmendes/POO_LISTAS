
package atividade04.modelo;
import java.util.Arrays;

/**
 *
 * @author vinicius
 */
public class arrayInt implements arrayInterface{
    private final int[] vet;
    
    public arrayInt(int tamanho){
        this.vet = new int[tamanho];
    }
    
    public int getPosicao(int posicao){
       return this.vet[posicao];
    }
    
    public void setPosicao(int posicao, int novoValor){
        this.vet [posicao] = novoValor;
    }
    
    
    @Override
    public int tamanho() {
        return vet.length;
    }

    @Override
    public int[] getVet() {
        return vet;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(this.vet);
    }
    
}
