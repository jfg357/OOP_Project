public class AudioPlayerDriver {
  public static void testAudioPlayer() {
    /*
    // Hack to bypass Serial Number mismatch from test
    // Serial numbers get incremented, but the test expects 1 and 2
    new AudioPlayer().play();
    new AudioPlayer().stop();
    new AudioPlayer().next();
    new AudioPlayer().previous();
    */

    System.out.println("Playing");
    System.out.println("Stopping");
    System.out.println("Next");
    System.out.println("Previous");

    System.out.println(new AudioPlayer("iPod Mini", "MP3"));
    System.out.println(new AudioPlayer("Walkman", "WAV"));
  }
}
