public class TV {
  int channel = 1;                                          // Default channel is 1 
  int volumeLevel = 1;                                      // Default volume is 1 
  boolean on = false;                                       // TV is off

  // Data Fields ↑↑

  public TV() {                                             // Constructor
  }

  public void turnOn() {                                    // Turn on TV
    on = true;
  }

  public void turnOff() {
    on = false;
  }

  //set of a new channel
  public void setChannel (int newChannel) {
    if (on && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  } 

  //set of a new volume
  public void setVolume (int newVolumeLV) {
    if (on && newVolumeLV >= 1 && newVolumeLV <= 7)
      volumeLevel = newVolumeLV;
  }

  //increase channel
  public void channelUp() {
    if (on && channel < 120)
    channel++;
  }

  //decrease channel
  public void channelDown() {
    if (on && channel > 1)
      channel--;
  }

  //increase volume
  public void volumeUp() {
    if (on && volumeLevel < 7)
    volumeLevel++;
  }

  //decrease volume
  public void volumeDown() {
    if (on && volumeLevel > 1)
    volumeLevel--;
  }
}