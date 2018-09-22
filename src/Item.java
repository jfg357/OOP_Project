import java.util.*;

public interface Item {
  String manufacturer = "OracleProduction";
  String getName();
  Date getManufactureDate();

  void setProductionNumber(int pn);
  void setName(String name);
  int getSerialNumber();

  public void pedalPress();

}
