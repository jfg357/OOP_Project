/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>Screen Class</h1>
 * The <b>Screen</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #Screen()}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

//The Device class extends the Abstract Product Class.
public class Screen implements ScreenSpec {

  private static String resolution;
  private static int refreshrate;
  private static int responsetime;

  public Screen(){}
  public Screen(String resolution, int refreshrate, int responsetime){

    setResolution(resolution);
    setRefreshRate(refreshrate);
    setResponseTime(responsetime);
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  private void setResolution(String resolution) {
    this.resolution = resolution;
  }

  private void setRefreshRate(int refreshrate) {
    this.refreshrate = refreshrate;
  }

  private void setResponseTime(int responsetime) {
    this.responsetime = responsetime;
  }

  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return "Resolution      : " + getResolution() +
        "\nRefresh rate   : " + getRefreshRate() +
        "\nResponse time  : " + getResponseTime();
  }
}
