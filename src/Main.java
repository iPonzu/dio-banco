public class Main {
    public static void main(String[] args) throws Exception {
        Cliente lucas = new Cliente();
        Cliente isabela = new Cliente();
        Cliente joao = new Cliente();
        Cliente leandro = new Cliente();


        joao.setNome("João");
        leandro.setNome("Leandro");
        lucas.setNome("Lucas");
        isabela.setNome("Isabela");

        Conta cc = new ContaCorrente(leandro);
        Conta poupanca = new ContaPoupanca(leandro);

        Conta cc2 = new ContaCorrente(joao);
        Conta poupanca2 = new ContaPoupanca(joao);

        Conta cc3 = new ContaCorrente(isabela);
        Conta poupanca3 = new ContaPoupanca(isabela);

        Conta cc4 = new ContaCorrente(lucas);
        Conta poupanca4 = new ContaPoupanca(lucas);

        cc2.depositar(1000);
        cc2.transferir(500, poupanca4);

        cc3.depositar(500);
        cc3.transferir(250, poupanca3);

        cc4.depositar(900);
        cc4.transferir(550, poupanca4);

        cc.depositar(100);
        cc.transferir(100, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();
        
        cc3.imprimirExtrato();
        poupanca3.imprimirExtrato();

        cc4.imprimirExtrato();
        poupanca4.imprimirExtrato();
    }
}
