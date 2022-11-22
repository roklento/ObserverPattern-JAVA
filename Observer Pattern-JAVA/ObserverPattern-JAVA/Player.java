/**
 * The Player class implements the Observer interface and has methods to show the list of playable
 * entries, get the current playing entry, get the next entry, and get the previous entry
 */
public class Player implements Observer
{
    private int counter = 0;
    /**
     * "If the entry is in the list, remove it."
     * 
     * The first line of the function is a call to the indexOf() method of the ArrayList class. This
     * method returns the index of the entry in the list, or -1 if the entry is not in the list
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
    * This function takes in an Entry object and prints out the names of all the Playable objects in
    * the Entry's eList
    * 
    * @param entry The entry that you want to show the list of.
    */
    public void showList(Entry entry)
    {
        for(int i = 0; i < entry.eList.size(); i++)
        {
            if(entry.eList.get(i) instanceof Playable)
            {
                System.out.println(entry.eList.get(i).getName());
            }
        }
        
    }
    /**
     * This function returns the current playing entry
     * 
     * @param entry The entry that is currently playing.
     * @return The current playing song.
     */
    public Entry currentPlaying(Entry entry)
    {
        return entry.eList.get(counter);
    }
    /**
     * This function is used to iterate through the list of entries in the Entry class and return the
     * next entry of the type specified by the user
     * 
     * @param entry The entry that contains the list of entries
     * @param inputType The type of media you want to find.
     * @return The next entry in the list that matches the input type.
     */
    public Entry next (Entry entry, String inputType)
    {
        while(counter < entry.eList.size()-1)
        {
            counter++;
            if(entry.eList.get(counter) instanceof AudioEntry)
            {
                AudioEntry audio = (AudioEntry)entry.eList.get(counter);
                if(audio.getType() == inputType)
                {
                    break;   
                }
            }

            if(entry.eList.get(counter) instanceof VideoEntry)
            {
                VideoEntry video = (VideoEntry)entry.eList.get(counter);
                if(video.getType() == inputType)
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
     * @param inputType The type of media you want to play.
     * @return The previous entry of the same type as the input type.
     */
    public Entry previous(Entry entry, String inputType)
    {
        while(counter < entry.eList.size()-1)
        {
            counter--;
            if(entry.eList.get(counter) instanceof AudioEntry)
            {
                AudioEntry audio = (AudioEntry)entry.eList.get(counter);
                if(audio.getType() == inputType)
                {
                    break;
                }
            }
            if(entry.eList.get(counter) instanceof VideoEntry)
            {
                VideoEntry video = (VideoEntry)entry.eList.get(counter);
                if(video.getType() == inputType)
                {
                    break;
                }
            }
        }
        return entry.eList.get(counter);
    }
}