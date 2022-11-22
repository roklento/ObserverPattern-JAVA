
/**
 * It's a subclass of Entry that implements the Playable and NonVisual interfaces
 */
public class AudioEntry extends Entry implements Playable, NonVisual
{
    private String infoString;
    private String type;
    // It's a constructor that takes in a name and info and sets the name to the name passed in and the
    // info to the info passed in.
    public AudioEntry(String name,String info)
    {
        super(name);
        infoString = info;
        type = "audio";

    }
    /**
     * This function takes a string as input and returns a double.
     * 
     * @param infoString The string that contains the information you want to extract.
     * @return The duration of the song.
     */
    public double getDuration(String infoString)
    {
        double result = Double.parseDouble(infoString);
        return result;
    }
    /**
     * This function returns the type of the object.
     * 
     * @return The type of the object.
     */
    public String getType()
    {
        return type;
    }
    /**
     * This function prints out the type of the file, the name of the file, and the duration of the
     * file
     */
    public void audioInfo()
    {
        System.out.println(getType());
        System.out.println(super.getName());
        System.out.println(getDuration(infoString));
    }

    public void info()
    {
        audioInfo();
    }
}