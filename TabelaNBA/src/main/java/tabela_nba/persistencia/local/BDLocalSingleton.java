/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabela_nba.persistencia.local;

/**
 *
 * @author artur
 */
public class BDLocalSingleton {
    
    private static BDLocalSingleton BDLocal = new BDLocalSingleton(); 
    
    public static BDLocalSingleton getInstance(){
        return BDLocal;
    }
    
    private BDLocalSingleton(){
        
    }
    
}
