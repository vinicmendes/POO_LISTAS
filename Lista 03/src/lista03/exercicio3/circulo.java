
package lista03.exercicio3;

/**
 *
 * @author vinicius
 */
public class circulo extends forma{
    private float raio;
    public circulo(float raioCirculo){
        this.raio = raioCirculo;
    }

    @Override
    public float calcularArea() {
        return (float)(Math.PI*Math.pow(raio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float)(Math.PI*raio*2);
    }

    @Override
    public String getTipo() {
        return "circulo";
    }
}
