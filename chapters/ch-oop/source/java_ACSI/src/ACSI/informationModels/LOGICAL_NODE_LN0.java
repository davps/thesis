package ACSI.informationModels;

import ACSI.informationModels.services.controlBlock.GOOSE;
import ACSI.informationModels.services.controlBlock.GSSE;
import ACSI.informationModels.services.controlBlock.MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK;
import ACSI.informationModels.services.controlBlock.SETTING_GROUP_CONTROL_BLOCK;
import ACSI.informationModels.services.controlBlock.UNICAST_SAMPLE_VALUE_CONTROL_BLOCK;
import ACSI.noSeDondePoner.LOG;

public abstract class LOGICAL_NODE_LN0 extends LOGICAL_NODE {

	/**
	 * 
	 */
	private SETTING_GROUP_CONTROL_BLOCK SettingGroupControlBlock;
	
	/**
	 * 
	 */
	private LOG[] Log;
	
	/**
	 * 
	 */
	private GOOSE[] GOOSEControlBlock;
	
	/**
	 * 
	 */
	private GSSE[] GSSEControlBlock;
	
	/**
	 * 
	 */
	private MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK MulticastSampledValueControlBlock[];
	
	/**
	 * 
	 */
	private UNICAST_SAMPLE_VALUE_CONTROL_BLOCK UnicastSampledValueControlBlock;

	
	
	public SETTING_GROUP_CONTROL_BLOCK getSettingGroupControlBlock() {
		return SettingGroupControlBlock;
	}

	public void setSettingGroupControlBlock(
			SETTING_GROUP_CONTROL_BLOCK settingGroupControlBlock) {
		SettingGroupControlBlock = settingGroupControlBlock;
	}

	public LOG[] getLog() {
		return Log;
	}

	public void setLog(LOG[] log) {
		Log = log;
	}

	public GOOSE[] getGOOSEControlBlock() {
		return GOOSEControlBlock;
	}

	public void setGOOSEControlBlock(GOOSE[] controlBlock) {
		GOOSEControlBlock = controlBlock;
	}

	public GSSE[] getGSSEControlBlock() {
		return GSSEControlBlock;
	}

	public void setGSSEControlBlock(GSSE[] controlBlock) {
		GSSEControlBlock = controlBlock;
	}

	public MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK[] getMulticastSampledValueControlBlock() {
		return MulticastSampledValueControlBlock;
	}

	public void setMulticastSampledValueControlBlock(
			MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK[] multicastSampledValueControlBlock) {
		MulticastSampledValueControlBlock = multicastSampledValueControlBlock;
	}

	public UNICAST_SAMPLE_VALUE_CONTROL_BLOCK getUnicastSampledValueControlBlock() {
		return UnicastSampledValueControlBlock;
	}

	public void setUnicastSampledValueControlBlock(
			UNICAST_SAMPLE_VALUE_CONTROL_BLOCK unicastSampledValueControlBlock) {
		UnicastSampledValueControlBlock = unicastSampledValueControlBlock;
	}
	
	
}
