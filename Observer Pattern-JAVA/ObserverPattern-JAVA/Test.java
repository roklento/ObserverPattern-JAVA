class Test
{
    public static void main(String[] args)
    {   

        // Creating a new object of the Entry class.
        Entry entry = new Entry();


        // Creating new objects of the Player and Viewer classes.
        Player p1 = new Player();
        Player p2 = new Player();
        Viewer v1 = new Viewer();
        Viewer v2 = new Viewer();

        // Adding the observers to the observable.
        entry.attach(p1);
        entry.attach(p2);
        entry.attach(v1);
        entry.attach(v2);

        // Adding the entries to the observable.
        entry.add(new VideoEntry("video1","100"));
        entry.add(new VideoEntry("video2","100"));
        entry.add(new VideoEntry("video3","100"));


        entry.add(new AudioEntry("audio1","234"));
        entry.add(new AudioEntry("audio2","235"));
        entry.add(new AudioEntry("audio3","235"));

        entry.add(new ImageEntry("image1", "12.32"));
        entry.add(new ImageEntry("image2", "12.33"));
        entry.add(new ImageEntry("image3", "12.33"));

        entry.add(new TextEntry("text1", "23.3"));
        entry.add(new TextEntry("text2", "244.43"));
        entry.add(new TextEntry("text3", "244.43"));
        
        // Checking the type of the object in the list and printing the info of the object.
        for (int i = 0; i < entry.eList.size();i++)
        {
            if(entry.eList.get(i) instanceof VideoEntry)
            {
                System.out.println("--VIDEO--");
                VideoEntry video = (VideoEntry)entry.eList.get(i);
                video.videoInfo();
            }
            if(entry.eList.get(i) instanceof AudioEntry)
            {
                System.out.println("--AUDIO--");
                AudioEntry audio = (AudioEntry)entry.eList.get(i);
                audio.audioInfo();
            }
            if(entry.eList.get(i) instanceof ImageEntry)
            {
                System.out.println("--IMAGE--");
                ImageEntry image = (ImageEntry)entry.eList.get(i);
                image.info();
            }
            if(entry.eList.get(i) instanceof TextEntry)
            {
                System.out.println("--TEXT--");
                TextEntry text = (TextEntry)entry.eList.get(i);
                text.info();
            }  
        }

        // Checking the type of the object in the list and printing the info of the object.
        for(int i = 0; i < entry.eList.size(); i++)
        {
            if(entry.eList.get(i) instanceof Playable)
            {
                System.out.println("--PLAYABLE--");
                Playable playable = (Playable)entry.eList.get(i);
                
                playable.info();
            }
            if(entry.eList.get(i) instanceof Visual)
            {
                System.out.println("--VISUAL--");
                Visual visual = (Visual)entry.eList.get(i);
                
                visual.info();
            }
        }
        
       // Checking if the currentPlaying method of the Player class returns an object of the Playable
       // class. If it does, it prints the info of the object. Then it calls the next method of the
       // Player class and prints the info of the object. Then it removes the object from the list and
       // prints the updated list of the Player class. Then it calls the next method of the Player
       // class and prints the info of the object. Then it calls the previous method of the Player
       // class and prints the info of the object. Then it removes the object from the list and prints
       // the updated list of the Player class.
        if(p1.currentPlaying(entry) instanceof Playable)
        {
            System.out.println("--p1--");
            Playable po = (Playable)p1.currentPlaying(entry);
            System.out.println("---currentplaying---");
            po.info();

            System.out.println("---next---");
            p1.next(entry,"video");
            po = (Playable)p1.currentPlaying(entry);
            po.info();

            entry.remove((Entry)po);
            System.out.println("current_playing has been removed and playlists has been updated...");
            System.out.println("----Player list1------");
            p1.showList(entry);
            System.out.println("----Player list2------");
            p2.showList(entry);

            System.out.println("---next---");
            p1.next(entry,"audio");
            po = (Playable)p1.currentPlaying(entry);
            po.info();

            System.out.println("---previous---");
            p1.previous(entry, "video");
            po = (Playable)p1.currentPlaying(entry);
            po.info();

            entry.remove((Entry)po);
            System.out.println("current_playing has been removed and playlists has been updated...");
            System.out.println("----Player list1------");
            p1.showList(entry);
            System.out.println("----Player list2------");
            p2.showList(entry);

        }
        // Checking if the currentPlaying method of the Player class returns an object of the Playable
        //        class. If it does, it prints the info of the object. Then it calls the next method of
        // the
        //        Player class and prints the info of the object. Then it removes the object from the
        // list and
        //        prints the updated list of the Player class. Then it calls the next method of the
        // Player
        //        class and prints the info of the object. Then it calls the previous method of the
        // Player
        //        class and prints the info of the object. Then it removes the object from the list and
        // prints
        //        the updated list of the Player class.
        if(p2.currentPlaying(entry) instanceof Playable)
        {
            System.out.println("--p2--");
            Playable poo = (Playable)p2.currentPlaying(entry);
            System.out.println("---currentplaying---");
            poo.info();

            System.out.println("---next---");
            p2.next(entry,"audio");
            poo = (Playable)p2.currentPlaying(entry);
            poo.info();

            entry.remove((Entry)poo);
            System.out.println("current_playing has been removed and playlists has been updated...");
            System.out.println("----Player list1------");
            p1.showList(entry);
            System.out.println("----Player list2------");
            p2.showList(entry);

            System.out.println("---next---");
            p2.next(entry,"audio");
            poo = (Playable)p2.currentPlaying(entry);
            poo.info();

            System.out.println("---previous---");
            p2.previous(entry, "video");
            poo = (Playable)p2.currentPlaying(entry);
            poo.info();

            entry.remove((Entry)poo);
            System.out.println("current_playing has been removed and playlists has been updated...");
            System.out.println("----Player list1------");
            p1.showList(entry);
            System.out.println("----Player list2------");
            p2.showList(entry);
        }
        // Checking if the currentViewing method of the Viewer class returns an object of the
        // Visual class. If it does, it prints the info of the object. Then it calls the next method of
        // the
        // Viewer class and prints the info of the object. Then it removes the object from the list and
        // prints
        // the updated list of the Viewer class. Then it calls the next method of the Viewer class and
        // prints
        // the info of the object. Then it removes the object from the list and prints the updated list
        // of the
        // Viewer class.
        if(v1.currentViewing(entry) instanceof Visual)
        {
            System.out.println("--v1--");
            Visual vo = (Visual)v1.currentViewing(entry);
            System.out.println("---currentviewing---");
            vo.info();

            System.out.println("---next---");
            v1.next(entry,"image");
            vo = (Visual)v1.currentViewing(entry);
            vo.info();

            entry.remove((Entry)vo);
            System.out.println("current_viewing has been removed and playlists has been updated...");
            System.out.println("----Viewer list1------");
            v1.showList(entry);
            System.out.println("----Viewer list2------");
            v2.showList(entry);

            System.out.println("---next---");
            v1.next(entry,"text");
            vo = (Visual)v1.currentViewing(entry);
            vo.info();

            entry.remove((Entry)vo);
            System.out.println("current_viewing has been removed and playlists has been updated...");
            System.out.println("----Viewer list1------");
            v1.showList(entry);
            System.out.println("----Viewer list2------");
            v2.showList(entry);
        }

        // Checking if the currentViewing method of the Viewer class returns an object of the
        // Visual class. If it does, it prints the info of the object. Then it calls the next method of
        // the
        // Viewer class and prints the info of the object. Then it removes the object from the list and
        // prints
        // the updated list of the Viewer class. Then it calls the next method of the Viewer class and
        // prints
        // the info of the object. Then it removes the object from the list and prints the updated list
        // of the
        // Viewer class.
        if(v2.currentViewing(entry) instanceof Visual)
        {
            System.out.println("--v2--");
            Visual voo = (Visual)v2.currentViewing(entry);
            System.out.println("---currentviewing---");
            voo.info();

            System.out.println("---next---");
            v2.next(entry,"image");
            voo = (Visual)v2.currentViewing(entry);
            voo.info();

            entry.remove((Entry)voo);
            System.out.println("current_viewing has been removed and playlists has been updated...");
            System.out.println("----Viewer list1------");
            v1.showList(entry);
            System.out.println("----Viewer list2------");
            v2.showList(entry);

            System.out.println("---next---");
            v2.next(entry,"text");
            voo = (Visual)v2.currentViewing(entry);
            voo.info();

            entry.remove((Entry)voo);
            System.out.println("current_viewing has been removed and playlists has been updated...");
            System.out.println("----Viewer list1------");
            v1.showList(entry);
            System.out.println("----Viewer list2------");
            v2.showList(entry);
        }
    }
}