package product;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method

/**
 * <h1>Item Interface</h1>
 * Item Java <b>Interface</b> to improve rapid development The Interface is a group of related
 * methods with empty bodies.
 * <b>Interface</b> form a contract between the class and the outside world, and this
 * contract is enforced at build time by the compiler.
 * All methods defined by that interface must appear in its source code before the class will
 * successfully compile.
 *
 * <p>This is a <a href="package-summary.html">interface class</a></p>
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.1
 */

// Create the Item interface
public interface Item {

  // Declaration of the MANUFACTURER constant
  String MANUFACTURER = "OraclProduction"; // The final keyword is redundant in Interface
  String DEFAULTNAME = "Product Name"; // The final keyword is redundant in Interface

  /**
   * @return {@code Name}
   */
  String getName();

  /**
   * @return {@code date} formatted per assignment
   */
  Date getManufactureDate();

  /**
   *
   * @param pn should be retrieved from last operation
   */
  void setProductionNumber(int pn); // Need to add a way to track production number

  /**
   *
   * @param name to set the name of the product line
   */
  void setName(String name);

  /**
   * @return {@code serialNumber}
   */
  int getSerialNumber();
}
