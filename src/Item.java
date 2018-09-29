/**
 * <h1>Item Interface</h1>
 * Item Java <b>Interface</b> to improve rapid development The Interface is a group of related
 * methods with empty bodies.
 * <p></p>
 * <b>Interface</b> form a contract between the class and the outside world, and this
 * contract is enforced at build time by the compiler.
 * <p></p>
 * All methods defined by that interface must appear in its source code before the class will
 * successfully compile.
 *
 * @author Juan Gaviria
 * @code public abstract class Product implements Item{}
 * @version 0.1
 * @serial
 * @since 2018-09-20
 */

// Need to import the Java Utilities to use builtin Date method

import java.util.*;

// Create the Item interface
public interface Item {

  // Declaration of the MANUFACTURER constant
  String MANUFACTURER = "OracleProduction"; // The final keyword is redundant in Interface

  String getName();

  Date getManufactureDate();

  void setProductionNumber(int pn);

  void setName(String name);

  int getSerialNumber();
}
