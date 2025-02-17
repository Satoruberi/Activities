package com.lunacian.materialmedemo;


public class Sport {
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;

    private final int imageResource;
    /** Constructor for the Sport data model.
     * @param title The name if the sport.
     * @param info Information about the sport.     */
    Sport(String title, String info, int num) {
        this.title = title;
        this.info = info;
        imageResource = num;
    }
    /** Gets the title of the sport.
     * @return The title of the sport.    */
    String getTitle() {
        return title;
    }

    /**Gets the info about the sport.
     * @return The info about the sport.  */
    String getInfo() {
        return info;
    }

    public int getImageResource(){
        return imageResource;
    }
}





