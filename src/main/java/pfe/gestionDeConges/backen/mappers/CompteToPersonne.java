package pfe.gestionDeConges.backen.mappers;

import pfe.gestionDeConges.backen.entities.Compte;

public class CompteToPersonne {

    private Long id;
    private String login;
    private String privilege;
	public CompteToPersonne(Long id, String login, String privilege) {
		super();
		this.id = id;
		this.login = login;
		this.privilege = privilege;
	}
	public CompteToPersonne() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
    
	public CompteToPersonne mapCompteToClient(Compte compte){
		CompteToPersonne client = new CompteToPersonne();
		client.setId(compte.getId());
		client.setLogin(compte.getLogin());
		client.setPrivilege(compte.getPrivilege());
		return client;
	}
}
