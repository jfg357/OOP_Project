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

    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101",new Screen("720x480", 40,22), MonitorType.LCD);
    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768", 40,22), MonitorType.LED);

    mp1.next();
    mp1.play();
    mp1.previous();
    mp1.stop();

    System.out.println(mp1);
    System.out.println(mp2);

  }
}
