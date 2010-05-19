public  class SERVER_v4 {

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