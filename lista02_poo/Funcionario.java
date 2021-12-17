
package lista02_poo;

/**
 *
 * @author vinicius
 */
public class Funcionario {
    private String nomeFuncionario;
    
    // dd/mm/aaaa
    private String dataNascimento ;
    
    // dd/mm/aaaa
    private String dataAdmissao;
    
    private int numFilhos;
    
    //true para efetivo - false para horista
    private boolean tipoContrato;
    private float salario;
    
    //VALORES REFERENTES AO INSS
    public static final float LOW_VALUE = (float) 1659.38;
    public static final float MID_VALUE = (float) 2765.66;
    public static final float HIGH_VALUE = (float) 5531.31;
    public static final float TAXA_1 = (float) 0.08;
    public static final float TAXA_2 = (float) 0.09;
    public static final float TAXA_3 = (float) 0.11;
    
    //VALORES REFERENTES AO IMPOSTO DE RENDA
    public static final float ALIQUOTA_1 = (float) 7.5;
    public static final float PARCELA_1 = (float) 142.80;
    public static final float ALIQUOTA_2 = (float) 15.0;
    public static final float PARCELA_2 = (float) 354.80;
    public static final float ALIQUOTA_3 = (float) 22.5;
    public static final float PARCELA_3 = (float) 636.13;
    public static final float ALIQUOTA_4 = (float) 27.5;
    public static final float PARCELA_4 = (float) 869.36;
    public static final float VALUE1 = (float) 1903.99;
    public static final float VALUE2 = (float) 2826.65;
    public static final float VALUE3 = (float) 3751.05;
    public static final float VALUE4 = (float) 4664.68;    
    
    public Funcionario(String nome, String nascimento){
        this.nomeFuncionario = nome;
        this.dataNascimento = nascimento;
    }
    
    public void contratar(boolean contrato,float novoSalario, int filhos, String admissao){
        this.tipoContrato = contrato;
        this.salario = novoSalario;
        this.numFilhos = filhos;
        this.dataAdmissao = admissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public void setTipoContrato(boolean tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public int getNumFilhos() {
        return numFilhos;
    }

    public boolean isTipoContrato() {
        return tipoContrato;
    }

    public float getSalario() {
        return salario;
    }
    
    public float salarioBruto(float horasTrabalhadas){
        if (this.tipoContrato == true) {
            return this.salario;
        }
        else{
            this.salario = horasTrabalhadas*this.salario;
            return (this.salario);
        }
    }

    
    public float descontoINSS(){
        
        if(this.salario < LOW_VALUE){
            return (float) (this.salario*TAXA_1);
        }
        else if(this.salario > LOW_VALUE && this.salario < MID_VALUE){
            return (float) (this.salario*TAXA_2);
        }
        else if(this.salario > MID_VALUE && this.salario < HIGH_VALUE){
            return (float) (this.salario*TAXA_3);
        }
        else{
            return (float) (HIGH_VALUE*TAXA_3);
        }
    }
    
    public float descontoIR(){
        if (this.salario < VALUE1) {
            return 0;
        }
        else if(this.salario > VALUE1 && this.salario < VALUE2){
            return ((this.salario*ALIQUOTA_1)- PARCELA_1);
        }
        else if(this.salario > VALUE2 && this.salario < VALUE3){
            return ((this.salario*ALIQUOTA_2)- PARCELA_2);
        }
        else if(this.salario > VALUE3 && this.salario < VALUE4){
            return ((this.salario*ALIQUOTA_3)- PARCELA_3);
        }
        else{
            return ((this.salario*ALIQUOTA_4)- PARCELA_4);
        }
    }
    
    public float salarioLiquido(){
        return (this.salario - (descontoINSS() + descontoIR()));
    }
    
    public void folhaPagamento(){
        System.out.println("O salario bruto do funcionario "+this.nomeFuncionario+" é: "+this.salario);
        System.out.println("foram descontados R$"+descontoINSS()+
                " referentes ao INSS, alem de R$"+descontoIR()+" referente ao imposto de renda."
                + "Seu salario liquido é: "+salarioLiquido());
    }
    
    
}
