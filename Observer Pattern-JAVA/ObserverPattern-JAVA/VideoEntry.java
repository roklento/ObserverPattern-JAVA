/**
 * VideoEntry is a subclass of Entry that implements Playable
 */
public class VideoEntry extends Entry implements Playable
{
    private String infoString1;
    private String type;
    public VideoEntry(String name,String info1)
    {
        super(name);
        infoString1 = info1;
        type = "video";
    }
    /**
     * This function takes a string as an argument and returns a double
     * 
     * @param infoString1 The string that contains the duration of the video.
     * @return The duration of the song.
     */
    public double getDuration(String infoString1)
    {
        double result = Double.parseDouble(infoString1);
        return result;
    }
    public String getType()
    {
        return type;
    }
    public void videoInfo()
    {
        System.out.println(getType());
        System.out.println(super.getName());
        System.out.println(getDuration(infoString1));
    }
    public void info()
    {
        videoInfo();
    }
}
