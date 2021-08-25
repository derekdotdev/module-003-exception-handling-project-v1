
public abstract class RadioStation implements RadioStationConstants {

	private int pickNumber;
	private double carrierFrequency;
	private String callSign;


	public RadioStation(int pickNumber, double carrierFrequency, String callSign) throws RadioStationException {
		super();
		this.pickNumber = pickNumber;
		int c = callSign.length();

		// Created overloaded Exceptions (just frequency or just call sign)
		// but couldn't wrap my brain around how to single out individual cases..
		// Tried switch methods, but couldn't get around the errors generated.
		// Didn't want numerous if statements to get it done, so it's all or none

		if (validFrequency(carrierFrequency) & c == CALL_SIGN_LENGTH) {
			this.carrierFrequency = carrierFrequency;
			this.callSign = callSign;
		} else {
			System.out.println();
			throw new RadioStationException(carrierFrequency, callSign);
		}
		System.out.println("Great! Station added successfully!\n");
	}


	private boolean validFrequency(double carrierFrequency) {
		return carrierFrequency >= MIN && carrierFrequency <= MAX;
	}

	public int getPickNumber() {
		return pickNumber;
	}

	public void setPickNumber(int pickNumber) {
		this.pickNumber = pickNumber;
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

	@Override
	public String toString() {
		String result = printStation();

		return result;
	}

	private String printStation() {
		return pickNumber + ") " + callSign + ": "
				+ carrierFrequency + " MHz";
	}
	

}

//stationValidity(choice, carrierFrequency, callSign);   //method call
//
//
//Method below
//
//
//public static void stationValidity(int choice, double carrierFrequency, String callSign)
//		throws RadioStationException {
//
//	switch (choice) {
//	case 0:
//		System.out.println("Invalid choices!");
//		throw new RadioStationException(carrierFrequency, callSign);
//	// break;
//	
//	case 2:
//		System.out.printf("\nError!The frequency should be from 88 to 108 (inclusive). You entered: %.2f",
//				carrierFrequency);
//		throw new RadioStationException(carrierFrequency, callSign);
//	// break;
//		
//	case 4:
//		System.out.printf("\nError! The call sign should contain four letters, you entered: %s", callSign.length());
//		throw new RadioStationException(carrierFrequency, callSign);
//	// break;
//	case 6:
//		System.out.println("Great! Station added successfully!\n");
//		break;
//
//	}
//}
