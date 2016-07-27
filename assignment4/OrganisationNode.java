package session4.aassignment1;

public class OrganisationNode extends Node{
	
	private OrganizationProfile organizationProfile;
	
	public OrganisationNode() {
		super();
		this.organizationProfile=new OrganizationProfile();
	}

	public OrganizationProfile getOrganizationProfile() {
		return organizationProfile;
	}

	public void setOrganizationProfile(OrganizationProfile organizationProfile) {
		this.organizationProfile = organizationProfile;
	}

}
