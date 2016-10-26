package com.hneu.model.scedule;

import java.util.Date;

/**
 * @author malex
 */
public class Week {

    private String name;

    private String displayName;

    private int day;

    private Date date;

    public Week() {
    }

    public Week(String name, String displayName, int day, Date date) {
        this.name = name;
        this.displayName = displayName;
        this.day = day;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
