/**
 * The TriggerConditions type shall represent the trigger 
 * conditions used to trigger processing
 * reports and logs (see Table 10).
 */

package ACSI.informationModels.DataAttribute.common;

import util.PACKET_LIST;

/*
 * Observacion: si dejo de heredar DAType a través del PacketList
 * entonces debo volver a revisar la clase DATA, 
 * tabla 16, clausula 10.2.1 de la parte 7-2
 * donde el tipo de datos del atributo DataAttribute debe ser
 * Trigger conditions, alla yo solo coloco que el tipo de 
 * datos debe ser DAType porque TriggerConditions hereda 
 * esta clase y por polimorfismo va a entrar sin problemas.
 */
public class TriggerConditions extends PACKET_LIST {
	
	private boolean data_change;
	
	private boolean quality_change;
	
	private boolean data_update;
	
	private boolean integrity;
	
	private boolean general_interrogation;
	
	
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

	public boolean isData_change() {
		return data_change;
	}

	public void setData_change(boolean data_change) {
		this.data_change = data_change;
	}

	public boolean isQuality_change() {
		return quality_change;
	}

	public void setQuality_change(boolean quality_change) {
		this.quality_change = quality_change;
	}

	public boolean isData_update() {
		return data_update;
	}

	public void setData_update(boolean data_update) {
		this.data_update = data_update;
	}

	public boolean isIntegrity() {
		return integrity;
	}

	public void setIntegrity(boolean integrity) {
		this.integrity = integrity;
	}

	public boolean isGeneral_interrogation() {
		return general_interrogation;
	}

	public void setGeneral_interrogation(boolean general_interrogation) {
		this.general_interrogation = general_interrogation;
	}


}
