
package lista03.exercicio4;

/**
 *
 * @author vinicius
 */
public class test {
    public static void main(String[] args){
        int serial = 3;
        produto prod = new produto(serial);
        prod.testaUnidade(serial);
        prod.setVolume(50);
        System.out.println(prod.toString());
    }
}
