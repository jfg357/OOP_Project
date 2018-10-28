
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
public abstract class Product implements Item, Comparable<Product> {

  /**
   * Returns a composed {@code Product}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Product} operation will not be performed.
   *
   */

  // Declaration of class variables
  private int serialNumber;
  private Date manufacturedOn;
  private String name;
  private static int currentProductionNumber = -4; // Need to keep track of total production

  // Implementation of Interface methods

  /**
   * @return {@code name}
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * @return {@code manufacturedOn}
   */
  @Override
  public Date getManufactureDate() {
    this.manufacturedOn = new java.util.Date();
    return this.manufacturedOn;
  }

  /**
   * @param name sets the name of the product
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the {@code serialNumber} for product
   */
  @Override
  public int getSerialNumber() {
    this.serialNumber = ++currentProductionNumber;
    return this.serialNumber;
  }

  /**
   * @param pn gets set with setter
   */
  @Override
  public void setProductionNumber(int pn) {
  }

  // Default Constructor
  public Product() {
    this.name = DEFAULTNAME;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }

  // Constructor with product name parameter of the String type

  /**
   *
   * @param name is the product line name
   */
  public Product(String name) {
    this.name = name;
    serialNumber = getSerialNumber();
    manufacturedOn = getManufactureDate();
  }


  /*Comparator for sorting the list by Product Name*/
  public static Comparator<Product> prodNameComp = new Comparator<Product>() {

    /**
     * Compares its two arguments for order.  Returns a negative integer, zero, or a positive
     * integer as the first argument is less than, equal to, or greater than the second.<p>
     *
     * In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.<p>
     *
     * The implementor must ensure that <tt>sgn(compare(x, y)) == -sgn(compare(y, x))</tt> for
     * all <tt>x</tt> and <tt>y</tt>.  (This implies that <tt>compare(x, y)</tt> must throw an
     * exception if and only if <tt>compare(y, x)</tt> throws an exception.)<p>
     *
     * The implementor must also ensure that the relation is transitive:
     * <tt>((compare(x, y)&gt;0) &amp;&amp; (compare(y, z)&gt;0))</tt> implies
     * <tt>compare(x, z)&gt;0</tt>.<p>
     *
     * Finally, the implementor must ensure that <tt>compare(x, y)==0</tt> implies that
     * <tt>sgn(compare(x, z))==sgn(compare(y, z))</tt> for all
     * <tt>z</tt>.<p>
     *
     * It is generally the case, but <i>not</i> strictly required that
     * <tt>(compare(x, y)==0) == (x.equals(y))</tt>.  Generally speaking,
     * any comparator that violates this condition should clearly indicate this fact.  The
     * recommended language is "Note: this comparator imposes orderings that are inconsistent
     * with equals."
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument is less
     * than, equal to, or greater than the second.
     * @throws NullPointerException if an argument is null and this comparator does not permit
     * null arguments
     * @throws ClassCastException if the arguments' types prevent them from being compared by
     * this comparator.
     */
    @Override
    public int compare(Product o1, Product o2) {
      String prodName1 = o1.getName().toLowerCase();
      String prodName2 = o2.getName().toLowerCase();
      return prodName1.compareTo(prodName2);
    }
  };

  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return "Manufacturer : " + Product.MANUFACTURER +
        "\nSerial Number : " + getSerialNumber() +
        "\nDate : " + getManufactureDate() +
        "\nName : " + getName();
  }

}
