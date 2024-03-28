public class Principal {
    public static void main(String[] args) {

        EmpregadoComissionado empCom = new EmpregadoComissionado("Naruto", "Uzumaki", 1500.00, 10.00);
        EmpregadoHorista empHor = new EmpregadoHorista("Kakashi", "Hataki", 200.00, 5);

        System.out.println("----------------- EMPREGADO COMISSIONADO -----------------");

        // Adiona Vendas
        empCom.adicionaVendas(10);

        // Cálculo Pagamento
        empCom.calculaPagamento();

        // Imprime Cheque
        System.out.print("Cheque: (");
        empCom.imprimeCheque();
        System.out.println(")");

        // Imprime Dados
        empCom.imprimeDados();

        System.out.println("\n--------------------- ZERANDO VENDAS ---------------------");

        empCom.zerarVendas();

        System.out.print("Cheque: (");
        empCom.imprimeCheque();
        System.out.println(")");

        empCom.imprimeDados();

        System.out.println("\n-------------------- EMPREGADO HORISTA -------------------");

        empHor.calculaPagamento();

        empHor.imprimeDados();

        System.out.println("\n-------------------- TOTAL EMPREGADOS --------------------");
        System.out.println("Total de empregados instânciados: " + empCom.getTotalEmpregados());
    }
}