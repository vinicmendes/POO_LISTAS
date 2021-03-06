package lista02_poo;


/**
 *
 * @author vinicius
 */
public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.configurarFuncionario();
    }

    void configurarFuncionario() {

        //Funcionário efetivado
        Funcionario funcionario1 = new Funcionario("Vinícius Mendes", "03/05/2001");;
        funcionario1.contratar(true, 1500, 0,"12/05/2020");
        funcionario1.salarioBruto((float) 170);
        funcionario1.folhaPagamento();
        
        //Funcionário horista
        Funcionario funcionario2 = new Funcionario("Tainá Vieira", "01/03/2004");
        funcionario2.contratar(false, 15, 1,"02/01/2020");
        funcionario2.salarioBruto((float) 130.78);
        funcionario2.folhaPagamento();
        
        //Funcionário efetivado
        Funcionario funcionario3 = new Funcionario("Adairson Geraldo", "31/08/1974");
        funcionario3.contratar(true, 10000, 3,"03/02/1998");
        funcionario3.salarioBruto((float) 160);
        funcionario3.folhaPagamento();
        
        //Funcionário horista
        Funcionario funcionario4 = new Funcionario("Manoela Soares", "25/11/1963");
        funcionario4.contratar(false, 17, 2,"30/01/1996");
        funcionario4.salarioBruto((float) 120.5);
        funcionario4.folhaPagamento();
        
        //Funcionário horista
        Funcionario funcionario5 = new Funcionario("Milena de Oliveira", "10/11/2003");
        funcionario5.contratar(false, 9, 0,"29/07/2021");
        funcionario5.salarioBruto((float) 117.32);
        funcionario5.folhaPagamento();
        
        //testando get e set
        Funcionario funcionario6 = new Funcionario("Maria Aparecida", "14/08/1973");
        funcionario6.contratar(true, 1500, 0,"29/07/2006");
        funcionario6.setTipoContrato(false);
        funcionario6.setSalario(8);
        System.out.println("Após a alteração, o novo tipo de contrato é ([true] efetivado [false] horista): " 
                + funcionario6.isTipoContrato());
        System.out.println("E o novo salário é: " + funcionario6.getSalario()+ "por hora") ;
        
    }

}
