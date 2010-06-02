package ACSI.informationModels.DataAttribute.common;

import ACSI.informationModels.DataAttribute.Prescence;
import util.CODED_ENUM;
import util.PACKET_LIST;

public class TimeQuality extends PACKET_LIST {

	
	public TimeQuality(boolean leapSecondsKnown, boolean clockFailure,
			boolean clockNotSynchronized, CODED_ENUM timeAccuracy) {
		super();
		this.LeapSecondsKnown = leapSecondsKnown;
		this.ClockFailure = clockFailure;
		this.ClockNotSynchronized = clockNotSynchronized;
		this.TimeAccuracy = timeAccuracy;
	}
	
	@Metadata(M_O=Prescence.Mandatory)
	public boolean LeapSecondsKnown;
	
	@Metadata(M_O=Prescence.Mandatory)
	private boolean ClockFailure;
	
	@Metadata(M_O=Prescence.Optional)
	private boolean ClockNotSynchronized;
	
	@Metadata(M_O=Prescence.Mandatory)
	private CODED_ENUM TimeAccuracy;
	
	public boolean isLeapSecondsKnown() {
		return LeapSecondsKnown;
	}
	public void setLeapSecondsKnown(boolean leapSecondsKnown) {
		LeapSecondsKnown = leapSecondsKnown;
	}
	public boolean isClockFailure() {
		return ClockFailure;
	}
	public void setClockFailure(boolean clockFailure) {
		ClockFailure = clockFailure;
	}
	public boolean isClockNotSynchronized() {
		return ClockNotSynchronized;
	}
	public void setClockNotSynchronized(boolean clockNotSynchronized) {
		ClockNotSynchronized = clockNotSynchronized;
	}
	public CODED_ENUM getTimeAccuracy() {
		return TimeAccuracy;
	}
	public void setTimeAccuracy(CODED_ENUM timeAccuracy) {
		TimeAccuracy = timeAccuracy;
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
	
}
