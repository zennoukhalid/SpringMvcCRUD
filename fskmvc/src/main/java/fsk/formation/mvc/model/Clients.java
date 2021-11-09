package fsk.formation.mvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Entity
public class Clients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String nom;
	
	@Column
	@Email
	private String email;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String tel;
	
	@Column
	@NotBlank
	@Size(max=20,min=3)
	private String ville;
	
	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
	@Valid
	private Abonnement abonnement;
	
	

	public Clients(long id, @NotBlank @Size(max = 20, min = 3) String nom, @Email String email,
			@NotBlank @Size(max = 20, min = 3) String tel, @NotBlank @Size(max = 20, min = 3) String ville,
			@Valid Abonnement abonnement) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
		this.ville = ville;
		this.abonnement = abonnement;
	}

	public Clients() {
		super();
	}

	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Clients [id=" + id + ", nom=" + nom + ", email=" + email + ", tel=" + tel + ", ville=" + ville + "]";
	}
	
	


	

	
	
}
