package pfe.gestionDeConges.backen.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String login;
    private String password;
    private String privilege;
    private String cin;
    private String nom;
    private String prenom;
    private String mail;
    private String telephone;


//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "compte_id")
//    private Conge conge;

    public Compte() {
    }

    public Compte(String login, String password, String privilege,String cin, String nom, String prenom, String mail, String telephone) {
        this.login = login;
        this.password = password;
        this.privilege = privilege;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPrivilege() {
        return privilege;
    }

//    public Personne getPersonne() {
//        return personne;
//    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

//    public void setConge(Long conge) {
//        this.conge = conge;
//    }

	public void setId(Long id) {
		this.id = id;
	}
    
    
}
