/**
 * contains  the  information  produced  and  consumed  by a  domain-specific 
 * application function, for example, overvoltage protection or circuit-breaker
 * 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 17, cláusula 5.2 , párrafo
 */
package ACSI.informationModels;

import ACSI.informationModels.services.controlBlock.BUFFERED_REPORT_CONTROL_BLOCK;
import ACSI.informationModels.services.controlBlock.DATA_SET;
import ACSI.informationModels.services.controlBlock.LOG_CONTROL_BLOCK;
import ACSI.informationModels.services.controlBlock.UNBUFFERED_REPORT_CONTROL_BLOCK;
import ACSI.informationModels.services.error.ServiceError;
import ACSI.noSeDondePoner.FunctionalConstraint;

/*
 * El nombre en mayúscula de esta clase la obtuve de [7-2, clause 5.3, pp 17]
 * y el guión bajo _ lo uso en vez del guión - porque java no permite guion - 
 */

/**
 * Explicado en la clausula 9 de la parte IEC 61850-7-2.
 */
public abstract class LOGICAL_NODE {

	/**
	 * Instance name of an instance of LOGICAL-NODE
	 * 
	 * Shall  unambiguously  identify  LOGICAL-NODE  
	 * within  the  scope  of LOGICAL-DEVICE
	 */
	private String LNName;
	
	
	/**
	 * Path-name of an instance of LOGICAL-NODE 
	 * 
	 * The attribute LNRef shall be the unique path-name 
	 * of a LOGICAL-NODE. The ObjectReference LNRef shall be:
	 * LDName/LNName
	 */
	private String LNRef;

	
	//TODO: mejorar esta descripcion, hablar en forma más concreta
	/**
	 * The  attribute  Data  shall  identify  DATA  
	 * (see part 7-2, clause  10)  that  is  contained  
	 * in  the LOGICAL-NODE
	 */
	private DATA[] Data;

	//TODO: mejorar esta descripcion, hablar en forma más concreta
	/**
	 * The  attribute  DataSet  shall  identify  a  
	 * DATA-SET  (see  Clause  11)  that  is  contained  
	 * in  the LOGICAL-NODE.
	 */
	private DATA_SET[] DataSet;
	
	
	/**
	 * 
	 */
	private BUFFERED_REPORT_CONTROL_BLOCK[] BufferedReportControlBlock;
	
	
	/**
	 * 
	 */
	private UNBUFFERED_REPORT_CONTROL_BLOCK UnbufferedReportControlBlock;
	
	
	/**
	 * 
	 */
	private LOG_CONTROL_BLOCK[] LogControlBlock;
	
	
	public String getLNName() {
		return LNName;
	}

	public void setLNName(String name) {
		LNName = name;
	}

	public String getLNRef() {
		return LNRef;
	}

	public void setLNRef(String ref) {
		LNRef = ref;
	}

	public DATA[] getData() {
		return Data;
	}

	public void setData(DATA[] data) {
		Data = data;
	}

	public DATA_SET[] getDataSet() {
		return DataSet;
	}

	public void setDataSet(DATA_SET[] dataSet) {
		DataSet = dataSet;
	}

	public BUFFERED_REPORT_CONTROL_BLOCK[] getBufferedReportControlBlock() {
		return BufferedReportControlBlock;
	}

	public void setBufferedReportControlBlock(
			BUFFERED_REPORT_CONTROL_BLOCK[] bufferedReportControlBlock) {
		BufferedReportControlBlock = bufferedReportControlBlock;
	}

	public UNBUFFERED_REPORT_CONTROL_BLOCK getUnbufferedReportControlBlock() {
		return UnbufferedReportControlBlock;
	}

	public void setUnbufferedReportControlBlock(
			UNBUFFERED_REPORT_CONTROL_BLOCK unbufferedReportControlBlock) {
		UnbufferedReportControlBlock = unbufferedReportControlBlock;
	}

	public LOG_CONTROL_BLOCK[] getLogControlBlock() {
		return LogControlBlock;
	}

	public void setLogControlBlock(LOG_CONTROL_BLOCK[] logControlBlock) {
		LogControlBlock = logControlBlock;
	}

	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 * Explicado en la cláusula 9.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract String GetLogicalNodeDirectory(String Request) throws ServiceError;
	public abstract String GetLogicalNodeDirectory(ACSIClass Request) throws ServiceError;

	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * página 21, cláusula 5.4, tabla 1
	 */
	public abstract Object GetAllDataValues(String Request) throws ServiceError;
	public abstract Object GetAllDataValues(FunctionalConstraint Request) throws ServiceError;

}

//TODO no usado