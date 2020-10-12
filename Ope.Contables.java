
public class OpeContables {

	public static double suma2(double a, double b) {
		double resultado= a+b;
		return resultado;
	}
	public static double resta2(double n1, double n2) {
		double resultado= n1-n2;
		return resultado;
	}
	public static double impuesto(double cantidad) {
		double resultado = cantidad*0.12;
		return resultado;		
	}
	public static double igss(double SueldoBase) {
		double resultado = SueldoBase*0.0483;
		return resultado;
	}
	public static double bono14(double SueldoBase, double DiasLaborados ) {
		double resultado = SueldoBase*DiasLaborados/365;
		return resultado;
		
	}
	public static double aguinaldo(double Salario) {
		double salarioDiario = Salario/30;
		double resultado = salarioDiario*15;
		return resultado;
	}
	public static double BoletoHonorario(double MontoBruto) {
		double resultado = MontoBruto*0.1075;
		return resultado;
	}
	public static double isr(double RentaImponible) {
		double resultado = RentaImponible*0.5;
		return resultado;
		
	}

}
