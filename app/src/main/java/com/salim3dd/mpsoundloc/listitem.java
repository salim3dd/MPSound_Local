package com.salim3dd.mpsoundloc;

/**
 * Created by Salim3DD on 11/12/2016.
 */

public class listitem {
    public String Title;
    public int img;
    public int sound;

    public listitem(String title, int img, int sound) {
        this.Title = title;
        this.img = img;
        this.sound = sound;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }
}
