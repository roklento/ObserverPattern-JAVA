/**
 * TextEntry is a subclass of Entry that implements the NonPlayable and Visual interfaces
 */
public class TextEntry extends Entry implements NonPlayable, Visual
{
    private String type;
    private String infoString;
    public TextEntry(String n,String info)
    {
        super(n);
        type = "text";
        infoString = info;

    }
    public String getType()
    {
        return type;
    }
    /**
     * This function takes a string as an argument and returns a double
     * 
     * @param info The name of the dimension you want to get.
     * @return The result of the double.parseDouble method.
     */
    public double getDimension(String info)
    {
        double result = Double.parseDouble(infoString);
        return result;
    }
    public void textInfo()
    {
        System.out.println(getType());
        System.out.println(super.getName());
        System.out.println(getDimension(infoString));
    }
    public void info()
    {
        textInfo();
    }
}