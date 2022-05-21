package pfe.gestionDeConges.backen.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Decision {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	@Temporal(TemporalType.DATE)
	private Date dateRetour;
	private int nombreDeJours;
	private String type;
	private String interimaire;
	private String adresseConge;
	private String etat;
	private int matricule;
	private String nom;
	private String prenom;
	private String fonction;
	private String grade;
	private int telephone;
	private String email;
		
//	private Long compte_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compte_id", referencedColumnName = "id")
    private Compte compte;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public int getNombreDeJours() {
		return nombreDeJours;
	}

	public void setNombreDeJours(int nombreDeJours) {
		this.nombreDeJours = nombreDeJours;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInterimaire() {
		return interimaire;
	}

	public void setInterimaire(String interimaire) {
		this.interimaire = interimaire;
	}

	public String getAdresseConge() {
		return adresseConge;
	}

	public void setAdresseConge(String adresseConge) {
		this.adresseConge = adresseConge;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getmatricule() {
		return matricule;
	}
	public void setmatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}
	public String getprenomt() {
		return prenom;
	}

	public void setprenom(String prenom) {
		this.prenom = prenom;
	}
	public String getfonction() {
		return fonction;
	}

	public void setfonction(String fonction) {
		this.fonction = fonction;
	}
	public String getgrade() {
		return grade;
	}

	public void setgrade(String grade) {
		this.grade = grade;
	}
	public int gettelephone() {
		return telephone;
	}

	public void settelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public Decision() {
		super();
	}

	public Decision(Date dateDemande, Date dateDepart, Date dateRetour, int nombreDeJours, String type, String interimaire,
			String adresseConge, String etat, int matricule, String nom, String prenom, String fonction, String grade, int telephone, String email,Long compte) {
		super();
		this.dateDemande = dateDemande;
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.nombreDeJours = nombreDeJours;
		this.type = type;
		this.interimaire = interimaire;
		this.adresseConge = adresseConge;
		this.etat = etat;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.grade = grade;
		this.telephone = telephone;
		this.email = email;
      this.compte.setId(compte);
	}

}
