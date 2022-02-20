
package tabela_nba;

import tabela_nba.visao.telaTabela;

/**
 *
 * @author vinicius
 */
public class Principal {
    public static final int PONTOSTOTAIS_TIME1 = (int) 1060;
    public static final int PONTOSTOTAIS_TIME2 = (int) 1204;
    public static void main(String[] args) {
        telaTabela tela = new telaTabela();
        
        tela.telaInserir();
        tela.listarClassificacao();

    }
}