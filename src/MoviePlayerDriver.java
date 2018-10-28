/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>MoviePlayerDriver Class</h1>
 * The <b>MoviePlayerDriver</b> class extends the abstract class Product Unlike most other
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

//The MoviePlayerDriver class extends the Abstract Product Class.
public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    System.out.println("Playing");
    System.out.println("Stopping");
    System.out.println("Next");
    System.out.println("Previous");

    System.out.println(new MoviePlayer("DBPOWER MK101",new Screen("720x480", 40,22), MonitorType.LCD));
    System.out.println(new MoviePlayer("Pyle PDV156BK",new Screen("1366x768", 40,22), MonitorType.LED));

    new MoviePlayer().next();
    new MoviePlayer().play();
    new MoviePlayer().previous();
    new MoviePlayer().stop();

  }
}
