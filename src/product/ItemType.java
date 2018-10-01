package product;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>Java Enum Type</h1>
 * The <b>Enum</b> type is a special data type that enables for a variable to be a set of predefined
 * constants. The variable must be equal to one of the values that have been predefined for it.
 * Because they are constants, the names of an enum type's fields are in uppercase letters.
 *
 * <p>This is a <a href="package-summary.html">enum class</a>
 *
 * @author Juan Gaviria
 * @version 0.2
 * @serial
 * @since 0.1
 */
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  String code;

  /**
   * @param code is the product line code
   */
  ItemType(String code) {
    this.code = code;
  }

  /**
   * @return {@code Type}
   */
  public String getCode() {
    return code;
  }
}