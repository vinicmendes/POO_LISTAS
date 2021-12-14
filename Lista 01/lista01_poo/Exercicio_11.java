
package lista01_poo;


import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */
public class Exercicio_11 {
    public static void main(String[] args) throws Exception{
        //Mudar Diretório do arquivo abaixo de acordo com o seu computador
        //Exemplo: "/home/vinicius/Documentos/Lista01_POO/src/lista01_poo/file.txt"
        //utilizei o LINUX
        File arquivo = new File("dir");
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        int numPacientes= 0;
        int homens = 0;
        int mulheres = 0;
        int idadeEntre18e25=0;
        int homemMaisVelho = 0;
        
        double mediaIdadeHomens = 0;
        double alturaMulherMaisBaixa=0;
        
        String nomeHomemMaisVelho = "";
        String nomeMulherMaisBaixa = "";

        
        try (Scanner myReader = new Scanner(arquivo)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] line = data.split(" ");

                if(alturaMulherMaisBaixa==0&&"feminino".equals(line[1])){
                    alturaMulherMaisBaixa = Double.parseDouble(line[4]);
                    nomeMulherMaisBaixa=line[0];
                }

                if("feminino".equals(line[1])&&Double.parseDouble(line[4])<alturaMulherMaisBaixa){
                    alturaMulherMaisBaixa = Double.parseDouble(line[4]);
                    nomeMulherMaisBaixa = line[0];
                }

                if("masculino".equals(line[1])){
                    homens++;
                    mediaIdadeHomens+= Double.parseDouble(line[3]);
                }

                if("feminino".equals(line[1]) && ( Double.parseDouble(line[4])<1.70 && Double.parseDouble(line[4])>1.60 ) && Double.parseDouble(line[2])>70){
                    mulheres++;
                }

                if(Integer.parseInt(line[3])>=18&&Integer.parseInt(line[3])<=25){
                    idadeEntre18e25++;
                }

                if(Integer.parseInt(line[3])>homemMaisVelho&&"masculino".equals(line[1])){
                    homemMaisVelho = Integer.parseInt(line[3]);
                    nomeHomemMaisVelho = line[0];
                }

                numPacientes++;
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo!");
        }    
        
        double media = mediaIdadeHomens / homens;
        
        System.out.println("Quantidade de pacientes: " + numPacientes);
        System.out.println("Média de idade dos homens: " + formatador.format(media));
        System.out.println("Número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + mulheres);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + idadeEntre18e25);
        System.out.println("Nome do Paciente mais velho: " + nomeHomemMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa );
    }
}
