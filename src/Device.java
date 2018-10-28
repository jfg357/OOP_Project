/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>Device Class</h1>
 * The <b>Device</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #Device(String)}.
 *
 * @author Juan Gaviria
 * @version 0.1
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
   * @throws NullPointerException if {@code Device} is null
   */
  public Device() {
  }

  /**
   * Returns a composed {@code Device}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Device} operation will not be performed.
   *
   * @param name the operation to perform after this operation
   * @throws NullPointerException if {@code Device} is null
   */
  public Device(String name) {
    super(name);
  }

  /**
   * Compares this object with the specified object for order.  Returns a negative integer, zero, or
   * a positive integer as this object is less than, equal to, or greater than the specified
   * object.
   *
   * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
   * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This implies that
   * <tt>x.compareTo(y)</tt> must throw an exception iff
   * <tt>y.compareTo(x)</tt> throws an exception.)
   *
   * <p>The implementor must also ensure that the relation is transitive:
   * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
   * <tt>x.compareTo(z)&gt;0</tt>.
   *
   * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
   * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for all <tt>z</tt>.
   *
   * <p>It is strongly recommended, but <i>not</i> strictly required that
   * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
   * class that implements the <tt>Comparable</tt> interface and violates this condition should
   * clearly indicate this fact.  The recommended language is "Note: this class has a natural
   * ordering that is inconsistent with equals."
   *
   * <p>In the foregoing description, the notation
   * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
   * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
   * <tt>0</tt>, or <tt>1</tt> according to whether the value of
   * <i>expression</i> is negative, zero or positive.
   *
   * @param o the object to be compared.
   * @return a negative integer, zero, or a positive integer as this object is less than, equal to,
   * or greater than the specified object.
   * @throws NullPointerException if the specified object is null
   * @throws ClassCastException if the specified object's type prevents it from being compared to
   * this object.
   */
  @Override
  public int compareTo(Product o) {
    return 0;
  }
}
