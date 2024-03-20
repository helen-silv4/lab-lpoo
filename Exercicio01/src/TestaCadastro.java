import java.text.DecimalFormat;

public class TestaCadastro {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        // DATAS
        Data data1 = new Data(19,10,2004);
        Data data2 = new Data(25,12,1998);
        Data data3 = new Data(10,11,2006);

        // LOGRADOUROS
        Logradouro logradouro1 = new Logradouro("Rodovia Raposo Tavares");
        Logradouro logradouro2 = new Logradouro("Praça da República");
        Logradouro logradouro3 = new Logradouro("Avenida Afonso Pena");

        // ENDEREÇOS
        Endereco end1 = new Endereco(logradouro1, 15,"Casa", 77086720, "São Paulo", "sp");
        Endereco end2 = new Endereco(logradouro2, 788,"Apartamento", 10450017, "São Paulo", "sp");
        Endereco end3 = new Endereco(logradouro3, 90,"Casa 3", 30130005, "São Paulo", "sp");

        // CLIENTE E FUNCIONÁRIOS
        Cliente cliente = new Cliente("Helen Silva", data1, end1, 123);
        Funcionario funcionario = new Funcionario("Simone Souza", data2, end2, 2000.0f);
        Gerente gerente = new Gerente("José Júnior", data3, end3, 10000.0f, "Gerência Administrativa");

        // MÉTODO IMPOSTO
        System.out.println("Imposto do funcionário: R$" + df.format(funcionario.calculaImposto()));
        System.out.println("Imposto do gerente: R$" + df.format(gerente.calculaImposto()));

        // CADASTROS
        CadastroPessoas cadastros = new CadastroPessoas();

        cadastros.cadastraPessoa(cliente);
        cadastros.cadastraPessoa(funcionario);
        cadastros.cadastraPessoa(gerente);

        // EXIBIÇÃO
        cadastros.imprimeCadastro();
    }
}