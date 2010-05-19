/**
 * The SERVER class represents the external visible behaviour of 
 * a device. All other ACSI models are part of the server.
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 17, cláusula 5.2 , párrafo
 * 
 * @author David Pérez
 *
 */

public abstract class SERVER_interface {

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
	public abstract String GetServerDirectory(String param);
}