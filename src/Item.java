/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
import java.util.*; // Need to import the Java Utilities to use builtin Date method

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
 * <p>This is a <a href="package-summary.html">interface class</a>
 *
 * @param <> the type of the input to the operation
 * @author Juan Gaviria
 * @code Product prod1 = new Device("Product Name");
 * @version 0.1
 * @serial
 * @since 0.1
 */

// Create the Item interface
public interface Item {

  // Declaration of the MANUFACTURER constant
  String MANUFACTURER = "OraclProduction"; // The final keyword is redundant in Interface
  String DEFAULTNAME = "Product Name"; // The final keyword is redundant in Interface

  String getName();

  Date getManufactureDate();

  void setProductionNumber(int pn);

  void setName(String name);

  int getSerialNumber();
}
