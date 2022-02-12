
package lista03.exercicio5;

/**
 *
 * @author vinicius
 */
public class tesoura implements objeto{
    protected String nome;
    public tesoura(){
        nome="tesoura";
    }
    @Override
    public String nomeObjeto() {
        return nome;
    }

    @Override
    public boolean vitoria(objeto rival) {
        if(rival.nomeObjeto() == "papel"){
            return true;
        }
        else{
            return false;
        }
    }
  
    
}
