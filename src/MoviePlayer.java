/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>MoviePlayer Class</h1>
 * The <b>MoviePlayer</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #testMoviePlayer()}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

//The MoviePlayer class extends the Abstract Product Class.
public class MoviePlayer extends Product implements MultimediaControl{

  private static MonitorType monitorType;
  private static String screen;

  @Override
  public void play() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void previous() {

  }

  @Override
  public void next() {

  }
}
