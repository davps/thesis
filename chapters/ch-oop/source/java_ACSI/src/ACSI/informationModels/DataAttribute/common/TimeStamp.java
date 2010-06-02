/**
 * TimeStamp type
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
import ACSI.informationModels.DataAttribute.CompositeComponent;
import ACSI.informationModels.DataAttribute.Prescence;

public class TimeStamp extends CompositeComponent{

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
	
	
	private java.sql.Timestamp timeStamp;
	
	public TimeStamp(long arg0) {
		timeStamp = new java.sql.Timestamp(arg0);
	}

	@Override
	public String Name() {
		return "TimeStamp";
		
	}

	@Override
	public String Presence() {
		return "M";
	}

	
	public int getSecondSinceEpoch() {
		//TODO verificar si está bien. Probar la clase timestamp
		this.SecondSinceEpoch = timeStamp.getNanos();
		return this.SecondSinceEpoch;
	}

	public void setSecondSinceEpoch(int secondSinceEpoch) {
		this.SecondSinceEpoch = secondSinceEpoch;
	}

	public int getFractionOfSecond() {
		/*
		 * TODO falta implementar, ver la parte 7-2, 
		 * cláusula 5.5.3.7.3.2  
		 */
		return this.FractionOfSecond;
	}

	public void setFractionOfSecond(int fractionOfSecond) {
		this.FractionOfSecond = fractionOfSecond;
	}

	public TimeQuality getTimeQuality() {
		return this.TimeQuality;
	}

	public void setTimeQuality(TimeQuality timeQuality) {
		this.TimeQuality = timeQuality;
	}
	
}
