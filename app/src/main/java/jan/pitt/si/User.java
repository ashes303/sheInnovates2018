package jan.pitt.si;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by erino on 1/26/2018.
 */

public class User implements Serializable {
    protected String email;
    protected String password;
    protected String name;
    protected int gradyear; //expand to include upperclassmen later
    protected Gender gender;
    protected String profile;
    protected ArrayList<String> interests;
    protected Seeking seeking;
    protected int messy; //range from 1-4
    protected int risetime;
    protected int bedtime; //range from 0-23  (modular arithmetic)
    protected boolean onCampus;
    protected String imageAddress;


    /* other fields for later can include personality traits, attributes like studious/athletic/
    artsy etc.
     */
    public User (String e, String pass)
    {
        email = e;
        password = pass;
    }
    public void setName(String s) {
        name = s;
    }
    public void setGender (Gender g)
    {
        gender = g;
    }
    public void setSeeking (Seeking s)
    {
        seeking = s;
    }
    public void setRise (int time)
    {
        risetime = time;
    }
    public void setBed (int time)
    {
        bedtime = time;
    }
    public void setOnCampus (boolean on )
    {
        onCampus = on;
    }
    public void setMessy (int level)
    {
        messy = level;
    }
    public void setProfile (String words)
    {
        profile = words;
    }
    public void setInterest (String interest)
    {
        interests.add(interest);
    }
    public void setImage (String address)
    {
        imageAddress = address;
    }
    public void setGradYear (int year)
    {
        gradyear = year;
    }
}
 enum Gender implements Serializable
{
    MALE,
    FEMALE,
    OTHER
}
enum Seeking implements Serializable
{
    MALE,
    FEMALE,
    OTHER,
    ALL
}