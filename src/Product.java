import java.util.*;

public class Product implements Item {

  private static int serialNumber;
  String manufacturer;
  private static Date manufacturedOn;
  private static String name;
  public static int currentProductionNumber;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    manufacturedOn = new Date();
    return manufacturedOn;
  }

  @Override
  public void setProductionNumber(int serialNumber) {
    currentProductionNumber += 1;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getSerialNumber() {
    serialNumber = currentProductionNumber + 1;
    setProductionNumber(serialNumber);
    return serialNumber;
  }

  Product(String name) {
    this.name = name;
    this.serialNumber = getSerialNumber();
    this.manufacturedOn = getManufactureDate();
    this.manufacturer = MANUFACTURER;
  }

  public String toString() {
    return "Manufacturer   : " + Product.MANUFACTURER +
        "\nSerial Number  : " + Product.serialNumber +
        "\nDate           : " + Product.manufacturedOn +
        "\nName           : " + Product.name;
  }

}
