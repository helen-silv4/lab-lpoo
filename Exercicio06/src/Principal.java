import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        Funcionario v = new Vendedor();
        Funcionario s = new Supervisor();
        Funcionario g = new Gerente();

        System.out.println("------------------------- COMISSÕES ---------------------------");
        System.out.println("Comissão do Vendedor: R$" + df.format(v.verificaComissao()));
        System.out.println("Comissão do Supervisor: R$" + df.format(s.verificaComissao()));
        System.out.println("Comissão do Gerente: R$" + df.format(g.verificaComissao()));

        System.out.println("\n----------- RENDA TOTAL COM ADICIONAL DA COMISSAO -----------");
        System.out.println("Renda total do Vendedor: R$" + df.format(v.rendaTotal()));
        System.out.println("Renda total do Supervisor: R$" + df.format(s.rendaTotal()));
        System.out.println("Renda total do Gerente: R$" + df.format(g.rendaTotal()));
    }
}