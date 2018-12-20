package iut.fr.FizzBuzz;

public class FizzBuzz {
	

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz=new RegleFizzBuzz();
		if (regleFizzBuzz.estVerifieePar(nombre))
			return RegleFizzBuzz.valeurAAfficherSiRegleVerifiee();

		if (isBuzz(nombre))
			return "buzz";

		if (isFizz(nombre))
			return "fizz";
		if(isbang(nombre))
			return "bang";
		if (isFizzbang(nombre))
			return "fizzbang";
		if (isbuzzbang(nombre))
			return "buzzbang";
		if(isfizzbuzzbang(nombre))
			return "fizzbuzzbang";

		return String.valueOf(nombre);
	}

	public static boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}
	private boolean isbang(Integer nombre) {
		return 0 == nombre % 7;
	}
	private boolean isFizzbang(Integer nombre) {
		if(isFizz(nombre)&& isbang(nombre)) 
			return true;
		else return false;
	}
	private boolean isbuzzbang(Integer nombre) {
		if(isBuzz(nombre)&& isbang(nombre)) 
			return true;
		else return false;
	}
	private boolean isfizzbuzzbang(Integer nombre) {
		if(isFizz(nombre)&&isBuzz(nombre)&&isbang(nombre)) 
			return true;
		else return false;
	}
	
	

}
