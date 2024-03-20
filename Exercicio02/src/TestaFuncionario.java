public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario func1 = new Vendedor(100);
        Funcionario func2 = new Gerente_geral(100);
        Funcionario func3 = new Gerente_regional(100);

        System.out.printf("Comissão do vendedor: R$%.2f", func1.calculoComissao());
        System.out.println("");
        System.out.printf("Comissão do gerente regional: R$%.2f", func2.calculoComissao());
        System.out.println("");
        System.out.printf("Comissão do gerente geral: R$%.2f", func3.calculoComissao());
    }
}