package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xy3 on 1/18/18.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood () {
        this.date = new Date();
        this.mood = mood;

    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public abstract String isGood();

}
