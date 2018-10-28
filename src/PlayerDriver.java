/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>PlayerDriver Class</h1>
 * The <b>PlayerDriver</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #testPlayer()}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

//The MoviePlayerDriver class extends the Abstract Product Class.
public class PlayerDriver implements MultimediaControl{

  private static String mediaType;

  public void testPlayer() {
    mediaType = "movie";
    next();
    play();
    previous();
    stop();
  }

  @Override
  public void play () {
    System.out.println("Playing" + mediaType);
  }

  @Override
  public void stop () {
    System.out.println("Stopping " + mediaType);
  }

  @Override
  public void previous () {
    System.out.println("Previous " + mediaType);
  }

  @Override
  public void next () {
    System.out.println("Next " + mediaType);
  }
}
