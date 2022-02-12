
package lista03.exercicio5;

/**
 *
 * @author vinicius
 */
public class papel implements objeto{
    protected String nome;
    public papel(){
        nome="papel";
    }
    @Override
    public String nomeObjeto() {
        return nome;
    }

    @Override
    public boolean vitoria(objeto rival) {
        if(rival.nomeObjeto() == "pedra"){
            return true;
        }
        else{
            return false;
        }
    }
  
    

}
