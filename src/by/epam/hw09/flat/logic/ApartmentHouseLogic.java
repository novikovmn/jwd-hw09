package by.epam.hw09.flat.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw09.flat.bean.ApartmentHouse;
import by.epam.hw09.flat.bean.Flat;

public class ApartmentHouseLogic {
	
	public List<Flat> showFlatsByGivenNumberOfRooms(ApartmentHouse apartmentHouse, int roomCount){
		List<Flat> flats = apartmentHouse.getFlats();		
		List<Flat> result = new ArrayList<>();
		
		for (Flat flat : flats) {
			if (flat.getRoomCount() == roomCount) {
				result.add(flat);
			}
		}
		
		return result;
	}
	
	public List<Flat> showFlatsByGivenNumberOfRoomsAtLevelInRange (ApartmentHouse apartmentHouse, int roomCount, int fromLevel, int toLevel){
		List<Flat> flats = apartmentHouse.getFlats();
		List<Flat> result = new ArrayList<>();
		
		for (Flat flat : flats) {
			if (flat.getRoomCount() == roomCount) {
				if(flat.getLevel() >= fromLevel && flat.getLevel() <= toLevel) {
					result.add(flat);
				}
			}
		}
		
		return result;
	}
	
	
	public List<Flat> showFlatsWithAreaThatBiggerThanGivenOne (ApartmentHouse apartmentHouse, double flatArea){
		List<Flat> flats = apartmentHouse.getFlats();
		List<Flat> result = new ArrayList<>();
		
		for (Flat flat : flats) {
			if (flat.getFlatArea() > flatArea) {
				result.add(flat);
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	

}
