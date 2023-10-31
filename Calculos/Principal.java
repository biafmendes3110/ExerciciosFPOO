package Calculos;

public class Principal extends Calculando{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculos calculando  = new Calculando(); 
		System.out.println(calculando.somar(10, 10)); 
		System.out.println(calculando.sub(10,10));
		System.out.println(calculando.mult(10,10));
		System.out.println(calculando.div(10,10));
		System.out.println(calculando.exp(10,10));

	}
}


