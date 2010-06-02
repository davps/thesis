/**
 * provide means to specify typed information, for example, 
 * position of a switch with quality information and timestamp, 
 * contained in LOGICAL-NODEs.
 * 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 17, cláusula 5.2 , párrafo
 */
package ACSI.informationModels;

import ACSI.informationModels.DataAttribute.DAType;
import ACSI.noSeDondePoner.COMMON_DATA;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 17]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */
public abstract class DATA extends ACSIClass {

	/**
	 * Instance name of an instance of DATA,
	 * for example, PhV (1st level), phsA (2nd level)
	 */
	private String DataName;
	
	/**
	 * Path-name of an instance of DATA,
	 * for example, MMXU1.PhV or
	 * for example, MMXU1.PhV.PhsA
	 */
	private String DataRef;
	
	/**
	 * Indicates mandatory/optional
	 */
	private boolean Prescence;
	
	/**
	 * For example, Vector class of IEC 61850-7-3
	 * for example, MX for example, dchg
	 */
	private DAType[] DataAttribute;
	
	/**
	 * Specializations of DATA
	 * For example, WYE class of IEC 61850-7-3
	 */
	private DATA[] CompositeCDC;
	
	/*
	 * TODO esta clase COMMON_DATA esta abusolutamente mal
	 * debo darle prioridad a mejorar esto
	 */
	/**
	 * Specializations of DATA
	 * For example, CMV class of IEC 61850-7-3
	 */
	private COMMON_DATA SimpleCDC[];
	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 10.
	 */
	
	
	
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataValues();

	public String getDataName() {
		return DataName;
	}

	public void setDataName(String dataName) {
		DataName = dataName;
	}

	public String getDataRef() {
		return DataRef;
	}

	public void setDataRef(String dataRef) {
		DataRef = dataRef;
	}

	public boolean isPrescence() {
		return Prescence;
	}

	public void setPrescence(boolean prescence) {
		Prescence = prescence;
	}

	public DAType[] getDataAttribute() {
		return DataAttribute;
	}

	public void setDataAttribute(DAType[] dataAttribute) {
		DataAttribute = dataAttribute;
	}

	public DATA[] getCompositeCDC() {
		return CompositeCDC;
	}

	public void setCompositeCDC(DATA[] compositeCDC) {
		CompositeCDC = compositeCDC;
	}

	public COMMON_DATA[] getSimpleCDC() {
		return SimpleCDC;
	}

	public void setSimpleCDC(COMMON_DATA[] simpleCDC) {
		SimpleCDC = simpleCDC;
	}

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 10.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetDataValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 10.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataDirectory();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1 <br>
	 * Explicado en la cláusula 10.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataDefinition();
}

//TODO no usado
