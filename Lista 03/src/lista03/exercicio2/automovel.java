/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.exercicio2;

import java.util.Date;

/**
 *
 * @author vinicius
 */
public class automovel extends veiculo {
    private int rodas;
    private Date trocaDeOleo;
    public automovel(int rodasAutomovel){
        this.rodas = rodasAutomovel;
        this.trocaDeOleo = trocaDeOleo;
    }
    @Override
    public int getNumeroRodas() {
       return this.rodas;
    }

    @Override
    public void acelerar(float velocidade) {
        
    }

    @Override
    public void parar() {
        
    }
    
    public void trocarOleo(){
        this.trocaDeOleo = new Date();
    }

    public Date getTrocaDeOleo() {
        return trocaDeOleo;
    }
    
    
}
