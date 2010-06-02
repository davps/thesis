/**
 * The SERVER class represents the external visible behaviour of 
 * a device. All other ACSI models are part of the server.
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 17, cláusula 5.2 , párrafo
 * 
 * @author David Pérez
 *
 */

package ACSI.informationModels;

import ACSI.informationModels.services.ASSOCIATION;
import ACSI.informationModels.services.controlBlock.File;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 17]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */
public abstract class SERVER {

	private String[] ServiceAccessPoint;
	
	private LOGICAL_DEVICE[] LogicalDevice;
	
	private File File;
	
	private ASSOCIATION TPAppAssociation;
	
	private ASSOCIATION MCAppAssociation;
	
	
	
	public String[] getServiceAccessPoint() {
		return ServiceAccessPoint;
	}
	public void setServiceAccessPoint(String[] serviceAccessPoint) {
		ServiceAccessPoint = serviceAccessPoint;
	}
	public LOGICAL_DEVICE[] getLogicalDevice() {
		return LogicalDevice;
	}
	public void setLogicalDevice(LOGICAL_DEVICE[] logicalDevice) {
		LogicalDevice = logicalDevice;
	}
	public File getFile() {
		return File;
	}
	public void setFile(File file) {
		File = file;
	}
	public ASSOCIATION getTPAppAssociation() {
		return TPAppAssociation;
	}
	public void setTPAppAssociation(ASSOCIATION appAssociation) {
		TPAppAssociation = appAssociation;
	}
	public ASSOCIATION getMCAppAssociation() {
		return MCAppAssociation;
	}
	public void setMCAppAssociation(ASSOCIATION appAssociation) {
		MCAppAssociation = appAssociation;
	}
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 6.
	 */
	//TODO cambiar el void por otro parametro real
	public abstract String GetServerDirectory(LOGICAL_DEVICE LD);
	public abstract String GetServerDirectory(File Fl);
}

//TODO no usado