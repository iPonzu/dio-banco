public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
        public void sacar(double valor) {
            saldo -= valor;
        }
    @Override
        public void depositar(double valor){
            saldo += valor;
        }
    @Override
        public void transferir(double valor, IConta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }

    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: ", this.cliente.getNome()));
        System.out.println(String.format("Agencia: ", this.agencia));
        System.out.println(String.format("Numero: ", this.numero));
        System.out.println(String.format("Saldo", this.saldo));
    }
}
