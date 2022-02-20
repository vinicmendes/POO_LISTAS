
package tabela_nba.controle;

import java.util.ArrayList;
import java.util.Random;
import tabela_nba.modelo.Time;


/**
 *
 * @author artur
 * @author vinicius
 */
public class Tabela_NBA {
    
    
    Random rand = new Random();
    
    public static final int QUANTIDADE_TIMES = (int) 6;
    public static final int QTD_JOGOS = (int) 82;
    

    public ArrayList<Time> listaTimes;
    private int quantidadeJogos;
       
    public enum Conferencia{
        LESTE, OESTE;
    }
    
    private Conferencia conferencia;
    
    public Tabela_NBA(Conferencia nome){
        listaTimes = new ArrayList();
        this.conferencia = nome;
    }
    
    public void addTime(Time time){
        listaTimes.add(time);
    }
    
    public void mudarConferencia(Conferencia novaConferencia){
        this.conferencia = novaConferencia;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setQuantidadeJogosTotal() {
        this.quantidadeJogos = QTD_JOGOS;
    }
    
    public Time pesquisa(int idTime){
        for(Time t : listaTimes){
            if(t.getId() == idTime){
                return t;
            }
        }
        return null;
    }
    
    // vencedor == 0 para time1 && vencedor == 1 para time2
    public void embates(int idTime1, int idTime2, int vencedor){
        if(vencedor < 0 || vencedor > 1){
            System.err.println("Insira um time vencedor válido!");
            
            return;
        }
        if((pesquisa(idTime1) != null)&& (pesquisa(idTime2) != null)){
            for(Time nomeTime : listaTimes){
                if(idTime1 == nomeTime.getId()){
                    if(vencedor == 0){
                        nomeTime.incrementaVitorias();
                        nomeTime.incrementaJogos();
                        nomeTime.setPontosPorJogo(rand.nextInt(20) + 100);
                    }
                    else{
                        nomeTime.incrementaDerrotas();
                        nomeTime.incrementaJogos();
                        nomeTime.setPontosPorJogo(rand.nextInt(10) + 80);
                    }
                }
                else if(idTime2 == nomeTime.getId()){
                    if(vencedor == 1){
                        nomeTime.incrementaVitorias();
                        nomeTime.incrementaJogos();
                        nomeTime.setPontosPorJogo(rand.nextInt(10) + 100);
                    }
                    else{
                        nomeTime.incrementaDerrotas();
                        nomeTime.incrementaJogos();
                        nomeTime.setPontosPorJogo(rand.nextInt(10) + 85);
                    }
                }
            }
        }
    }
    
   public void confrontos(){
        
        // Selecionar um time aleatorio 'i' e fazer todos os enfrentamentos
        // Os enfrentamentos serao baseados no valor aleatorio 'j' e de acordo
        // com as regras da NBA de sorteio, decidir metodo para vitoria/derrota
        // e decidir metodo de parada
        
        /**
         * 4 jogos contra os outros 4 adversários da divisão (4×4=16 jogos)
         * 4 jogos* contra 6 adversários da conferência (fora da divisão) (4×6=24 jogos)
         * 3 jogos contra as restantes 4 equipas da conferência (3×4=12 jogos)
         * 2 jogos contra equipas da conferência adversária (2×15=30 jogos)
         */
        
        int i = rand.nextInt(QUANTIDADE_TIMES);
        
        do{
            int j = rand.nextInt(QUANTIDADE_TIMES);
            int vencedor = rand.nextInt(2);
            
            if (i != j)
                embates(i, j, vencedor);
            
        }while(listaTimes.get(i).getJogos() != QTD_JOGOS);
    }
        
    

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }
    
    public void ordenaPosicao(){
        
        for (int i = 1; i < listaTimes.size(); i++){
            Time novoTime = listaTimes.get(i);
            
            for (int j = i; i > 0 && listaTimes.get(i-1).getPorcentagemVitoria() < novoTime.getPorcentagemVitoria(); i--){
                listaTimes.set(i, listaTimes.get(i-1));
            }
            listaTimes.set(i, novoTime);
            listaTimes.get(i).setPosicao(i);
        }
    }
    
    
}
