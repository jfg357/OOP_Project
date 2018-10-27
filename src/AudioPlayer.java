/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * <h1>AudioPlayer Class</h1>
 * The <b>AudioPlayer</b> class extends the abstract class Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #AudioPlayer(String,String)}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @serial
 * @since 0.2
 */

//The Device class extends the Abstract Product Class.

public class AudioPlayer extends Product implements MultimediaControl {

  //  public String audioSpecification;
  private static String audioSpecification;
  private static ItemType mediaType;

  // default constructor needed to call the actions
  AudioPlayer() {
  }

  public AudioPlayer(String name, String audioSpecification) {
    super(name); // Call to 'super()' must be first statement in constructor body
    this.mediaType = ItemType.AUDIO;
    this.audioSpecification = audioSpecification;
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
        "\nAudio Spec     : " + AudioPlayer.audioSpecification +
        "\nType           : " + AudioPlayer.mediaType;
  }
}
