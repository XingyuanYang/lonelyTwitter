package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    private ArrayList<Mood> moodList ;

    public Tweet(String message) {
        this.message = message;
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood> ();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant ();

    Mood happy = new MoodG();
    Mood sad = new MoodB();


    public void AddMode(Mood mood) {
        this.moodList.add (mood);
    }


}
