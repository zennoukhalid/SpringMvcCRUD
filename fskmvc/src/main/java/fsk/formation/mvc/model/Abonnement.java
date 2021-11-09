package fsk.formation.mvc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Abonnement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String num;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String name;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String date;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String balance;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String type;
	
	@OneToOne
	private Clients client;

	public Abonnement(long id, @NotBlank @Size(max = 20, min = 3) String num,
			@NotBlank @Size(max = 20, min = 3) String name, @NotBlank @Size(max = 20, min = 3) String date,
			@NotBlank @Size(max = 20, min = 3) String balance, @NotBlank @Size(max = 20, min = 3) String type,
			Clients client) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.date = date;
		this.balance = balance;
		this.type = type;
		this.client = client;
	}

	public Abonnement() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Abonnement [id=" + id + ", num=" + num + ", name=" + name + ", date=" + date + ", balance=" + balance
				+ ", type=" + type + "]";
	}
	
	
}
