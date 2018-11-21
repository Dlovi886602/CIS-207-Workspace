
public class Players {
	private String name;
	private double battingAvg;
	private double era;

	public Players(String name, double battingAvg) {
		this.name = name;
		this.battingAvg = battingAvg;
	}

	public Players(String name, double era, String holder) {
		this.name = name;
		this.era = era;
	}

	public String getName() {
		return name;
	}
	
	public double getAvg() {
		return battingAvg;
	}
	
	public double getEra() {
		return era;
	}
}
