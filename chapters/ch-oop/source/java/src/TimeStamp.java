public class TimeStamp{

	private int SecondSinceEpoch;
	
	private int FractionOfSecond;

	private java.sql.Timestamp timeStamp;
	
	public TimeStamp(long arg0) {
		timeStamp = new java.sql.Timestamp(arg0);
	}


	public int getSecondSinceEpoch() {
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
	
}
