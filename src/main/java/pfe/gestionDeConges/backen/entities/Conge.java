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
public class Conge {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Agent agent;
	
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

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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

	private int nombreDeJours;
	private String type;
	private String interimaire;
	private String adresseConge;
	private String etat;

	public Conge() {
		super();
	}

	public Conge(Date dateDemande, Date dateDebut, Date dateFin, int nombreDeJours, String type, String interimaire,
			String adresseConge, String etat) {
		super();
		this.dateDemande = dateDemande;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nombreDeJours = nombreDeJours;
		this.type = type;
		this.interimaire = interimaire;
		this.adresseConge = adresseConge;
		this.etat = etat;
	}

}
