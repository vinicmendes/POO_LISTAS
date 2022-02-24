
package atividade04.modelo;

import java.util.Arrays;

/**
 *
 * @author vinicius
 */
public class arrayString implements arrayInterface{
    final private String vet[];

    public arrayString(int tamanho) {
        this.vet = new String[tamanho];
    }
    
    public void setPosicao(int posicao, String valor) {
        this.vet[posicao] = valor;
    }


    public String getPosicao(int posicao) {
        return vet[posicao];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.vet);
    }
    @Override
    public int tamanho() {
        return vet.length;
    }

    @Override
    public String[] getVet() {
        return vet;
    }
    
}
