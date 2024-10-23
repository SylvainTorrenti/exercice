package edu.lig03.objet.societe;

import java.util.Date;
import java.util.Objects;

public class Societe {

	private String siren;

	private FormeJuridique formeJuridique;

	private String raisonSociale;

	private Date datereation;

	private String telephone;

	private Long capital;

	public Societe(String siren, FormeJuridique formeJuridique, String raisonSociale, Date datereation,
			String telephone, Long capital) {
		super();
		this.siren = siren;
		this.formeJuridique = formeJuridique;
		this.raisonSociale = raisonSociale;
		this.datereation = datereation;
		this.telephone = telephone;
		this.capital = capital;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public FormeJuridique getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(FormeJuridique formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Date getDatereation() {
		return datereation;
	}

	public void setDatereation(Date datereation) {
		this.datereation = datereation;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return siren + " - " + raisonSociale;
	}

	@Override
	public int hashCode() {
		return Objects.hash(siren);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Societe other = (Societe) obj;
		return Objects.equals(siren, other.siren);
	}

//	@Override
//	public boolean equals(Object autre) {
//		Societe autreSociete = (Societe)autre;
//		return this.siren.equals(autreSociete.getSiren());
//	}

}
