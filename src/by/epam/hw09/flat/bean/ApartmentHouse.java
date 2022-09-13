package by.epam.hw09.flat.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApartmentHouse implements Serializable{

	private static final long serialVersionUID = 5346828525807810141L;
	
	private List<Flat> flats;

	public ApartmentHouse() {
		flats = new ArrayList<>();
	}

	public ApartmentHouse(List<Flat> flats) {
		this.flats = flats;
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApartmentHouse other = (ApartmentHouse) obj;
		return Objects.equals(flats, other.flats);
	}

	@Override
	public String toString() {
		return "ApartmentHouse [flats=" + flats + "]";
	}

}
