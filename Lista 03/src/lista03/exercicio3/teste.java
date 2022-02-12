
package lista03.exercicio3;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class teste {
    public static void main(String[] args){
        ArrayList<forma> tipos = new ArrayList();
        
        
        retangulo ret = new retangulo(2,3);
        circulo circ = new circulo(3);
        quadrado quad = new quadrado(2,2);
        tipos.add(ret);
        tipos.add(circ);
        tipos.add(quad);
        
        retangulo ret2 = new retangulo(4,8);
        circulo circ2 = new circulo(2);
        quadrado quad2 = new quadrado(1,1);
        tipos.add(ret2);
        tipos.add(circ2);
        tipos.add(quad2);
        
        retangulo ret3 = new retangulo(6,12);
        circulo circ3 = new circulo((float) 1.2);
        quadrado quad3 = new quadrado(5,5);
        tipos.add(ret3);
        tipos.add(circ3);
        tipos.add(quad3);
        
        for(forma types: tipos){
            System.out.println("Forma: "+types.getTipo()+" Area: "+
                    types.calcularArea() + " Perimetro: "+types.calcularPerimetro());
        }
    }
}
