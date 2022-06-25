package application;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Rascunho {

	public static void main(String[] args) {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		LocalDate d = LocalDate.of(2000, 04, 26);
		LocalDate a = LocalDate.of(2022, 06, 24);
		
		long anos = ChronoUnit.YEARS.between(d, a);
		
		
		System.out.println(anos);
		

		
		System.out.println();
	}

}
