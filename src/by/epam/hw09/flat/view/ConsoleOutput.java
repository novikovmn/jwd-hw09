package by.epam.hw09.flat.view;

import java.util.List;

import by.epam.hw09.flat.bean.Flat;

public class ConsoleOutput {

	public void printFlats(List<Flat> flats) {

		System.out.println(" _______________________________________________________________________________________________________________________________________________________");
		System.out.print("|\t№\t|\tArea\t|\tLevel\t|\tRooms\t|\t\tStreet\t\t|\tBuilding type\t|\tBuilding lifespan\t|\n");
		System.out.println("|_______________________________________________________________________________________________________________________________________________________|");
		
		for (Flat flat : flats) {
			System.out.printf("|\t%d\t|\t%.1f\t|\t%d\t|\t%d\t|\t%s\t|\t%s\t|\t\t%s\t\t|\n", flat.getFlatNumber(), flat.getFlatArea(), flat.getLevel(), flat.getRoomCount(),
					flat.getStreetName(), flat.getBuildingType(), flat.getBuildingLifespan());
		}
		
		System.out.println("|_______________________________________________________________________________________________________________________________________________________|\n");
	}

}
