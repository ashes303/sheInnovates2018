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
    static String mess = "Messy";


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
            case "$mess":
                return mess;
        }
        return null;
    }
}