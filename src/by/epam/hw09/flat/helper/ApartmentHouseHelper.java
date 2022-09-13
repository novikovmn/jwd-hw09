package by.epam.hw09.flat.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw09.flat.bean.Flat;

public class ApartmentHouseHelper {
	
	public List<Flat> createFlatsList(){
		List<Flat> flats = new ArrayList<>();
		
		flats.add(new Flat(1, 33.0, 2, 2, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(3, 56.0, 2, 3, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(5, 41.0, 1, 2, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(9, 27.0, 4, 1, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(11, 36.5, 6, 2, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(15, 66.0, 3, 4, "Lomonosov street", "Dwelling house", 150));
		flats.add(new Flat(4, 40.0, 5, 2, "Lomonosov street", "Dwelling house", 150));
		
		return flats;		
	}

}
