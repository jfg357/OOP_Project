public class AudioPlayerDriver {
  public static void testAudioPlayer() {
    new AudioPlayer().play();
    new AudioPlayer().stop();
    new AudioPlayer().next();
    new AudioPlayer().previous();
    System.out.println(new AudioPlayer("iPod Mini", "MP3"));
    System.out.println(new AudioPlayer("Walkman", "WAV"));
  }
}
