import java.text.DecimalFormat;
public class TestaFuncionario {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        Formacao f1 = new Formacao("Escola Estadual Santa Joana", 'B');
        Formacao f2 = new Formacao("Escola Estadual Alexandre", 'M');
        Formacao f3 = new Formacao("Universidade Paulista", 'G');
        Formacao f4 = new Formacao(null, ' ');

        // SEM FORMAÇÃO
        Funcionario func0 = new Funcionario("Raditz", 123, f4);

        // FORMAÇÃO BÁSICA
        Funcionario func1 = new Funcionario("Goku", 124, f1);
        Funcionario func2 = new Funcionario("Vegeta", 125, f1);
        Funcionario func3 = new Funcionario("Piccolo", 126, f1);
        Funcionario func4 = new Funcionario("Frezza", 127, f1);

        // FORMAÇÃO MÉDIA
        Funcionario func5 = new Funcionario("Bulma", 128, f2);
        Funcionario func6 = new Funcionario("Kuririn", 129, f2);
        Funcionario func7 = new Funcionario("Gohan", 131, f2);
        Funcionario func8 = new Funcionario("Trunks", 132, f2);

        // GRADUADO
        Funcionario func9 = new Funcionario("Videl", 134, f3);
        Funcionario func10 = new Funcionario("Shenlong", 135, f3);

        Empresa empresa = new Empresa();

        System.out.println("--------------- VERIFICA FORMAÇÃO -----------------");
        // FUNCIONÁRIO QUE NÃO ESTUDOU
        empresa.verificaFormacao(func0);
        // FUNCIONÁRIO QUE CONCLUIU O ENSINO BÁSICO
        empresa.verificaFormacao(func1);
        // FUNCIONÁRIO QUE CONCLUIU O ENSINO MÉDIO
        empresa.verificaFormacao(func5);
        // FUNCIONÁRIO QUE CONCLUIU A GRADUAÇÃO
        empresa.verificaFormacao(func9);

        System.out.println("------------------ RENDA INICIAL ------------------");
        System.out.println("R$" + df.format(func0.getRendaBasica()));
        System.out.println("R$" + df.format(func1.getRendaBasica()));
        System.out.println("R$" + df.format(func2.getRendaBasica()));
        System.out.println("R$" + df.format(func3.getRendaBasica()));
        System.out.println("R$" + df.format(func4.getRendaBasica()));
        System.out.println("R$" + df.format(func5.getRendaBasica()));
        System.out.println("R$" + df.format(func6.getRendaBasica()));
        System.out.println("R$" + df.format(func7.getRendaBasica()));
        System.out.println("R$" + df.format(func8.getRendaBasica()));
        System.out.println("R$" + df.format(func9.getRendaBasica()));
        System.out.println("R$" + df.format(func10.getRendaBasica()));

        System.out.println("------------------ RENDA APÓS FORMAÇÃO ------------------");
        empresa.cadastraFunc(func1);
        empresa.cadastraFunc(func2);
        empresa.cadastraFunc(func3);
        empresa.cadastraFunc(func4);
        empresa.cadastraFunc(func5);
        empresa.cadastraFunc(func6);
        empresa.cadastraFunc(func7);
        empresa.cadastraFunc(func8);
        empresa.cadastraFunc(func9);
        empresa.cadastraFunc(func10);

        empresa.mostraCadastro();

        System.out.println("CUSTO TOTAL: R$" + df.format(empresa.calculoCustoT()));
    }
}