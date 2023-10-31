package VeiculosExemplo;

public class Onibus  extends Veiculo{
	public Onibus (String placa, String modelo, String cor, int ano) {
	super (placa, modelo, cor, ano);
	}
	@Override
	public void acelerar () {
		System. out.println ("o ônibus está acelerando.");
	}
	@Override
	public void frear () {
		System.out.println ("o  onibus está freando.");
	}
	@Override
	public void virar () {
		System. out.println ("0 nibus está virando.I");
	}
	@Override
	public void ligar () {
		System. out.println ("0 ônibus está ligado.");
	}
}
