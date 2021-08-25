
public class RadioStationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6453584799026632738L;
	private double carrierFrequency;
	private String callSign;

	public RadioStationException() {
		System.out.println("RadioStationException with no params");
	}

	public RadioStationException(String callSign) {
		int c = callSign.length();
		System.out.printf("\nThe call sign should contain four letters, you entered: %d\n", c);
	}

	public RadioStationException(double carrierFrequency) {
		System.out.printf("\nThe frequency should be from 88 to 108 (inclusive). You entered: %.1f\n",
				carrierFrequency);
	}

	public RadioStationException(double carrierFrequency, String callSign) {
		// this.callSign = callSign;
		// this.carrierFrequency = carrierFrequency;
		int c = callSign.length();
		System.out.println("ERROR!");
		System.out.printf("\nThe frequency should be from 88 to 108 (inclusive). You entered: %.1f\n",
				carrierFrequency);
		System.out.printf("\nThe call sign should contain four letters, you entered: %d\n", c);
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public double getCarrierFrequency() {
		return carrierFrequency;
	}

	public void setCarrierFrequency(double carrierFrequency) {
		this.carrierFrequency = carrierFrequency;
	}

}