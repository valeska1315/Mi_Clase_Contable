
public class Principal {

	public static void main(String[] args) {

		OperacionesContables operacion = new OperacionesContables();
		System.out.println(operacion.suma2(100, 100));
		
		System.out.println(operacion.impuesto(200));
		
		double impuesto = (operacion.impuesto(200));
		double costo = operacion.resta2(64, 32);
		
		System.out.println(operacion.resta2(costo, impuesto));
		
		System.out.println(operacion.igss(3000));
		
		System.out.println(operacion.bono14(3000, 10));
		
		System.out.println(operacion.aguinaldo(3000));
		
		System.out.println(operacion.BoletoHonorario(1000));
		
		System.out.println(operacion.isr(3000));
		
	}

}
