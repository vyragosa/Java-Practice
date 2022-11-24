package Practice32.Model.CustomerInfo;

import java.io.Serializable;

public final class Address implements Serializable {
	private final static Address EMPTY_ADDRESS = new Address(null, 0, null, 0, ' ', 0);
	private final String cityName;
	private final int zipCode;
	private final String streetName;
	private final int buildingNumber;
	private final char buildingLetter;
	private final int apartmentNumber;

	public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber) {
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.buildingLetter = buildingLetter;
		this.apartmentNumber = apartmentNumber;
	}

	public static Address getEmptyAddress() {
		return EMPTY_ADDRESS;
	}

	public String getCityName() {
		return cityName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public char getBuildingLetter() {
		return buildingLetter;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	@Override
	public String toString() {
		return "Адрес=[" +
				"Город='" + cityName + '\'' +
				", Индекс=" + zipCode +
				", Улица='" + streetName + '\'' +
				", Дом=" + buildingNumber +
				", Корпус=" + buildingLetter +
				", Квартира=" + apartmentNumber +
				']';
	}
}
