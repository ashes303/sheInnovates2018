package jan.pitt.si;

/**
 * Created by Alex on 1/27/18.
 */

public class Attributes {
    static String earl = "Early Riser";
    static String late = "Late to bed";
    static String athl = "Athletic";
    static String loud = "Loud";
    static String quiet = "Prefers Silence";
    static String stud = "Studious";
    //range from 1-4
    static String mess = "Messy";
    static String pets = "Pet owner";
    static String dogs = "Dog lover";
    static String trav = "World traveller";
    static String tidy = "Tidy";

    public static String attribute(String s) {
        switch (s) {
            case "$earl":
                return earl;
            case "$late":
                return late;
            case "$athl":
                return athl;
            case "$loud":
                return loud;
            case "$quiet":
                return quiet;
            case "$stud":
                return stud;
            case "$pets":
                return pets;
            case "$dogs":
                return dogs;
            case "$trav":
                return trav;
            case "$tidy":
                return tidy;
        }

        return null;
    }

}


