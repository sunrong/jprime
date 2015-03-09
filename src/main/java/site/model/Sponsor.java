package site.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Sponsor extends User {
	
	@Enumerated(EnumType.STRING)
	private SponsorPackage sponsorPackage;

	private String companyName;
	
	@Lob
	private byte[] logo;
	
	private String companyWebsite;
	
	private String description;


	public SponsorPackage getSponsorPackage() {
		return sponsorPackage;
	}

	public void setSponsorPackage(SponsorPackage sponsorPackage) {
		this.sponsorPackage = sponsorPackage;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
}
