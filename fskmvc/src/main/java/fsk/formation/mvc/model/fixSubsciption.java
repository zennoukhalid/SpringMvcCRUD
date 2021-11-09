package fsk.formation.mvc.model;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class fixSubsciption extends Abonnement{
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String debit;

	public fixSubsciption(long id, @NotBlank @Size(max = 20, min = 3) String num,
			@NotBlank @Size(max = 20, min = 3) String name, @NotBlank @Size(max = 20, min = 3) String date,
			@NotBlank @Size(max = 20, min = 3) String balance, @NotBlank @Size(max = 20, min = 3) String type,
			Clients client, @NotBlank @Size(max = 20, min = 3) String debit) {
		super(id, num, name, date, balance, type, client);
		this.debit = debit;
	}

	public fixSubsciption(long id, @NotBlank @Size(max = 20, min = 3) String num,
			@NotBlank @Size(max = 20, min = 3) String name, @NotBlank @Size(max = 20, min = 3) String date,
			@NotBlank @Size(max = 20, min = 3) String balance, @NotBlank @Size(max = 20, min = 3) String type,
			Clients client) {
		super(id, num, name, date, balance, type, client);
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	@Override
	public String toString() {
		return "fixSubsciption [debit=" + debit + "]";
	}
	
}
