/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*;

/**
 * <h1>MoviePlayer Class</h1>
 * The <b>MoviePlayer</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #MoviePlayer()}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

//The MoviePlayer class extends the Abstract Product Class.
public class MoviePlayer extends Product implements MultimediaControl{

  private Screen screen;
  private MonitorType monitorType;

  MoviePlayer(){}

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name); // Call to 'super()' must be first statement in constructor body
    this.screen = new Screen();
    this.monitorType = monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }


  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return super.toString() +
        "\nScreen : " + this.screen +
        "\nMonitor Type : " + this.monitorType;
  }
}
