public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.isTurnedOn);
        System.out.println("Canal Atual? " + smartTv.channel);
        System.out.println("Volume Atual? " + smartTv.volume);
        
        smartTv.turnOn();
        System.out.println("TV ligada? " + smartTv.isTurnedOn);
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.setChannel(5);
    }
}