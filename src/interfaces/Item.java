package interfaces;

import java.util.*;

public interface Item {
  String manufacturer = "OracleProduction";
  void setProductionNumber(int pn);
  void setName(String name);
  String getName();
  Date getManufactureDate();
  int getSerialNumber();

  public void pedalPress();

}
