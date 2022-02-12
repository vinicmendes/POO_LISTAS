
package lista03.exercicio2;
/**
 *
 * @author vinicius
 */
public class teste {
    public static void main(String[] args){
        automovel auto = new automovel(4);
        bicicleta bike = new bicicleta(2);
        
        int rodasAuto = auto.getNumeroRodas();
        System.out.println("Numero de rodas do automovel é: "+ rodasAuto);
        auto.trocarOleo();
        System.out.println("Ultima data de troca de oleo: "+ auto.getTrocaDeOleo());
        int rodasBike = bike.getNumeroRodas();
        System.out.println("Numero de rodas da bicicleta é: "+ rodasBike);
    }
}
