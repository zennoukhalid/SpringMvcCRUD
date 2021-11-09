package fsk.formation.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class gsmSubscription extends Abonnement {
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String nbrPoint;
	
	
	public gsmSubscription(long id, @NotBlank @Size(max = 20, min = 3) String num,
			@NotBlank @Size(max = 20, min = 3) String name, @NotBlank @Size(max = 20, min = 3) String date,
			@NotBlank @Size(max = 20, min = 3) String balance, @NotBlank @Size(max = 20, min = 3) String type,
			Clients client, @NotBlank @Size(max = 20, min = 3) String nbrPoint) {
		super(id, num, name, date, balance, type, client);
		this.nbrPoint = nbrPoint;
	}

	public gsmSubscription(long id, @NotBlank @Size(max = 20, min = 3) String num,
			@NotBlank @Size(max = 20, min = 3) String name, @NotBlank @Size(max = 20, min = 3) String date,
			@NotBlank @Size(max = 20, min = 3) String balance, @NotBlank @Size(max = 20, min = 3) String type,
			Clients client) {
		super(id, num, name, date, balance, type, client);
	}

	public String getNbrPoint() {
		return nbrPoint;
	}

	public void setNbrPoint(String nbrPoint) {
		this.nbrPoint = nbrPoint;
	}

	@Override
	public String toString() {
		return "gsm_subscription [nbrPoint=" + nbrPoint + "]";
	}
	
	
}
