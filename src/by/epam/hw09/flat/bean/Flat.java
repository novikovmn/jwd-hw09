package by.epam.hw09.flat.bean;

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable {

	private static final long serialVersionUID = 3133633033466468108L;

	private int flatNumber;
	private double flatArea;
	private int level;
	private int roomCount;
	private String streetName;
	private String buildingType;
	private int buildingLifespanYears;

	public Flat() {
	}

	public Flat(int flatNumber, double flatArea, int level, int roomCount, String streetName, String buildingType,
			int buildingLifespan) {
		this.flatNumber = flatNumber;
		this.flatArea = flatArea;
		this.level = level;
		this.roomCount = roomCount;
		this.streetName = streetName;
		this.buildingType = buildingType;
		this.buildingLifespanYears = buildingLifespan;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public double getFlatArea() {
		return flatArea;
	}

	public void setFlatArea(double flatArea) {
		this.flatArea = flatArea;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public int getBuildingLifespan() {
		return buildingLifespanYears;
	}

	public void setBuildingLifespan(int buildingLifespan) {
		this.buildingLifespanYears = buildingLifespan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(buildingLifespanYears, buildingType, flatArea, flatNumber, level, roomCount, streetName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return buildingLifespanYears == other.buildingLifespanYears && Objects.equals(buildingType, other.buildingType)
				&& Double.doubleToLongBits(flatArea) == Double.doubleToLongBits(other.flatArea)
				&& flatNumber == other.flatNumber && level == other.level && roomCount == other.roomCount
				&& Objects.equals(streetName, other.streetName);
	}

	@Override
	public String toString() {
		return "Flat [flatNumber=" + flatNumber + ", flatArea=" + flatArea + ", level=" + level + ", roomCount="
				+ roomCount + ", streetName=" + streetName + ", buildingType=" + buildingType + ", buildingLifespan="
				+ buildingLifespanYears + "]";
	}

}
