import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");

        Vendedor v = new Vendedor();
        Supervisor s = new Supervisor();
        Gerente g = new Gerente();

        System.out.println("Comissão do Vendedor: R$" + df.format(v.verificaComissao()));
        System.out.println("Comissão do Supervisor: R$" + df.format(s.verificaComissao()));
        System.out.println("Comissão do Gerente: R$" + df.format(g.verificaComissao()));
    }
}