/*
 * Author: Juan Gaviria
 * Item Java Interface to improve rapid development
 * The Interface is a group of related methods with empty bodies.
 * Interfaces form a contract between the class and the outside world, and this contract is enforced
 * at build time by the compiler. All methods defined by that interface must appear in its source
 * code before the class will successfully compile.
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method

public interface Item { // Create the Item interface

  // Declaration of the
  final String MANUFACTURER = "OracleProduction";

  String getName();

  Date getManufactureDate();

  void setProductionNumber(int pn);

  void setName(String name);

  int getSerialNumber();


}
