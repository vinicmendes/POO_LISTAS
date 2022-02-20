/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_nba.persistencia.local;

import tabela_nba.controle.Tabela_NBA;
import tabela_nba.modelo.Time;
import tabela_nba.persistencia.interfac.ITimeDAO;

/**
 *
 * @author artur
 */
public class TimeDAO implements ITimeDAO {

    @Override
    public Time getTime(Time id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Time getTimeDivisao(Time.Divisao divisao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Time getTimeConferencia(Tabela_NBA.Conferencia conferencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
