package io.tracker.pk.models;

import lombok.Data;

@Data
public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPervDay;
	
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ ", diffFromPervDay=" + diffFromPervDay + "]";
	}
	
	
	
}
