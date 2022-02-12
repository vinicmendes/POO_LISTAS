package lista03.exercicio5;

import java.util.Random;

/**
 *
 * @author vinicius
 */
public final class jogo {

    public static void main(String[] args) {
        Random rand = new Random();
        jogo play = new jogo(rand.nextInt(15) + 5);
    }
    objeto[] obj;
    objeto paper, rock, scissor;
    
    public jogo(int num){
        obj = new objeto[]{paper= new papel(),rock = new pedra(),scissor = new tesoura()};
        for(int i = 0; i < num; i++){
            Random rand = new Random();
            this.jogar(obj[rand.nextInt(3)], obj[rand.nextInt(3)]);
            
        }
    }
    public void jogar(objeto obj1, objeto obj2){
        if(obj1.vitoria(obj2)){
            System.out.println(obj1.nomeObjeto() +" ganhou "+  obj2.nomeObjeto());
        }else if(obj2.vitoria(obj1)){
            System.out.println(obj2.nomeObjeto() +" ganhou "+ obj1.nomeObjeto());
        }else{
            System.out.println(obj2.nomeObjeto() + " empate com " + obj1.nomeObjeto());
        }
    }

}
