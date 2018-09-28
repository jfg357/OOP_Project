import java.util.*;

/**
 *
 */
public class Product implements Item {

  private static int serialNumber;
  String manufacturer;
  private static Date manufacturedOn;
  private static String name;
  public static int currentProductionNumber;

  /**
   *
   * @return
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   *
   * @return
   */
  @Override
  public Date getManufactureDate() {
    manufacturedOn = new Date();
    return manufacturedOn;
  }

  /**
   *
   * @param serialNumber
   */
  @Override
  public void setProductionNumber(int serialNumber) {
    currentProductionNumber += 1;
  }

  /**
   *
   * @param name
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return
   */
  @Override
  public int getSerialNumber() {
    serialNumber = currentProductionNumber + 1;
    setProductionNumber(serialNumber);
    return serialNumber;
  }

  /**
   *
   * @param name
   */
  Product(String name) {
    this.name = name;
    this.serialNumber = getSerialNumber();
    this.manufacturedOn = getManufactureDate();
    this.manufacturer = MANUFACTURER;
  }

  /**
   *
   * @return
   */
  public String toString() {
    return "Manufacturer   : " + Product.MANUFACTURER +
        "\nSerial Number  : " + Product.serialNumber +
        "\nDate           : " + Product.manufacturedOn +
        "\nName           : " + Product.name;
  }

}
