    
package tabela_nba.visao;

import java.text.DecimalFormat;
import tabela_nba.controle.Tabela_NBA;
import static tabela_nba.controle.Tabela_NBA.Conferencia;
import tabela_nba.modelo.Time;
/**
 *
 * @author vinicius
 */
public class telaTabela {
    Tabela_NBA tabela = new Tabela_NBA(Conferencia.LESTE);
    
    //PASSAR COMO PARAMENTRO O tabela
    public void listarClassificacao(){
        
        tabela.ordenaPosicao();
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        System.out.println("CLASSIFICACAO ");
        System.out.println("Times    V  D  %VIT  PPJ");
        
        for (Time nomeTime : tabela.listaTimes){
            System.out.print(+(nomeTime.getPosicao() + 1) + " ");
            System.out.print(nomeTime.getNomeTime() + "   ");
            System.out.print(nomeTime.getVitorias() + " ");
            System.out.print(nomeTime.getDerrotas() + "  ");
            System.out.print(formatador.format((nomeTime.getPorcentagemVitoria())* 100) + "% ");
            System.out.print(formatador.format(nomeTime.getMediaPontosPorJogo()) + " ");
            System.out.println();
        }
    }
    
    //PASSAR COMO PARAMENTRO O tabela
    public void telaInserir(){
        
        tabela.addTime(new Time("Bulls", Time.ConferenciaTime.LESTE, Time.Divisao.CENTRAL,0));
        tabela.addTime(new Time("Nets", Time.ConferenciaTime.LESTE, Time.Divisao.ATLANTICO,1));
        tabela.addTime(new Time("Heat", Time.ConferenciaTime.LESTE, Time.Divisao.SUDESTE,2));
        tabela.addTime(new Time("Bucks", Time.ConferenciaTime.LESTE, Time.Divisao.CENTRAL,3));
        tabela.addTime(new Time("Celtics", Time.ConferenciaTime.LESTE, Time.Divisao.ATLANTICO,4));
        tabela.addTime(new Time("Hornets", Time.ConferenciaTime.LESTE, Time.Divisao.SUDESTE,5));
        
        tabela.confrontos();
    }
}
