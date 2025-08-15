package farhan.experiments;

public class UberDriver {
	private String dName;
	private int dRating;
	private String dVehicleDetails;

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdRating() {
		return dRating;
	}

	public void setdRating(int dRating) {
		if (dRating <= 5 && dRating >= 0)
			this.dRating = dRating;
		else
			System.out.println("invalid rating");
	}

	public String getdVehicleDetails() {
		return dVehicleDetails;
	}

	public void setdVehicleDetails(String dVehicleDetails) {
		this.dVehicleDetails = dVehicleDetails;
	}
}
