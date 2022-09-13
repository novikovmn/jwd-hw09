package by.epam.hw09.flat.main;

import by.epam.hw09.flat.bean.ApartmentHouse;
import by.epam.hw09.flat.helper.ApartmentHouseHelper;
import by.epam.hw09.flat.logic.ApartmentHouseLogic;
import by.epam.hw09.flat.view.ConsoleOutput;

/*
  Создайте класс Flat, спецификация которого приведена ниже. 
  Создайте второй класс, агрегирующий объекты типа Flat. 
  Определите подходящие методы для реализации этих классов. Задайте критерии выбора данных и выведите эти данные на консоль. 
  Flat: Номер квартиры, Площадь, Этаж, Количество комнат, Улица,Тип задния, Срок эксплуатации. 
		Найти и вывести: 
	a) список квартир, имеющих заданное количество комнат; 
	b) список квартир, имеющих заданное количество комнат и расположенных на этаже, который находится в заданном промежутке; 
	c) список квартир, имеющих площадь, превосходящую заданную.  
 */

public class Main {

	public static void main(String[] args) {
		
		ConsoleOutput output = new ConsoleOutput();
		
		ApartmentHouse apartmentHouse = 
				new ApartmentHouse(new ApartmentHouseHelper().createFlatsList());
		
		ApartmentHouseLogic apartmentHouseLogic = new ApartmentHouseLogic();
		
		
		System.out.println("\tAll flats:");
		output.printFlats(apartmentHouse.getFlats());
		
		System.out.println("================================================================================================================================\n");
		
		System.out.println("\tFlats by rooms and level:");
		output.printFlats(apartmentHouseLogic.showFlatsByGivenNumberOfRoomsAtLevelInRange(apartmentHouse, 4, 3, 6));
		
		System.out.println("================================================================================================================================\n");
		
		System.out.println("\tFlats with area, that bigger than given one:");
		output.printFlats(apartmentHouseLogic.showFlatsWithAreaThatBiggerThanGivenOne(apartmentHouse, 40.0));

	}

}
