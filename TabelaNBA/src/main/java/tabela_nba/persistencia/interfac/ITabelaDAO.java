/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tabela_nba.persistencia.interfac;

import tabela_nba.controle.Tabela_NBA;
import tabela_nba.controle.Tabela_NBA.Conferencia;

/**
 *
 * @author artur
 */
public interface ITabelaDAO {
    
    Tabela_NBA getTabela(Conferencia nome);
    
}
