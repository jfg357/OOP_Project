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
 *
 * @author Juan Gaviria
 * @version 0.3
 * @serial
 * @since 0.2
 */

//The MoviePlayerDriver class extends the Abstract Product Class.
public class PlayerDriver implements MultimediaControl{

  public static void testPlayer() {
    PlayerDriver player1 = new PlayerDriver();
    player1.play();
    player1.stop();
    player1.previous();
    player1.next();
  }

  @Override
  public void play () {
    System.out.println("Playing movie");
  }

  @Override
  public void stop () {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous () {
    System.out.println("Previous movie");
  }

  @Override
  public void next () {
    System.out.println("Next movie");
  }

}
