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

/**
 * <h1>Java Enum Type</h1>
 * The <b>Enum</b> type is a special data type that enables for a variable to be a set of predefined
 * constants. The variable must be equal to one of the values that have been predefined for it.
 * <p></p>
 * Because they are constants, the names of an enum type's fields are in uppercase letters.
 *
 * <p>This is a <a href="package-summary.html">enum class</a>
 *
 * @author Juan Gaviria
 * @code Product prod1 = new Device("Product Name");
 * @version 0.1
 * @serial
 * @since 0.1
 */
public enum ItemType {
  Audio("AU"), AudioMobile("AM"), Visual("VI"), VisualMobile("VM");

  private String type;

  ItemType(String name) {
    this.type = name;
  }

  public String getName() {
    return type;
  }
}