/**
 * EntryTime type
 * 
 * The   type   EntryTime   shall   represent   the   time   
 * and   date   as   applied   internally   for   the
 * communication, reporting, logging, and subsystem as 
 * specified by a SCSM.
 * 
 * The  relation  between  a  time  stamp  value,  the  
 * synchronization  of  an  internal  time  with  an
 * external  time  source  (for  example,  UTC  time),  
 * and  other  time-model-related  information  are
 * defined in IEC 61850 parte 7-2 Clause 18.
 * 
 *  @category IEC 61850 parte 7-2 (2003)
 *  página 25, cláusula 5.5.3.7 , párrafo
 *  
 * @author David Perez
 * 
 */



package ACSI.informationModels.DataAttribute.common;

import ACSI.informationModels.DataAttribute.BasicType;
import ACSI.informationModels.DataAttribute.Prescence;
import ACSI.informationModels.DataAttribute.PrimitiveComponent;

public class EntryTime extends PrimitiveComponent{
	
	@Metadata(attributeName="SecondSinceEpoch", 
			attributeType=BasicType.INT32, M_O=Prescence.Mandatory)
	private int SecondSinceEpoch;
	
	@Metadata(attributeName="FractionOfSecond",
			attributeType=BasicType.INT24U, M_O=Prescence.Mandatory)
	private int FractionOfSecond;

	/*
	 * TODO: este atributo aún no está terminado, debo
	 * realizarlo luego, es que aún no tengo la clase TimeQuality
	 * El metadata-attributeType también debe ser arreglado
	 */
	@Metadata(attributeName="TimeQuality",
			attributeType="TimeQuality", M_O=Prescence.Mandatory)
	private TimeQuality TimeQuality;
	
	
	private java.sql.Timestamp entryTime;
	
	
	public EntryTime(long arg0) {
		entryTime = new java.sql.Timestamp(arg0);
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Presence() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSecondSinceEpoch() {
		//TODO verificar si está bien. Probar la clase timestamp
		this.SecondSinceEpoch = entryTime.getNanos();
		return SecondSinceEpoch;
	}

	public void setSecondSinceEpoch(int secondSinceEpoch) {
		SecondSinceEpoch = secondSinceEpoch;
	}

	public int getFractionOfSecond() {
		return FractionOfSecond;
	}

	public void setFractionOfSecond(int fractionOfSecond) {
		FractionOfSecond = fractionOfSecond;
	}

	public TimeQuality getTimeQuality() {
		return TimeQuality;
	}

	public void setTimeQuality(TimeQuality timeQuality) {
		TimeQuality = timeQuality;
	}
}