public class Conta {

    private String numero;

    private double saldo;

    private Cliente cliente;

    public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	public Conta(String numero, Cliente cliente) {
		this(numero, 0.0, cliente);	
	}


	public Cliente getCliente() {
		return cliente;
	}


	public String getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setNumero(String string) {
		numero = string;
	}


	public void setSaldo(double d) {
		saldo = d;
	}

	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
	}


	public int debitar(double valor) {
		int r = -1;
		if(valor <= saldo){
			saldo = saldo - valor;
			r = 1;
		}
		return r;
	}

	public int transferir(Conta c, double v) {
		int r = -1;
		if(v <= saldo){
			this.debitar(v);
			c.creditar(v);
			r = 1;
		}
		return r;

	}

	@Override
	public String toString() {
		String result = "";
		
		result += "Conta Numero: " + this.getNumero() + "\n";
		result += "Saldo: " + this.getSaldo() + "\n";
		result += "Nome do cliente: " + this.getCliente().getNome();

		return result;
	}
}