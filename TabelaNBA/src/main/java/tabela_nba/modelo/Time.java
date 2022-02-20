
package tabela_nba.modelo;

import java.text.DecimalFormat;

/**
 *
 * @author vinicius
 */
public class Time {
    private String nomeTime;
    
    DecimalFormat formatador = new DecimalFormat("0.000");
    
    private int vitorias;
    private int derrotas;
    
    private int jogos;
    //private int jogosAtras; // 0 = sem jogos atrás
        
    private double porcentagemVitoria;
    private double pontosPorJogo;
    
    private int posicao;
    private int id;

    public enum Divisao{
        ATLANTICO, CENTRAL, SUDESTE, NOROESTE, PACIFICO, SUDOESTE;
    }
    
    
    public enum ConferenciaTime{
        LESTE, OESTE;
    }
    
    private ConferenciaTime conferencia;
    private Divisao divisao;
    
    public Time(String nomeTime, ConferenciaTime conferencia, Divisao divisao, int idTime){
        this.nomeTime = nomeTime;
        this.vitorias = 0;
        this.derrotas = 0;
        this.jogos = 0; 
        this.pontosPorJogo = 0;
        this.posicao = 0;
        this.id = idTime;
        this.conferencia = conferencia;
        this.divisao = divisao;
    }
    
    public void defineNomeTime(String time){
        this.nomeTime = time;
    }

    public int posicaoTabela(){
        return this.posicao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getJogos() {
        return jogos;
    }

    public double getPorcentagemVitoria() {
        this.porcentagemVitoria = (double)this.vitorias/this.jogos;
        return porcentagemVitoria;
    }
    
    public Divisao getDivisao(){
        return divisao;
    }
    
    public double getMediaPontosPorJogo() {
        return (double)this.pontosPorJogo/this.jogos;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getId() {
        return id;
    }
    
    public void incrementaVitorias(){
        this.vitorias += 1;
    }
    
    public void incrementaDerrotas(){
        this.derrotas += 1;
    }

    public void incrementaJogos() {
        this.jogos += 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPontosPorJogo(double pontosPorPartida) {
        
        this.pontosPorJogo += pontosPorPartida;
    }
   
}
