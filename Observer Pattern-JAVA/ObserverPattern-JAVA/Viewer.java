/**
 * The Viewer class is an observer that can view the entries in the Entry class
 */
public class Viewer implements Observer
{
    private int counter = 2;
    /**
     * "If the entry is in the list, remove it."
     * 
     * The function is a bit more complicated than that, but that's the gist of it
     * 
     * @param entry The entry to be updated.
     */
    public void update(Entry entry)
    {
        int index = entry.eList.indexOf(entry);
        if (index >= 0 && index < entry.eList.size())
        {
            entry.eList.remove(index);
        }
    }
    /**
     * This function prints out the names of all the Visual objects in the Entry object's eList.
     * 
     * @param entry The entry you want to show the list of.
     */
    public void showList(Entry entry)
    {
        for(int i = 0; i < entry.eList.size(); i++)
        {
            if(entry.eList.get(i) instanceof Visual)
            {
                System.out.println(entry.eList.get(i).getName());
            }
        }
        
    }
    /**
     * > This function returns the current entry that the user is viewing
     * 
     * @param entry The entry that you want to view.
     * @return The current entry in the list.
     */
    public Entry currentViewing(Entry entry)
    {
        return entry.eList.get(counter);
    }
    /**
     * This function iterates through the EntryList of the Entry object passed in as a parameter, and
     * returns the next Entry object of the type specified by the inputType parameter
     * 
     * @param entry The entry that you want to iterate through
     * @param inputType The type of entry you want to get.
     * @return The next entry in the list that matches the input type.
     */
    public Entry next (Entry entry, String inputType)
    {
        while(counter < entry.eList.size()-1)
        {
            counter++;
            if(entry.eList.get(counter) instanceof ImageEntry)
            {
                ImageEntry image = (ImageEntry)entry.eList.get(counter);
                if(image.getType() == inputType)
                {
                    break;
                }
            }
            if(entry.eList.get(counter) instanceof TextEntry)
            {
                TextEntry text = (TextEntry)entry.eList.get(counter);
                if(text.getType() == inputType)
                {
                    break;
                }
            }
        }
        return entry.eList.get(counter);
    }
    /**
     * This function is used to find the previous entry of the same type as the current entry
     * 
     * @param entry The entry that the user is currently on.
     * @param inputType The type of entry you want to find.
     * @return The previous entry of the same type as the input type.
     */
    public Entry previous(Entry entry, String inputType)
    {
        while(counter < entry.eList.size()-1)
        {
            counter--;
            if(entry.eList.get(counter) instanceof ImageEntry)
            {
                ImageEntry image = (ImageEntry)entry.eList.get(counter);
                if(image.getType() == inputType)
                {
                    break;
                }
            }
            if(entry.eList.get(counter) instanceof TextEntry)
            {
                TextEntry text = (TextEntry)entry.eList.get(counter);
                if(text.getType() == inputType)
                {
                    break;
                }
            }
        }
        return entry.eList.get(counter);
    }
}