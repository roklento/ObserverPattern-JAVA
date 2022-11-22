import java.util.ArrayList;

public class Entry implements Subject
{
    ArrayList<Observer> oList;
    ArrayList<Entry> eList;
    private String name;

    protected Entry()
    {
        oList = new ArrayList<Observer>();
        eList = new ArrayList<Entry>();
    }
    protected Entry(String n)
    {
        name = n;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void add(Entry entry)
    {
        eList.add(entry);
    }
    public void attach (Observer observer)
    {
        oList.add(observer);
    }
    public void remove(Entry entry)
    {
        int i = eList.indexOf(entry);
            

        if(i >= 0 && i < eList.size())
        {
            
                eList.remove(i);
        }
        for (Observer observer : oList)
            observer.update(this);
        
    }
    
}