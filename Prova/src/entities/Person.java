/*package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;


public class Person {

	private String name;
	private Date dat_nascto;
	private int idade = 0;
	private LocalDate endDate = ;

	Calendar calend = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");

	public Person(String name, Date dat_nascto2) {
		this.name = name;
		this.dat_nascto = dat_nascto2;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDat_nascto() {
		return dat_nascto;
	}

	public void setDat_nascto(Date dat_nascto) {
		this.dat_nascto = dat_nascto;
	}

	public int calculaIdade() {

		return this.idade = Period.between(sdf.parse(dat_nascto), endDate).getYears();
		
		
	}

	

	@Override
	public String toString() {
		return "Person [name=" + name + ", dat_nascto=" + ", sdf=" + sdf + "]";
	}

}
*/