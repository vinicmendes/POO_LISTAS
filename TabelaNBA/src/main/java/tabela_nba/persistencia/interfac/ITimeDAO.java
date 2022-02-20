/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tabela_nba.persistencia.interfac;

import tabela_nba.controle.Tabela_NBA.Conferencia;
import tabela_nba.modelo.Time;
import tabela_nba.modelo.Time.Divisao;

/**
 *
 * @author artur
 */
public interface ITimeDAO {
    
    Time getTime(Time id);
    Time getTimeDivisao(Divisao divisao);
    Time getTimeConferencia(Conferencia conferencia);
    
    
}
