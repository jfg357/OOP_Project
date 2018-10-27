
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method

/**
 * <h1>Abstract Class Product</h1>
 * <ul>
 * <li>Cannot be instantiated.</li>
 * <li>Can be a subclass. If it does not provide implementations for all of the abstract methods,
 * then the subclass must also be declared abstract.</li>
 * <li>Can declare fields that are not static and final, and define public, protected, and private
 * concrete methods.</li>
 * <li>Abstract classes are similar to interfaces.</li>
 * </ul>
 *
 * <p>This is a <a href="package-summary.html">abstract class</a>
 * whose functional method is {@link #Product(String)}}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.1
 */

// Declaration of abstract class Product
public abstract class Product implements Item {

  /**
   * Returns a composed {@code Product}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Product} operation will not be performed.
   *
   */

  // Declaration of class variables
  private static int serialNumber;
  private static Date manufacturedOn;
  private static String name;
  private static int currentProductionNumber; // Need to keep track of total production

  // Implementation of Interface methods

  /**
   * @return {@code name}
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return {@code manufacturedOn}
   */
  @Override
  public Date getManufactureDate() {
    manufacturedOn = new java.util.Date();
    return manufacturedOn;
  }

  /**
   * @param name sets the name of the product
   */
  @Override
  public void setName(String name) {
    Product.name = name;
  }

  /**
   * @return the {@code serialNumber} for product
   */
  @Override
  public int getSerialNumber() {
    serialNumber = ++currentProductionNumber;
    return serialNumber;
  }

  /**
   * @param pn gets set with setter
   */
  @Override
  public void setProductionNumber(int pn) {
  }

  // Default Constructor
  public Product() {
    name = DEFAULTNAME;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }

  // Constructor with product name parameter of the String type

  /**
   *
   * @param name is the product line name
   */
  public Product(String name) {
    Product.name = name;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }

  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return "Manufacturer   : " + Product.MANUFACTURER +
        "\nSerial Number  : " + Product.serialNumber +
        "\nDate           : " + Product.manufacturedOn +
        "\nName           : " + Product.name;
  }

}
