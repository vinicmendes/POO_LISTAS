
package lista03.exercicio3;

/**
 *
 * @author vinicius
 */
public class retangulo extends forma {
    private float lado, altura;
    
    public retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return ((this.lado*2)+(this.altura*2));
    }

    @Override
    public String getTipo() {
        return "retangulo";
    }

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }
    
}
