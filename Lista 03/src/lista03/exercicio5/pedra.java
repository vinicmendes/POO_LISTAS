
package lista03.exercicio5;

/**
 *
 * @author vinicius
 */
public class pedra implements objeto{
    protected String nome;
    public pedra(){
        nome="pedra";
    }
    @Override
    public String nomeObjeto() {
        return nome;
    }

    @Override
    public boolean vitoria(objeto rival) {
        if(rival.nomeObjeto() == "tesoura"){
            return true;
        }
        else{
            return false;
        }
    }
  
}
