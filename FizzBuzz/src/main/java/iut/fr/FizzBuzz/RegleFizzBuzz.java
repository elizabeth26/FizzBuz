package iut.fr.FizzBuzz;

public class RegleFizzBuzz {

	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	public static String valeurAAfficherSiRegleVerifiee() {
		return "fizzbuzz";
	}

}
