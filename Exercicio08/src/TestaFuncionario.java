public class TestaFuncionario {
    public static void main(String[] args) {
        // GERENTE
        Funcionario func1 = new Gerente("Goku");

        // SUPERVISORES
        Funcionario func2 = new Supervisor("Vegeta");
        Funcionario func3 = new Supervisor("Piccolo");

        // VENDEDORES
        Funcionario func4 = new Vendedor("Frezza");
        Funcionario func5 = new Vendedor("Bulma");
        Funcionario func6 = new Vendedor("Kuririn");
        Funcionario func7 = new Vendedor("Gohan");
        Funcionario func8 = new Vendedor("Trunks");
        Funcionario func9 = new Vendedor("Videl");
        Funcionario func10 = new Vendedor("Shenlong");

        // CADASTRO
        Empresa empresa = new Empresa();

        // EXIBIÇÃO
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
    }
}