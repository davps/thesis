public  class SERVER_v5 {

	public SERVER_v5() {
		// Default Constructor
	}
	
	public SERVER_v5(String[] serviceAccessPoint) {
		// Constructor using fields
		ServiceAccessPoint = serviceAccessPoint;
	}

	private String[] ServiceAccessPoint;
	
	public String[] getServiceAccessPoint() {
		return ServiceAccessPoint;
	}

	public void setServiceAccessPoint(String[] serviceAccessPoint) {
		ServiceAccessPoint = serviceAccessPoint;
	}

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 6.
	 */
	public String GetServerDirectory(String param) {
		return null;
	}
}