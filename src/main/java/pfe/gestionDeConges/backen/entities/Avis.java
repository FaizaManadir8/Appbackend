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
public class Avis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateReprise;
	private int matricule;
	private String nom;
	private String prenom;
	private String grade;
	private String fonction;
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateReprise() {
		return dateReprise;
	}

	public void setDateReprise(Date dateReprise) {
		this.dateReprise = dateReprise;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setmatricule(int matricule) {
		this.matricule = matricule;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	

	public Avis() {
		super();
	}

	public Avis(Date dateDemande, Date dateDebut, Date dateReprise, int matricule, String nom, String prenom,
			String grade, String fonction,Long compte) {
		super();
		this.dateDemande = dateDemande;
		this.dateDebut = dateDebut;
		this.dateReprise = dateReprise;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.fonction = fonction;
      this.compte.setId(compte);
	}

	
	

}