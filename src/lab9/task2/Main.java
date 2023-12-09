import java.util.ArrayList;

class House {

	private String location; // mandatory
    private int numFloors; // mandatory
    private int numRooms; // mandatory
    private boolean pool; // optional
    private boolean appliances; // optional
    private boolean solarPanels; // optional
    private String securityCompany; // optional

	// TODO: complete the private constructor
	private House(HouseBuilder builder) {

	}

	// TODO: generate getters


	// TODO: override toString method


	static class HouseBuilder {

		// TODO: write same facilities


		// TODO: complete the house builder constructor only with the mandatory facilities
		public HouseBuilder() {

		}

		// TODO: add the optional facilities in a builder design


		// TODO: complete the final build method
		public House build() {

			return null; // change this
		}

		// TODO: test functionality in a Main class
	}
}

class Main {
    private static String spacerSymbols = new String(new char[40]).replace("\0", "-");

    public static void main(String[] args) {
        String spacerSymbols = new String(new char[40]).replace("\0", "-");

        House house = new House.HouseBuilder("Piata Unirii", 3, 10)
                .pool(true)
                .securityCompany("POO_Security")
                .build();

        printOutputSpacerFor("testHouse");
        testHouse(house);
    }

    private static void printOutputSpacerFor(String test) {
        System.out.println(spacerSymbols + test + spacerSymbols);
    }

    private static void testHouse(House house) {
        System.out.println(house.getLocation());
        System.out.println(house.getNumFloors());
        System.out.println(house.getNumRooms());
        System.out.println(house.isPool());
        System.out.println(house.getSecurityCompany());
        System.out.println(house.isAppliances());
        System.out.println(house.isSolarPanels());
    }
}
