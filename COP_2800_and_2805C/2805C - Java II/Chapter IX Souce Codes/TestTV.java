public class TestTV {
  public static void main(String[] args) {      // Main Method
    TV tv1 = new TV();                          // Create TV1
    tv1.turnOn();                               // Turn on
    tv1.setChannel(30);                        // set a new channel
    tv1.setVolume(3);                           // set a new volume

    TV tv2 = new TV();                          // Create TV2
    tv2.turnOn();                               // Turn on
    tv2.channelUp();                            // increase channels
    tv2.channelUp();
    tv2.volumeUp();                             // increase volume

    //Display States for both TV1 & TV2
    System.out.println("TV 1's channel is " + tv1.channel + " and the volume level is " + tv1.volumeLevel);

    System.out.println("TV 2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);


  }
}
