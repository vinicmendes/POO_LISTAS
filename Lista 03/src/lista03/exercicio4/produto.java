
package lista03.exercicio4;

/**
 *
 * @author vinicius
 */
public class produto {
    private int serial, volume;
    private String test = "não testado";
    
    public produto(int serial){
        this.serial = serial;
    }
    
    public boolean testaUnidade(int serial){
        float testar = (float)java.lang.Math.random();
        if(testar >= 0.1){
            this.test = "aprovado";
            return true;
        }else{
            this.test = "reprovado";
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public int getVolume() {
        return volume;
    }

    public String getTest() {
        return test;
    }

    @Override
    public String toString(){
        return "Serial: "+getSerial()+"| Volume: "+getVolume()+"| Resultado teste: "+getTest();
    }

    
    
}
