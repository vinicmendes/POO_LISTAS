
package lista03.exercicio2;

/**
 *
 * @author vinicius
 */
public class bicicleta extends veiculo{
    private int rodas;
    public bicicleta(int rodasBike){
        this.rodas = rodasBike;
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
    
}
