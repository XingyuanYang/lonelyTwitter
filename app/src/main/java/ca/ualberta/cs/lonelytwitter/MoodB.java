package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xy3 on 1/18/18.
 */

public class MoodB extends Mood {

    public MoodB () {
        super ();
    }


    public MoodB (Date date) {
        super();
    }


    @Override
    public String isGood() {
        return "Bad mood";
    }

}