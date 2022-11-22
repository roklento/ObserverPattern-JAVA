/**
 * The ImageEntry class is a subclass of the Entry class and implements the Visual and NonPlayable
 * interfaces
 */
public class ImageEntry extends Entry implements Visual, NonPlayable
{
    private String infoString;
    private String type;
    // The constructor for the ImageEntry class. It is calling the constructor of the superclass Entry
    // and setting the infoString and type variables.
    public ImageEntry(String n,String info)
    {
        super(n);
        infoString = info;
        type = "image";
    }
    /**
     * It takes a string, converts it to a double, and returns the double
     * 
     * @param infosString the string that contains the information about the dimension
     * @return The result of the double.parseDouble method.
     */
    public double getDimension(String infosString)
    {
        double result = Double.parseDouble(infosString);
        return result;
    }
    public String getType()
    {
        return type;
    }
    public void imageInfo()
    {
        System.out.println(getType());
        System.out.println(super.getName());
        System.out.println(getDimension(infoString));
    }

    public void info()
    {
        imageInfo();
    }
}