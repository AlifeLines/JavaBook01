public class Main {

    public static void main(String[] args) {
        TV tv_01 = new TV();
        tv_01.turnOn();
        tv_01.setChannel(30);
        tv_01.setVolumeTV(3);

        TV tv_02 = new TV();
        tv_02.turnOn();
        tv_02.ChannelUp();
        tv_02.ChannelUp();
        tv_02.VolumeUp();

        System.out.println("TV1:"+tv_01.channel+"  "+tv_01.volumeTV);
        System.out.println("TV2:"+tv_02.channel+"  "+tv_02.volumeTV);
    }
}
