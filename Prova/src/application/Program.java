package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) throws ParseException {

	//	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		LocalDate enddate = LocalDate.of(2022, 06, 24);
	//	Scanner sc = new Scanner(System.in);
		String signo = null;
	//	String name = "Thiago";
		LocalDate dat_nascto = LocalDate.of(1984, 06, 28);
		
		long calculaIdade = ChronoUnit.YEARS.between(dat_nascto, enddate);
		
		long calculeSigno =  dat_nascto.getDayOfYear();   // ChronoUnit.DAYS.between(dat_nascto, dat_nascto)	;	
		
		if(calculeSigno < 187) {
			signo = "Câncer";
		}else if (calculeSigno < 365) {
			signo = "Capricornio";
		}
		else if (calculeSigno < 365) {
			signo = "Capricornio";
		}
		else if (calculeSigno < 365) {
			signo = "Capricornio";
		}
		else if (calculeSigno < 365) {
			signo = "Capricornio";
		}
		else if (calculeSigno < 365) {
			signo = "Capricornio";
		}
		
		
		JOptionPane.showMessageDialog(null, "Thiago," +" você tem " +calculaIdade +" anos" +"e seu signo é " +signo);

	}

}
