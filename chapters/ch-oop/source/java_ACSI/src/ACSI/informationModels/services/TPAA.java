package ACSI.informationModels.services;

import util.SCSMspecific;

public abstract class TPAA extends ASSOCIATION {

	/**
	 * Shall specify the identification used to identify 
	 * the application associations 
	 */
	private SCSMspecific AssociationId;
	
	/**
	 * Shall represent the information required to grant 
	 * permission to access instances of a specific access
	 * view of a server.
	 */
	private SCSMspecific AuthenticationParameter;

	public SCSMspecific getAssociationId() {
		return AssociationId;
	}

	public void setAssociationId(SCSMspecific associationId) {
		AssociationId = associationId;
	}

	public SCSMspecific getAuthenticationParameter() {
		return AuthenticationParameter;
	}

	public void setAuthenticationParameter(SCSMspecific authenticationParameter) {
		AuthenticationParameter = authenticationParameter;
	}

	
}
