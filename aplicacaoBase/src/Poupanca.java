public class Poupanca extends Conta {

    public void renderJuros(double juros) {
        super.creditar(juros * this.getSaldo());
    }

    public Poupanca(String numero, Cliente cliente) {
        super(numero, 0.0, cliente);
    }

    public Poupanca(String numero, double saldo, Cliente cliente){
        super(numero, saldo, cliente);
    }
}