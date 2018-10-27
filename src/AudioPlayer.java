public class AudioPlayer extends Product implements MultimediaControl {

//  public String audioSpecification;
  private static String audioSpecification;
  private static ItemType mediaType;


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
