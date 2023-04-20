public class LG extends TV
{
    int station = 0;
    public void on()
    {
        System.out.println("Turning on the LG TV");
    }
    public void off()
    {
        System.out.println("Turning off the LG TV");
    }
    public void tuneChannel(int channel)
    {
        this.station = channel;
        System.out.println("Set the LG TV Channel to "+ this.station);
    }
    public int getChannel()
    {
        return station;
    }
}