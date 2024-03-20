public class TestaFuncionario {
    public static void main(String[] args) {
        Cargo cargo1 = new Cargo("Gerente");
        Cargo cargo2 = new Cargo("Supervisor");
        Cargo cargo3 = new Cargo("Vendedor");

        // GERENTE
        Funcionario func1 = new Funcionario("Goku", cargo1);

        // SUPERVISORES
        Funcionario func2 = new Funcionario("Vegeta", cargo2);
        Funcionario func3 = new Funcionario("Piccolo", cargo2);

        // VENDEDORES
        Funcionario func4 = new Funcionario("Frezza", cargo3);
        Funcionario func5 = new Funcionario("Bulma", cargo3);
        Funcionario func6 = new Funcionario("Kuririn", cargo3);
        Funcionario func7 = new Funcionario("Gohan", cargo3);
        Funcionario func8 = new Funcionario("Trunks", cargo3);
        Funcionario func9 = new Funcionario("Videl", cargo3);
        Funcionario func10 = new Funcionario("Shenlong", cargo3);

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