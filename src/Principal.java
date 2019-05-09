
public class Principal {

	public static void main(String[] args) {

		double a = 10d;
		double b = 0d;

		try {
			double resultado = dividir(a, b);
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static double dividir(double a, double b) throws Exception {
		if (b == 0) {
			throw new Exception("Não é possivel dividir por 0");
		} else {
			return a / b;
		}
	}
}
