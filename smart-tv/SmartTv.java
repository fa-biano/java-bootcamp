public class SmartTv {
    boolean isTurnedOn = false;
    int channel = 1;
    int volume = 25;
    
    public void turnOn() {
        isTurnedOn = true;
    }

    public void turnOff() {
        isTurnedOn = false;
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void increaseChannel() {
        channel++;
        System.out.println("Canal atual: " + channel);
    }

    public void decreaseChannel() {
        channel--;
        System.out.println("Canal atual: " + channel);
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Canal atual: " + channel);
    }
}