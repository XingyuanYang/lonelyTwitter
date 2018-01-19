package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xy3 on 1/18/18.
 */

public class MoodG extends Mood {


    public MoodG (Date date) {
        super();
    }

    public MoodG () {
        super ();
    }


    @Override
    public String isGood () {
        return "Good Mood";
    }
}


