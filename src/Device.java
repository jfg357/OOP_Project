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
 * <h1>Device Class</h1>
 * The <b>Device</b> class extends the abstract class Product Unlike most other functional
 * interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #Device(String)}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @code Product prod1 = new Device("Product Name");
 * @serial
 * @since 0.1
 */

//The Device class extends the Abstract Product Class.

public class Device extends Product {

  /**
   * Returns a composed {@code Device}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Device} operation will not be performed.
   *
   * @return a composed {@code Device} that performs in sequence
   * @throws NullPointerException if {@code Device} is null
   */

  Device(){}

  /**
   * Returns a composed {@code Device}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Device} operation will not be performed.
   *
   * @param name the operation to perform after this operation
   * @return a composed {@code Device} that performs in sequence
   * @throws NullPointerException if {@code Device} is null
   */
  Device(String name) {
    super(name);
  }
}
